package service;

import dao.ClassDataUtil;
import dao.UserDataUtil;
import dao.VideoDataUtil;

import java.util.Random;


public class Util {
    /**
     * generate id for user
     * @param type
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
            }}
            while (UserDataUtil.findSingleNode(UserDataUtil.xpathBuilder(type,"id",id))!=null) ;
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

    public static void main(String[] args) {
       String str =  generateIDforClass();
       System.out.println(str);
    }
}
