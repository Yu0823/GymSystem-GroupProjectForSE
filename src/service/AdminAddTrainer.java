package service;

import dao.UserDataUtil;
import dao.alldo.TrainerDO;

public class AdminAddTrainer {
    /**
     *  add the trainer
     * @param u trainer
     * @return the information about the insertion
     *          1:"Insert wrong! ID has already had, please input the new one."
     *          2:"Insert success"
     *          3:"The format of ID or password is wrong! "
     */
    public int addTrainer(TrainerDO u){
        if(Util.useridIsValid(u.getId()) && Util.passwordIsValid(u.getPassword())){
            if(UserDataUtil.findSingleNode(UserDataUtil.xpathBuilder("trainer","id",u.getId()))!=null){
                return 1;
            } else{
                UserDataUtil.addUser(u);
                return 2;
            }
        } else {
            return 3;
        }
    }
}
