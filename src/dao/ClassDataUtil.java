package dao;

import dao.alldo.*;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yu
 */
public class ClassDataUtil {
    /**
     * add a member into the xml to store
     *
     * @param c a classDO of the class you want to add
     * @return true when success, false when fail
     */
    public static boolean addClass(ClassDO c) {


        try {

            SAXReader reader = new SAXReader();

            File xmlFile = null;

            String pos = "data/classes.xml";
            
            xmlFile = new File(pos);

            Document doc = reader.read(xmlFile);

            Element root = doc.getRootElement();

            Element newElement = root.addElement("class");

            newElement.addAttribute("id", c.getId());
            newElement.addAttribute("date", c.getDate());
            newElement.addAttribute("time", c.getTime());
            newElement.addAttribute("trainerId", c.getTrainerId());
            newElement.addAttribute("cusId", c.getCusId());
            newElement.addAttribute("isConfirm", c.getIsConfirm());


            Writer out = new PrintWriter(pos, "UTF-8");

            //format control
            OutputFormat format = new OutputFormat("\t", true);
            format.setTrimText(true); 
            //delete \t and newline and space

            XMLWriter writer = new XMLWriter(out);

            writer.write(doc);

            // close
            out.close();
            writer.close();

        } catch (Exception e) {
            // exception settle down
            throw new RuntimeException(e);
        }
        return true;
    }
    
    /**
     *
     * @param searchCondition the name of the condition you want to delete
     * @param searchContent the content of the condition you want to delete
     * @return a xpath built by your conditions
     */
    public static String xpathBuilder(String searchCondition, String searchContent){
        return "//" + "class" + "[@" + searchCondition + "='" + searchContent + "']";
    }

    public static String xpathBuilder(String searchCondition1, String searchContent1,
                                      String searchCondition2, String searchContent2){
        return "//" + "class" + "[@" + searchCondition1 + "='" + searchContent1 + "' and @" +
                searchCondition2 + "='" + searchContent2 + "']";
    }

    /**
     *
     * @param upperBound the upperbound of the data
     * @param lowerBound the lowerbound of the date
     * @return a xpath built by your conditions
     */
    public static String DateXpathBuilder(String upperBound, String lowerBound){
        return "//" + "class" + "[@" + "date" + "<='" + upperBound + "' and @" +
               "date" + ">='" + lowerBound + "']";
    }


    public static String DateAndTimeXpathBuilder(String dateUpperBound, String dateLowerBound,
                                                 String timeUpperBound, String timeLowerBound){
        return "//" + "class" + "[@" + "date" + "<='" + dateUpperBound +
                "' and @" + "date" + ">='" + dateLowerBound +
                "' and @" + "time" + "<='" + timeUpperBound +
                "' and @" + "time" + ">='" + timeLowerBound + "']";
    }


    /**
     * delete classes by condition
     *
     * @param xpath Searchpath built by the builder
     * @return success or not
     */
    public static boolean delNodes(String xpath){
        
        String pos = "data/classes.xml";

        try {
            // init the reader
            SAXReader reader = new SAXReader();

            // get the Document
            File xmlFile = new File(pos);

            Document doc = reader.read(xmlFile);

            //search
            List<Element> result = doc.selectNodes(xpath);

            for(Element e : result){
                System.out.println(e.getName() + e.getData());
                e.getParent().remove(e);
            }

            Writer out = new PrintWriter(pos, "UTF-8");

            XMLWriter writer = new XMLWriter(out);

            writer.write(doc);

            // close
            out.close();
            writer.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
    
    /**
     * search many classes by condition
     *
     * @param xpath the search path built by function xpathBuilder
     * @return the correct classDOs
     */
    public static List<ClassDO> findNodes(String xpath){

        String pos = "data/classes.xml";

        try {
            // init the reader
            SAXReader reader = new SAXReader();

            // get the Document
            File xmlFile = new File(pos);

            Document doc = reader.read(xmlFile);

            //search
            List<Element> iniResult = doc.selectNodes(xpath);
            List<ClassDO> finalResult = new ArrayList<>();


            for(Element c : iniResult){
                ClassDO temp = new ClassDO();
                temp.setId(c.attributeValue("id"));
                temp.setDate(c.attributeValue("date"));
                temp.setTime(c.attributeValue("time"));
                temp.setTrainerId(c.attributeValue("trainerId"));
                temp.setCusId(c.attributeValue("cusId"));
                temp.setIsConfirm(c.attributeValue("isConfirm"));
                finalResult.add(temp);
            }
            return finalResult;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List list2 = findNodes(ClassDataUtil.xpathBuilder("trainerId","400000","isConfirm","true"));
        for(Object o : list2){
            System.out.println(((ClassDO) o).getId());
        }
    }
}
