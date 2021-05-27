package service;

import dao.UserDataUtil;
import dao.alldo.AdminDO;
import dao.alldo.MemberDO;
import dao.alldo.UserDO;

import java.util.List;

/**
 * @author yly
 * */
public class AdminLogin {
    /**
     *  admin log in
     * @param u the login member.
     * @return whether the login success or not. If fail, return null. If success, return user
     */
    public AdminDO login(AdminDO u) {
        List<UserDO> saved = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("admin","id",u.getId()));
        if(!saved.isEmpty()){
            AdminDO save = (AdminDO)saved.get(0);
            if(save.getPassword().equals(u.getPassword())){
                return save;
            } else
                return null;
        }
        else
            return null;
    }
}
