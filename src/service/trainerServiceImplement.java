package service;


import dao.DataOperation;
import dao.allDo.MemberDO;
import dao.allDo.TrainerDO;

import java.util.Map;

public class trainerServiceImplement {
    /**
     *  register a trainer
     * @param u the new register member.
     * @return whether the register success or not
     */
    public String register(TrainerDO u) {
        if(useridIsValid(u.getId()) && passwordIsValid(u.getPassword())){
            if(DataOperation.findSingerNode("trainer","id",u.getId())!=null){
                return "注册失败,该用户id已经存在！请重新输入！！！";
            } else{
                DataOperation.addUser(u);
                return "注册成功,请登录！";
            }
        } else {
            return "用户id或密码格式不对";
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
        TrainerDO saved = (TrainerDO) DataOperation.findSingerNode("trainer","id",u.getId());
        if(saved!=null){
            if(saved.getPassword().equals(u.getPassword())){
                return saved;
            } else
                return null;
        }
        else
            return null;
    }
}
