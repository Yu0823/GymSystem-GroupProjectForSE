package service;

import dao.ClassDataUtil;
import dao.UserDataUtil;
import dao.VideoDataUtil;
import dao.alldo.UserDO;

import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Util {
    /**
     * generate id for user
     *
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
     *
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
     *
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
     * @param email the email address that need to be checked
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
     * @param phonenumber the phone number that need to be checked
     * @return valid or invalid
     */
    public static boolean checkPhone(String phonenumber){
        String regex =   "^1[0-9]{10}$";
        Pattern   p   =   Pattern.compile(regex);
        Matcher m   =   p.matcher(phonenumber);
        return m.find();
    }

    //判断密码是否符合格式要求
    public static boolean passwordIsValid(String s){
        if(s.length()>=6)
            return true;
        else
            return false;
    }
    //该方法判断用户名是否符合格式要求。
    public static boolean useridIsValid(String s) {
        if (s.length() >= 6)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

       System.out.println(checkEmail("3327317060@.com"));
       System.out.println(checkPhone("13588410085"));



    }
}
