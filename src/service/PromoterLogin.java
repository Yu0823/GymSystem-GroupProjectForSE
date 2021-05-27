package service;

import dao.UserDataUtil;
import dao.alldo.AdminDO;
import dao.alldo.MemberDO;
import dao.alldo.PromoterDO;
import dao.alldo.UserDO;

import java.util.List;

public class PromoterLogin {
    /**
     *  promoter log in
     * @param u the login member.
     * @return whether the login success or not. If fail, return null. If success, return user
     */
    public PromoterDO login(PromoterDO u) {
        List<UserDO> saved = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("promoter","id",u.getId()));
        if(!saved.isEmpty()){
            PromoterDO save = (PromoterDO)saved.get(0);
            if(save.getPassword().equals(u.getPassword())){
                return save;
            } else
                return null;
        }
        else
            return null;
    }
}
