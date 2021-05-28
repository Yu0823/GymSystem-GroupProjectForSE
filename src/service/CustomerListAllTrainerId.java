package service;

import dao.UserDataUtil;
import dao.alldo.UserDO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yly
 * */
public class CustomerListAllTrainerId {
    /**
     * list all trainer
     * @return ids, list of String about the trainer id
     */
    public List<String> listAllTrainerId(){
        List<String> ids = new ArrayList<>();
        List<UserDO> trainers = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer"));
        for(UserDO tt: trainers){
            ids.add(tt.getId());
        }
        return ids;
    }
}
