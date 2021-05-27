package service;

import dao.UserDataUtil;
import dao.alldo.UserDO;

import java.util.List;

/**
 * @author yly
 * */
public class CustomerSearchTrainerType {
    /**
     * return the trainer object by type
     * @param type the trainer's type
     * @return List<UserDO> object of trainer
     */
    public List<UserDO> searchByType(String type){
        List<UserDO> trainers = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer","type",type));
        return trainers;
    }
}
