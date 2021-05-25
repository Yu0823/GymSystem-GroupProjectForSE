package service;

import dao.UserDataUtil;
import dao.alldo.UserDO;

import java.util.List;

public class CustomerListAllTrainerInformation {
    /**
     * list all trainer's information
     * @return result the all information of the trainers
     */
    public String listAllTrainer(){
        List<UserDO> trainers = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer"));
        String result = null;
        int i = 0;
        for(UserDO tt: trainers){
            if (i==0){
                result = "************\n"+
                        "trainer's name: "+tt.getName()+"\n"+
                        "trainer's id: "+tt.getId()+"\n"
                //+ "trainer's type: "+tt.getType()+"\n"
                ;
                i++;
            }else
            {
                result = result +  "************\n"+
                        "trainer's name: "+tt.getName()+"\n"+
                        "trainer's id: "+tt.getId()+"\n"
                //+ "trainer's type: "+tt.getType()+"\n"
                ;
            }
        }
        return result;
    }
}
