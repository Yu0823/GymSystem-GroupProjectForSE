package service;

import dao.UserDataUtil;
import dao.alldo.MemberDO;
import dao.alldo.UserDO;

import java.util.List;

public class PromoterReward {
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

    public static void main(String[] args) {
        new PromoterReward().rewardBalance(100);
    }
}
