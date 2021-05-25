package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;

public class CustomerChangeProfile {
    /**
     * change the customer's profile
     * @param t, input MemberDO
     * @return weather update successful
     */
    public boolean changeProfile(MemberDO t){
        UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",t.getId()));
        UserDataUtil.addUser(t);
        return true;
    }
}
