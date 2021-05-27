package service;

import dao.ClassDataUtil;
import dao.alldo.ClassDO;

import java.util.List;

public class TrainerListUncomformedClass {
    /**
     * list all unconfirmed class object
     * @param id, trainer id
     * @return classes, the list of unconfirmed class
     */
    public List<ClassDO> listUnconfirmedClass(String id){
        List<ClassDO> classes = ClassDataUtil.findNodes(ClassDataUtil.xpathBuilder("trainerId",id,"isConfirm","false"));
        return classes;
    }
}
