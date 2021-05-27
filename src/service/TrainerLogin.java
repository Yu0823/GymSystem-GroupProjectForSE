package service;

import dao.UserDataUtil;
import dao.alldo.TrainerDO;
import dao.alldo.UserDO;

import java.util.List;

/**
 * @author yly
 * */
public class TrainerLogin {
    /**
     *  trainer log in
     * @param u the login member.
     * @return whether the login success or not. If fail, return null. If success, return user
     */
    public TrainerDO login(TrainerDO u) {
        String xpath = UserDataUtil.xpathBuilder("trainer","id",u.getId());
        List<UserDO> saved = UserDataUtil.findNodes(xpath);
        if(!saved.isEmpty()){
            if(saved.get(0).getPassword().equals(u.getPassword())){
                return (TrainerDO)saved.get(0);
            } else
                return null;
        }
        else
            return null;
    }
}
