package service;



import dao.ClassDataUtil;
import dao.UserDataUtil;
import dao.alldo.ClassDO;
import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;

import java.util.List;
import java.util.Map;

public class CustomerService {
    /**
     *  register a customer
     * @param u the new register member.
     * @return whether the register success or not
     */
    public String register(MemberDO u) {
        if(useridIsValid(u.getId()) && passwordIsValid(u.getPassword())){
            if(UserDataUtil.findSingleNode(UserDataUtil.xpathBuilder("member","id",u.getId()))!=null){
                return "Register wrong! ID has already had, please input the new one.";
            } else{
                UserDataUtil.addUser(u);
                return "Register success, please login.";
            }
        } else {
            return "The format of ID or password is wrong! ";
        }
    }
    //判断密码是否符合格式要求
    public boolean passwordIsValid(String s){
        if(s.length()>=6)
            return true;
        else
            return false;
    }
    //该方法判断用户名是否符合格式要求。
    public boolean useridIsValid(String s){
        if(s.length()>=6)
            return true;
        else
            return false;
    }


    /**
     *  customer log in
     * @param u the login member.
     * @return whether the login success or not. If fail, return null. If success, return user
     */
    public MemberDO login(MemberDO u) {
        MemberDO saved = (MemberDO) UserDataUtil.findSingleNode(UserDataUtil.xpathBuilder("member","id",u.getId()));
        if(saved!=null){
            if(saved.getPassword().equals(u.getPassword())){
                return saved;
            } else
                return null;
        }
        else
            return null;
    }

    /**
     * customer upgrade
     * @param u the member who want to upgrade, a is the grade you want to upgrade to
     * @return the information of weather upgrade or not
     */
    public String upgrade(MemberDO u, String a){
        String level = u.getType();
        if(level.equals("Svip")){
            return "You don't need to upgrade!";
        }
        else if(level.equals("Vip")) {
            if (a.equals("Svip")){
                u.setType("Svip");
                UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member", "id", u.getId()));
                UserDataUtil.addUser(u);
            }
            else if(a.equals("Vip")) {
                return "You don't need to upgrade!";
            }
        }
        else
        {
            if(a.equals("Vip")){
                u.setType("Vip");
                UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",u.getId()));
                UserDataUtil.addUser(u);
            }
            else if (a.equals("Svip")){
                u.setType("Svip");
                UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",u.getId()));
                UserDataUtil.addUser(u);
            }
        }
        return "upgrade successfully!";
    }

    /**
     * customer book the svip service
     * @param c the classDO you want to add.
     * @return weather insert successfully or not
     */
    public String book(ClassDO c){

        c.setId(Util.generateIDforClass());
        ClassDataUtil.addClass(c);
        return "Successfully insert！";
    }

    /**
     * customer search the certain trainer
     *@param t present the time,d present the date.
     *@return
     * date of the class Format:"YYYYMMDD", eg:"20210501"
     * time of the class Format:"HHMM", eg:"0830"
     */
    /**
    public String searchTrainer(String t1,String d1,String t2,String d2){
        String path = ClassDataUtil.DateAndTimeXpathBuilder(d2,d1,t2,t1);
        List<ClassDO> lesson = ClassDataUtil.findNodes(path);
        int i = 0;
        String result = null;
        if(lesson.size()==0){
           List<TrainerDO> t = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer","",));

        }

        return result;
    }
    */

    /**
     * customer search the video
     *
     */
    public String searchVideo()
    {

        return null;


    }
    /**
     * change the customer's profile
     *
     */
    public String changeProfile(MemberDO t){
        UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",t.getId()));
        UserDataUtil.addUser(t);
        return "You have update your profile";
    }
}

