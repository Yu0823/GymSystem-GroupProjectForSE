package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;
import dao.alldo.UserDO;

import java.util.List;

public class AdminAddCustomer {
    /**
     *  add the member
     * @param u member
     * @return information about weather insert successfully
     *          1:"Insert wrong! ID has already had, please input the new one."
     *          2:"Insert success"
     *          3:"The format of ID or password is wrong! "
     */
    public int addCustomer(MemberDO u)
    {
        List<UserDO> saved = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("trainer","id",u.getId()));
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
