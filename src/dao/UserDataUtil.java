package dao;

import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import dao.alldo.*;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * @author yu
 */
public class UserDataUtil {
    /**
     * add a member into the xml to store
     *
     * @param user a DO of a user in the gym
     * @return true when success, false when fail
     */
    public static boolean addUser(UserDO user) {


        try {

            SAXReader reader = new SAXReader();

            File xmlFile = null;
            int type; //use to record the type of the user

            if(user.getClass() == MemberDO.class) {
                type = 0;
            }
            else if(user.getClass() == TrainerDO.class){
                type = 1;
            }
            else if(user.getClass() == AdminDO.class){
                type = 2;
            }
            else if(user.getClass() == PromoterDO.class){
                type = 3;
            }
            else{
                type = -1;
                System.out.println("Not a correct type of user!");
                return false;
            }

            xmlFile = new File(UserTypeEnum.getPos(type));

            Document doc = reader.read(xmlFile);

            Element root = doc.getRootElement();

            Element newElement = root.addElement(UserTypeEnum.getName(type));

            newElement.addAttribute("id", user.getId());
            newElement.addAttribute("password", user.getPassword());
            newElement.addAttribute("name", user.getName());
            newElement.addAttribute("phoneNumber", user.getPhoneNumber());
            newElement.addAttribute("info", user.getInfo());
            newElement.addAttribute("age",user.getAge());
            newElement.addAttribute("gender",user.getGender());


            if(type == 0) {
                //if we want to add a member
                MemberDO member = (MemberDO) user;
                newElement.addAttribute("type", member.getType());
                newElement.addAttribute("email", member.getEmail());
                newElement.addAttribute("balance", member.getBalance());
            }
            else if(type == 1){
                //if we want to add a trainer
//                TrainerDO trainer = (TrainerDO) user;
//                String allClass = "";
//                for(String c : trainer.getClassSet()){
//                    allClass = allClass + c + "|";
//                }
//                newElement.addAttribute("class", allClass);
            }
            else if(type == 2){
                //if we want to add a admin
            }
            else if(type == 3){
                //if we want to add a promoter
            }


            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setTrimText(false);
            format.setNewlines(true);

            Writer out = new PrintWriter(UserTypeEnum.getPos(type), "UTF-8");

            XMLWriter writer = new XMLWriter(out, format);

            writer.write(doc);

            // close
            out.close();
            writer.close();

        } catch (Exception e) {
            // exception settle down
            e.printStackTrace();
        }
        return true;
    }

    /**
     *
     * @param userType the type of the user
     * @return
     */
    public static String xpathBuilder(String userType){
        return "//" + userType;
    }
    /**
     *
     * @param userType the type of the user
     * @param searchCondition the name of the condition you want to select
     * @param searchContent the content of the condition you want to select
     * @return a xpath built by your conditions
     */
    public static String xpathBuilder(String userType, String searchCondition, String searchContent){
        return "//" + userType + "[@" + searchCondition + "='" + searchContent + "']";
    }

    /**
     *
     * @param userType the type of the user
     * @param searchCondition1 the name of the condition1 you want to select
     * @param searchContent1 the content of the condition1 you want to select
     * @param searchCondition2 as above
     * @param searchContent2 as above
     * @return
     */
    public static String xpathBuilder(String userType, String searchCondition1, String searchContent1,
                                      String searchCondition2, String searchContent2){
        return "//" + userType + "[@" + searchCondition1 + "='" + searchContent1 + "' and @" +
                searchCondition2 + "='" + searchContent2 + "']";
    }

    /**
     * get the user type from a xpath
     * @param xpath the original xpath
     * @return
     */
    private static String getTypeFromPath(String xpath){
        String userType = "";

        int i = 2;
        while(true){
            char temp = ' ';
            if(i == xpath.length()){
                break;
            }
            temp = xpath.charAt(i);
            if(temp != '['){
                userType += temp;
            }
            else{
                break;
            }
            i++;
        }
        return userType;
    }
    /**
     * delete users by condition
     *
     * @param xpath xpath built by the builder
     * @return success or not
     */
    public static boolean delNodes(String xpath){

        String userType = getTypeFromPath(xpath);

        try {
            // init the reader
            SAXReader reader = new SAXReader();

            // get the Document
            File xmlFile = new File(UserTypeEnum.getPos(UserTypeEnum.getType(userType)));

            Document doc = reader.read(xmlFile);

            //search
            List<Element> result = doc.selectNodes(xpath);

            for(Element e : result){
                e.getParent().remove(e);
            }

            Writer out = new PrintWriter(UserTypeEnum.getPos(UserTypeEnum.getType(userType)), "UTF-8");

            XMLWriter writer = new XMLWriter(out);

            writer.write(doc);

            // close
            out.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


    /**
     * search a singer user by condition
     *
     * @param xpath the search path built by function xpathBuilder
     * @return the correct userDO
     */

    public static UserDO findSingleNode(String xpath) {

        return findNodes(xpath).get(0);
    }

    /**
     * search many users by condition
     *
     * @param xpath the search path built by function xpathBuilder
     * @return the correct userDOs
     */
    public static List<UserDO> findNodes(String xpath){

        String userType = getTypeFromPath(xpath);

        try {
            // init the reader
            SAXReader reader = new SAXReader();

            int type = UserTypeEnum.getType(userType);

            // get the Document
            File xmlFile = new File(UserTypeEnum.getPos(type));

            Document doc = reader.read(xmlFile);

            //search
            List<Element> iniResult = doc.selectNodes(xpath);
            List<UserDO> finalResult = new ArrayList<>();


            for(Element user : iniResult){
                UserDO temp = null;
                switch(type){
                    case 0:
                        temp = new MemberDO();
                        ((MemberDO) temp).setType(user.attributeValue("type"));
                        ((MemberDO) temp).setEmail(user.attributeValue("email"));
                        ((MemberDO) temp).setBalance(user.attributeValue("balance"));
                        break;
                    case 1:
                        temp = new TrainerDO();
                        break;
                    case 2:
                        temp = new AdminDO();
                        break;
                    case 3:
                        temp = new PromoterDO();
                        break;
                }
                temp.setId(user.attributeValue("id"));
                temp.setPassword(user.attributeValue("password"));
                temp.setName(user.attributeValue("name"));
                temp.setPhoneNumber(user.attributeValue("phoneNumber"));
                temp.setInfo(user.attributeValue("info"));
                temp.setAge(user.attributeValue("age"));
                temp.setGender(user.attributeValue("gender"));

                finalResult.add(temp);
            }
            return finalResult;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        UserDO m1 = new MemberDO();
        m1.setId("Test001");
        m1.setName("1");
        m1.setPassword("111");
        m1.setPhoneNumber("400");
        m1.setInfo("fffff");
        m1.setAge("12");
        m1.setGender("male");
        addUser(m1);
    }
}
