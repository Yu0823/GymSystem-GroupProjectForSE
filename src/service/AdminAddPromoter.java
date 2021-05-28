package service;

import dao.UserDataUtil;
import dao.alldo.PromoterDO;
import dao.alldo.TrainerDO;
import dao.alldo.UserDO;

import java.util.List;

/**
 * @author yly
 * */
public class AdminAddPromoter {
    /**
     *  add the promoter
     * @param u promoter
     * @return the information about the insertion
     *          1:"Insert wrong! ID has already had, please input the new one."
     *          2:"Insert success"
     *          3:"The format of ID or password is wrong! "
     */
    public int addPromoter(PromoterDO u){
        List<UserDO> saved = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("promoter","id",u.getId()));
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
