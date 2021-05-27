package service;

import dao.ClassDataUtil;
import dao.alldo.ClassDO;
import dao.alldo.MemberDO;

import java.util.List;

public class CustomerGetClass {
    /**
     * get customer's class
     * @param m, input MenberDo
     * @return result, the class information
     */
    public String getclass(MemberDO m){
        String result = null;
        List<ClassDO> c = ClassDataUtil.findNodes(ClassDataUtil.xpathBuilder("cusId",m.getId(),"isConfirm","true"));
        int i = 0;
        for(ClassDO cla:c){
            if(i==0){
                result = "**********\n";
            }
            else
            {
                result = result+"**********\n";
            }
            i++;
            result = result+"class id: "+cla.getId()+"\ntime: "+cla.getDate()+cla.getTime()+"\ntrainer id: "+cla.getTrainerId()+"\n";
        }
        return result;
    }
}
