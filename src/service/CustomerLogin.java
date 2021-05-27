package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;
import dao.alldo.UserDO;

import java.util.List;

/**
 * @author yly
 * */
public class CustomerLogin {
    /**
     *  customer log in
     * @param u the login member.
     * @return whether the login success or not. If fail, return null. If success, return user
     */
    public MemberDO login(MemberDO u) {
        List<UserDO> saved = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("member","id",u.getId()));
        if(!saved.isEmpty()){
            MemberDO save = (MemberDO)saved.get(0);
            if(save.getPassword().equals(u.getPassword())){
                return save;
            } else
                return null;
        }
        else
            return null;
    }
}
