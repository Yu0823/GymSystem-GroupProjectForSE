package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;

public class CustomerUpgrade {
    /**
     * customer upgrade
     * @param u the member who want to upgrade, a is the grade you want to upgrade to
     * @return the information of weather upgrade successful
     */
    public boolean upgrade(MemberDO u, String level){
        u.setType(level);
        return true;
    }
}
