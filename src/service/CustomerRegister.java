package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;
import dao.alldo.UserDO;

import java.util.List;

public class CustomerRegister {
    /**
     *  register a customer
     * @param u the new register member.
     * @return information about register
     *          1:"Register wrong! ID has already had, please input the new one."
     *          2:"Register success, please login."
     *          3:"The format of ID or password is wrong! "
     */

    public int register(MemberDO u) {
        List<UserDO> saved = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("member","id",u.getId()));
        if(Util.useridIsValid(u.getId()) && Util.passwordIsValid(u.getPassword())){
            if(!saved.isEmpty()){
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
