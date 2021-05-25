package service;

import dao.UserDataUtil;
import dao.alldo.TrainerDO;

public class TrainerLogin {
    /**
     *  trainer log in
     * @param u the login member.
     * @return whether the login success or not. If fail, return null. If success, return user
     */
    public TrainerDO login(TrainerDO u) {
        String xpath = UserDataUtil.xpathBuilder("trainer","id",u.getId());
        TrainerDO saved = (TrainerDO) UserDataUtil.findSingleNode(xpath);
        System.out.println();
        if(saved!=null){
            if(saved.getPassword().equals(u.getPassword())){
                return saved;
            } else
                return null;
        }
        else
            return null;
    }
}
