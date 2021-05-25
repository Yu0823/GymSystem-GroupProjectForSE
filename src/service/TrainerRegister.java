package service;

import dao.UserDataUtil;
import dao.alldo.TrainerDO;

import static service.Util.passwordIsValid;
import static service.Util.useridIsValid;

public class TrainerRegister {
    /**
     *  register a trainer
     * @param u the new register member.
     * @return whether the register success or not
     *          1:"Register wrong! ID has already had, please input the new one."
     *          2:"Register success, please login."
     *          3:"The format of ID or password is wrong! "
     */
    public int register(TrainerDO u) {
        if(useridIsValid(u.getId()) && passwordIsValid(u.getPassword())){

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
