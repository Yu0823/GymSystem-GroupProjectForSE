package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;

public class CustomerLogin {
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
}
