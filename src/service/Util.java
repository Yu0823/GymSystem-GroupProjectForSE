package service;

import dao.ClassDataUtil;
import dao.UserDataUtil;
import dao.VideoDataUtil;
import dao.alldo.UserDO;

import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yly
 * */
public class Util {
    /**
     * generate id for user
     * @param type, the user's kind
     * @return id, id number
     */
    public static String generateID(String type) {
        String id = "1111111";
        do {
            String str = "123456789";
            Random random = new Random();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 7; i++) {
                int number = random.nextInt(9);
                sb.append(str.charAt(number));
                id = sb.toString();
            }
        }
            while (!UserDataUtil.findNodes(UserDataUtil.xpathBuilder(type,"id",id)).isEmpty()) ;
            return id;
        }

    /**
     * generate id for class
     * @return id, class id number
     */
    public static String generateIDforClass() {
        String id = "1111111";
        do {
            String str = "123456789";
            Random random = new Random();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 7; i++) {
                int number = random.nextInt(9);
                sb.append(str.charAt(number));
                id = sb.toString();
            }}
        while (ClassDataUtil.findNodes(ClassDataUtil.xpathBuilder("id",id)).size()!=0) ;
        return id;
    }
    /**
     * generate id for video
     * @return id, video id number
     */
    public static String generateIDforVideo() {
        String id = "1111111";
        do {
            String str = "123456789";
            Random random = new Random();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 7; i++) {
                int number = random.nextInt(9);
                sb.append(str.charAt(number));
                id = sb.toString();
            }}
        while (VideoDataUtil.findNodes(VideoDataUtil.xpathBuilder("id",id)).size()!=0) ;
        return id;
    }

    /**
     * check the validness of email
     * @param email, the email address that need to be checked
     * @return valid or invalid
     */
    public static boolean checkEmail(String email){
        String regex =   "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        Pattern   p   =   Pattern.compile(regex);
        Matcher m   =   p.matcher(email);
        return m.find();
    }

    /**
     * check the validness of phone number
     * @param phonenumber, the phone number that need to be checked
     * @return valid or invalid
     */
    public static boolean checkPhone(String phonenumber){
        String regex =   "^1[0-9]{10}$";
        Pattern   p   =   Pattern.compile(regex);
        Matcher m   =   p.matcher(phonenumber);
        return m.find();
    }

    //judge weather the password is valid
    /**
     * check the validness of password
     * @param s, the phone number that need to be checked
     * @return weather the password is valid
     */
    public static boolean passwordIsValid(String s){
        if(s.length()>=6)
            return true;
        else
            return false;
    }
    //该方法判断用户名是否符合格式要求。
    /**
     * check the validness of userid
     * @param s, the phone number that need to be checked
     * @return weather the userid is valid
     */
    public static boolean useridIsValid(String s) {
        if (s.length() >= 6)
            return true;
        else
            return false;
    }

}
