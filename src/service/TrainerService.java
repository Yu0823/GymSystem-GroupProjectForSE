package service;


import dao.UserDataUtil;
import dao.alldo.TrainerDO;

import java.util.Map;

public class TrainerService {
    /**
     *  register a trainer
     * @param u the new register member.
     * @return whether the register success or not
     */
    public String register(TrainerDO u) {
        if(useridIsValid(u.getId()) && passwordIsValid(u.getPassword())){

            if(UserDataUtil.findSingleNode(UserDataUtil.xpathBuilder("trainer","id",u.getId()))!=null){
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
     *  trainer log in
     * @param u the login member.
     * @return whether the login success or not. If fail, return null. If success, return user
     */
    public TrainerDO login(TrainerDO u) {
        String xpath = UserDataUtil.xpathBuilder("trainer","id",u.getId());
        TrainerDO saved = (TrainerDO) UserDataUtil.findSingleNode(xpath);
        System.out.println();
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
     * trainer conform the book.
     *
     *
     */
    public String conform(){

        return null;
    }

    /**
     * add the film
     */
    public String  addFilm(){

        return null;


    }

    /**
     * change the trainer's profile
     *
     */
    public String changeProfile(TrainerDO t){


        UserDataUtil.delNodes(UserDataUtil.xpathBuilder("trainer","id",t.getId()));
        UserDataUtil.addUser(t);
        return "You have update your profile";
    }
}
