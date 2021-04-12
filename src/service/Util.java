package service;

import java.util.Random;
public class Util {
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
            while (false) ;
            return id;
        }

    public static void main(String[] args) {
       String str =  generateID("trainer");
       System.out.println(str);
    }
}
