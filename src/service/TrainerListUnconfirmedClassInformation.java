package service;

import dao.ClassDataUtil;
import dao.alldo.ClassDO;

import java.util.List;

public class TrainerListUnconfirmedClassInformation {
    /**
     * list all unconfirmed class information
     * @param id, trainer id
     * @return result the all information of the unconfirmed class
     */
    public String listUnconfirmedClassInformation(String id){
        List<ClassDO> classes = ClassDataUtil.findNodes(ClassDataUtil.xpathBuilder("trainerId",id,"isConfirm","false"));

        String result = null;
        int i = 0;
        for(ClassDO cc: classes){
            if (i==0){
                result = "************\n"+
                        "class's id: "+cc.getId()+"\n"
                        + "class's time: "+cc.getDate()+" - "+cc.getTime()+"\n"
                        + "customer's id: "+cc.getCusId()+"\n"
                ;
                i++;
            }else
            {
                result = result +  "************\n"+
                        "class's id: "+cc.getId()+"\n"
                        + "class's time: "+cc.getDate()+" - "+cc.getTime()+"\n"
                        + "customer's id: "+cc.getCusId()+"\n"
                ;
            }
        }
        return result;
    }
}
