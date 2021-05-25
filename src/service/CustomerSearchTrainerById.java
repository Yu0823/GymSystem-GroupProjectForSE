package service;

import dao.UserDataUtil;
import dao.alldo.TrainerDO;

public class CustomerSearchTrainerById {
    /**
     * return the trainer object by id
     * @param id trainer's id
     * @return trainer object
     */
    public TrainerDO searchById(String id){
        TrainerDO trainer = (TrainerDO) UserDataUtil.findSingleNode(UserDataUtil.xpathBuilder("trainer","id",id));

        return trainer;
    }
}
