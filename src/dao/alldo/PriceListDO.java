package dao.alldo;

/**
 * DO of price list to upgrade
 * @author yu
 */
public class PriceListDO {

    /**
     * price of normal to vip
     */
    private String price1;

    /**
     * price of vip to svip
     */
    private String price2;

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }
}
