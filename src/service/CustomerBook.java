package service;

import dao.ClassDataUtil;
import dao.alldo.ClassDO;

public class CustomerBook {

    /**
     * customer book the svip service
     * @param c the classDO you want to add.
     * @return weather insert successfully or not
     */
    public boolean book(ClassDO c){
        c.setId(Util.generateIDforClass());
        ClassDataUtil.addClass(c);
        return true;
    }
}
