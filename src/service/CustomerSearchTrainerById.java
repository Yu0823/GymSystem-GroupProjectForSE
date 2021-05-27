package service;

import dao.UserDataUtil;
import dao.alldo.TrainerDO;
import dao.alldo.UserDO;

import java.util.List;

/**
 * @author yly
 * */
public class CustomerSearchTrainerById {
    /**
     * return the trainer object by id
     * @param id trainer's id
     * @return trainer object
     */
    public TrainerDO searchById(String id){
        List<UserDO> saved = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer","id",id));

        return (TrainerDO)saved.get(0);
    }
}
