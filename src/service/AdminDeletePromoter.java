package service;

import dao.UserDataUtil;
import dao.alldo.UserDO;

import java.util.List;

public class AdminDeletePromoter {
    /**
     *  delete the promoter
     * @param id promoter id
     * @return weather deletion success
     */
    public boolean deletePromoter(String id)
    {
        boolean result;
        List<UserDO> collection = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("promoter","id",id));
        if(collection.isEmpty())
            result = false;
        else
            result = UserDataUtil.delNodes(UserDataUtil.xpathBuilder("promoter","id",id));
        if (result)
            return true;
        else
            return false ;

    }
}
