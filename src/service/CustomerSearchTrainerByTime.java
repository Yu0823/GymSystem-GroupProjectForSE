package service;

import dao.ClassDataUtil;
import dao.UserDataUtil;
import dao.alldo.ClassDO;
import dao.alldo.UserDO;

import java.util.List;

public class CustomerSearchTrainerByTime {
    /**
     * customer search the certain trainer
     *@param t1,t2 present the time,d1,d2 present the date.
     *@return trainer information
     * date of the class Format:"YYYYMMDD", eg:"20210501"
     * time of the class Format:"HHMM", eg:"0830"
     */
    public String searchTrainer(String t1,String d1,String t2,String d2){
        String path = ClassDataUtil.DateAndTimeXpathBuilder(d2,d1,t2,t1);
        List<ClassDO> lesson = ClassDataUtil.findNodes(path);
        int i = 0;
        String result = null;
        List<UserDO> tt = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer"));
        if(lesson.size()==0){
            for(UserDO t:tt){
                result = result + t.getInfo() +"\n" ;
            }
        }
        else{
            for(UserDO t:tt){
                String id = t.getId();
                int count = 0;
                for(ClassDO c:lesson){
                    if(id.equals(c.getTrainerId())){
                        count++;
                        break;
                    }
                }
                if(count ==0)
                    result = result + t.getInfo() +"\n" ;
            }
        }
        return result;
    }
}
