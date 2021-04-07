package dao.allDo;

import java.util.HashSet;

/**
 * @author yu
 */
public class TrainerDO  extends UserDO{

    private HashSet<String> classSet;

    public HashSet<String> getClassSet() {
        return classSet;
    }

    public TrainerDO() {
        super();
        this.classSet = new HashSet<String>();
    }

}
