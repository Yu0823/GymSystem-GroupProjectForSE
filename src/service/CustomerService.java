package service;

import dao.DataOperation;
import dao.allDo.MemberDO;

import java.util.Map;

public class CustomerService {
    /**
     *  register a customer
     * @param u the new register member.
     * @return whether the register success or not
     */
    public String register(MemberDO u) {
        if(useridIsValid(u.getId()) && passwordIsValid(u.getPassword())){
            if(DataOperation.findSingerNode("member","id",u.getId())!=null){
                return "Register wrong! ID has already had, please input the new one.";
            } else{
                DataOperation.addUser(u);
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
        MemberDO saved = (MemberDO) DataOperation.findSingerNode("member","id",u.getId());
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
     * @param u the member who want to upgrade
     * @return the information of weather upgrade or not
     */
    public String upgrade(MemberDO u){
        String level = u.getType();
        if(level.equals("Svip")){

        }
        else if(level.equals("Vip"))
        {

        }
        else
        {

        }
        return null;


    }
}

