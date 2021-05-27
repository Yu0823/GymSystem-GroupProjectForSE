package service;

import dao.ClassDataUtil;
import dao.UserDataUtil;

public class TrainerDeleteClass {
    /**
     *  delete the class
     * @param id class id
     * @return weather deletion success
     */
    public boolean deleteCustomer(String id)
    {
        return ClassDataUtil.delNodes(ClassDataUtil.xpathBuilder("id",id));
    }
}
