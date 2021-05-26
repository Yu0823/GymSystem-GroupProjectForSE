package service;

import dao.PriceListUtil;
import dao.UserDataUtil;
import dao.alldo.PriceListDO;

/**
 * @author yu
 */
public class PromoterDiscount {
    /**
     *
     * @param discount new price = price * discount
     * @return true if success, false if fail
     */
    public boolean makeDiscount(double discount){
        PriceListDO l = PriceListUtil.getPriceList();

        double p1 = Double.parseDouble(l.getPrice1());

        double p2 = Double.parseDouble(l.getPrice2());

        l.setPrice1(String.valueOf(p1 * discount));

        l.setPrice2(String.valueOf(p2 * discount));

        PriceListUtil.updatePrice(l);

        return true;
    }
}
