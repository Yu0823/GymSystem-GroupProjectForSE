package service;

import dao.UserDataUtil;

public class AdminDeleteTrainer {
    /**
     *  delete the trainer
     * @param id trainer id
     * @return weather deletion successful
     */
    public boolean deleteTrainer(String id){
        boolean result = UserDataUtil.delNodes(UserDataUtil.xpathBuilder("trainer","id",id));
        if (result)
            return true;
        else
            return false;
    }
}
