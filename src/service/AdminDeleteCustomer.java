package service;

import dao.UserDataUtil;

public class AdminDeleteCustomer {
    /**
     *  delete the member
     * @param id member id
     * @return weather deletion success
     */
    public boolean deleteCustomer(String id)
    {
        boolean result = UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",id));
        if (result)
            return true;
        else
            return false ;

    }
}
