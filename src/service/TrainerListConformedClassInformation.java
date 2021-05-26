package service;

import dao.ClassDataUtil;
import dao.UserDataUtil;
import dao.alldo.ClassDO;
import dao.alldo.UserDO;

import java.util.List;

public class TrainerListConformedClassInformation {
    /**
     * list all confirmed class information
     * @param id, trainer id
     * @return result the all information of the confirmed class
     */
    public String listConfirmedClassInformation(String id){
        List<ClassDO> classes = ClassDataUtil.findNodes(ClassDataUtil.xpathBuilder("trainerId",id,"isConfirm","true"));

        String result = null;
        int i = 0;
        for(ClassDO cc: classes){
            if (i==0){
                result = "************\n"+
                        "class's id: "+cc.getId()+"\n"
                    + "class's time: "+cc.getDate()+" - "+cc.getTime()+"\n"
                ;
                i++;
            }else
            {
                result = result +  "************\n"+
                        "class's id: "+cc.getId()+"\n"
                        + "class's time: "+cc.getDate()+" - "+cc.getTime()+"\n"
                ;
            }
        }
        return result;
    }

}
