package dao.allDo;

import java.util.HashSet;

/**
 * @author yu
 */

public class MemberDO extends UserDO{

    /**
     * type of the member
     */
    private String type;

    /**
     * classes of a member has ordered
     */
    private HashSet<String> classSet;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashSet<String> getClassSet() {
        return classSet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public MemberDO() {
        super();
        this.classSet = new HashSet<String>();
    }
}
