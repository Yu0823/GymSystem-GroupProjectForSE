package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;
import dao.alldo.UserDO;

import java.util.List;

/**
 * @author yly
 * */
public class PromoterReward {
    /**
     * promoter reward the balance
     * @param amount, amount of money to be added in the balance
     * @return weather add successful
     */
    public boolean rewardBalance(double amount){
        List<UserDO> l = UserDataUtil.findNodes(UserDataUtil.xpathBuilder("member"));

        UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member"));

        for(UserDO u : l){
            MemberDO m = (MemberDO) u;
            m.setBalance(String.valueOf(Double.parseDouble(m.getBalance()) + amount));

            UserDataUtil.addUser(m);
        }
        return true;
    }
}
