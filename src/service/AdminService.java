package service;

import dao.DataOperation;
import dao.allDo.MemberDO;
import dao.allDo.TrainerDO;

public class AdminService {
    /**
     *  add the trainer
     * @param u trainer
     * @return the information about the insertion
     */
    public String addTrainer(TrainerDO u){
        if(useridIsValid(u.getId()) && passwordIsValid(u.getPassword())){
            if(DataOperation.findSingerNode("trainer","id",u.getId())!=null){
                return "Insert wrong! ID has already had, please input the new one.";
            } else{
                DataOperation.addUser(u);
                return "Insert success";
            }
        } else {
            return "The format of ID or password is wrong! ";
        }
    }
    //判断密码是否符合格式要求
    public boolean passwordIsValid(String s){
        if(s.length()>=6)
            return true;
        else
            return false;
    }
    //该方法判断用户名是否符合格式要求。
    public boolean useridIsValid(String s){
        if(s.length()>=6)
            return true;
        else
            return false;

    }

    /**
     *  add the member
     * @param u member
     * @return the information about the insertion
     */
    public String addCustomer(MemberDO u)
    {
        if(useridIsValid(u.getId()) && passwordIsValid(u.getPassword())){
            if(DataOperation.findSingerNode("trainer","id",u.getId())!=null){
                return "Insert wrong! ID has already had, please input the new one.";
            } else{
                DataOperation.addUser(u);
                return "Insert success";
            }
        } else {
            return "The format of ID or password is wrong! ";
        }
    }

    /**
     *  delete the member
     * @param id member id
     * @return the information about the deletion
     */
    public String deleteCustomer(String id)
    {
        boolean result = DataOperation.delNodes("member","id",id);
        if (result)
            return "Delete successful";
        else
            return "Delete failed" ;

    }
    /**
     *  delete the trainer
     * @param id trainer id
     * @return the information about the deletion
     */
    public String deleteTrainer(String id){
        boolean result = DataOperation.delNodes("trainer","id",id);
        if (result)
            return "Delete successful";
        else
            return "Delete failed" ;
    }


}
