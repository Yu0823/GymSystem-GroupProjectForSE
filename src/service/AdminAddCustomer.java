package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;

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
