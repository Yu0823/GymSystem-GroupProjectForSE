package service;

import dao.UserDataUtil;
import dao.alldo.UserDO;

import java.util.List;

public class AdminDeleteTrainer {
    /**
     *  delete the trainer
     * @param id trainer id
     * @return weather deletion successful
     */
    public boolean deleteTrainer(String id){
        boolean result;
        List<UserDO> collection = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer","id",id));
        if(collection.isEmpty())
            result = false;
        else
            result = UserDataUtil.delNodes(UserDataUtil.xpathBuilder("trainer","id",id));

        if (result)
            return true;
        else
            return false;
    }
}
