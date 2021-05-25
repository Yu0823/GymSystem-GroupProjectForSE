package service;

import dao.UserDataUtil;
import dao.alldo.UserDO;

import java.util.List;

public class CustomerSearchTrainerByName {
    /**
     * return the trainer object by name
     * @param name trainer's name
     * @return result the all information of the trainers
     */
    public String searchByName(String name){
        List<UserDO> trainers = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer","name",name));
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
