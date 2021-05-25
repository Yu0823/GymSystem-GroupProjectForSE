package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;

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
        if(Util.useridIsValid(u.getId()) && Util.passwordIsValid(u.getPassword())){
            if(UserDataUtil.findSingleNode(UserDataUtil.xpathBuilder("member","id",u.getId()))!=null){
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
