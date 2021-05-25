package service;

import dao.UserDataUtil;
import dao.alldo.TrainerDO;

public class TrainerChangeProfile {
    /**
     * change the trainer's profile
     * @param t, input TrainerDO
     * @return true
     */
    public Boolean changeProfile(TrainerDO t){
        UserDataUtil.delNodes(UserDataUtil.xpathBuilder("trainer","id",t.getId()));
        UserDataUtil.addUser(t);
        return true;
    }
}
