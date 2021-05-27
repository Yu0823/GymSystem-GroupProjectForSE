package service;

import dao.UserDataUtil;
import dao.alldo.TrainerDO;
import dao.alldo.UserDO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yly
 * */
public class CustomerListAllTrainer {
    /**
     * list all trainer
     * @return trainers, list of trainer object
     */
    public List<UserDO> listAllTrainer(){
        List<UserDO> trainers = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer"));
        return trainers;
    }
}
