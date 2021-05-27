package service;

import dao.ClassDataUtil;
import dao.alldo.ClassDO;

import java.util.List;

public class TrainerConform {
    /**
     * trainer conform the book.
     * @param classid
     * @return true
     */
    public boolean conform(String classid){
        List<ClassDO> cla = ClassDataUtil.findNodes(ClassDataUtil.xpathBuilder("id",classid));
        cla.get(0).setIsConfirm("true");
        ClassDataUtil.delNodes(ClassDataUtil.xpathBuilder("id",classid));
        ClassDataUtil.addClass(cla.get(0));
        return true;
    }
}
