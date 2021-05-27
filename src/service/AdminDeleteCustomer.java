package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;
import dao.alldo.UserDO;

import java.util.List;

/**
 * @author yly
 * */
public class AdminDeleteCustomer {
    /**
     *  delete the member
     * @param id member id
     * @return weather deletion success
     */
    public boolean deleteCustomer(String id)
    {
        boolean result;
        List<UserDO> collection = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("member","id",id));
        if(collection.isEmpty())
            result = false;
        else
            result = UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",id));
        if (result)
            return true;
        else
            return false ;

    }
}
