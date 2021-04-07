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

    public static String getName(int type){
        UserTypeEnum[] enums = UserTypeEnum.values();
        for(UserTypeEnum user : enums){
            if(user.type == type)
                return user.name;
        }
        return null;
    }

    public static String getPos(int type){
        UserTypeEnum[] enums = UserTypeEnum.values();
        for(UserTypeEnum user : enums){
            if(user.type == type)
                return user.pos;
        }
        return null;
    }

    public static Integer getType(String name){
        UserTypeEnum[] enums = UserTypeEnum.values();
        for(UserTypeEnum user : enums){
            if(user.name == name)
                return user.type;
        }
        return null;
    }
}
