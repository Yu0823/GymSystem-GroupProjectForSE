package dao;

/**
 * @author yu
 * enum of user types
 */

public enum UserTypeEnum {
    MEMBER(0, "member","data/members.xml"),
    TRAINER(1, "trainer","data/trainers.xml"),
    ADMIN(2, "admin","data/admins.xml"),
    PROMOTER(3, "promoter","data/promoters.xml");

    private Integer type;

    private String name;

    private String pos;


    UserTypeEnum(int type, String name, String pos) {
        this.type = type;
        this.name = name;
        this.pos = pos;
    }

    /**
     * get the user name by type
     * @param type
     * @return the name of the user
     */
    public static String getName(int type){
        UserTypeEnum[] enums = UserTypeEnum.values();
        for(UserTypeEnum user : enums){
            if(user.type.equals(type)) {
                return user.name;
            }
        }
        return null;
    }

    /**
     * get the pos of the data file
     * @param type
     * @return the path of the data file
     */
    public static String getPos(int type){
        UserTypeEnum[] enums = UserTypeEnum.values();
        for(UserTypeEnum user : enums){
            if(user.type.equals(type)) {
                return user.pos;
            }
        }
        return null;
    }

    /**
     * get the type bu name
     * @param name
     * @return type of the user
     */
    public static Integer getType(String name){
        UserTypeEnum[] enums = UserTypeEnum.values();
        for(UserTypeEnum user : enums){
            if(user.name.equals(name)) {
                return user.type;
            }
        }
        return null;
    }
}
