package service;

import dao.UserDataUtil;

public class AdminDeletePromoter {
    /**
     *  delete the promoter
     * @param id promoter id
     * @return weather deletion success
     */
    public boolean deletePromoter(String id)
    {
        boolean result = UserDataUtil.delNodes(UserDataUtil.xpathBuilder("promoter","id",id));
        if (result)
            return true;
        else
            return false ;

    }
}
