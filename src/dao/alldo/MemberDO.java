package dao.alldo;

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
     * email of the member
     */
    private String email;

    private String balance;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public MemberDO() {
        super();
    }
}
