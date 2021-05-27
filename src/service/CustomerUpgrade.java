package service;

import dao.PriceListUtil;
import dao.UserDataUtil;
import dao.alldo.MemberDO;
import dao.alldo.PriceListDO;

/**
 * @author yly
 * */
public class CustomerUpgrade {
    /**
     * customer upgrade
     * @param u the member who want to upgrade, a is the grade you want to upgrade to
     * @return -1 - success  0 - "Balance is not enough" 1 - "You don't need to upgrade!" 2 - "You don't need to disgrade!"
     */
    public double upgrade(MemberDO u, String a){
        PriceListDO l = PriceListUtil.getPriceList();
        double p1 = Double.parseDouble(l.getPrice1());
        double p2 = Double.parseDouble(l.getPrice2());
        double b = Double.parseDouble(u.getBalance());

        String level = u.getType();
        if(level.equals("SVIP")){
            return 1;
        }

        else if(level.equals("VIP")) {
            if (a.equals("SVIP")){
                if(b < p2){
                    return 0;
                }
                u.setType("SVIP");
                UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member", "id", u.getId()));
                u.setBalance(String.valueOf(b - p2));
                UserDataUtil.addUser(u);
                return (-1) * (b - p2);
            }
            else if(a.equals("VIP")) {
                return 2;
            }
        }

        else
        {
            if(a.equals("VIP")){
                if(b < p1)
                    return 0;
                u.setType("VIP");
                UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",u.getId()));
                u.setBalance(String.valueOf(b - p1));
                UserDataUtil.addUser(u);
                return (-1) * (b - p1);
            }
            else if (a.equals("SVIP")){
                if(b < p1 + p2)
                    return 0;
                u.setType("SVIP");
                UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",u.getId()));
                UserDataUtil.addUser(u);
                u.setBalance(String.valueOf(b - p1 - p2));
                return (-1) * (b - p1 - p2);
            }
        }
        return 3;
    }
}
