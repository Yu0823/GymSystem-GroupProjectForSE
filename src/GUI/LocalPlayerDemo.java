package GUI;

import java.io.File;
import java.io.IOException;

public class LocalPlayerDemo {
    public static void main(String[] args) {
        File file = new File("/Users/yu/Desktop/yy.mp4");
        openExe(file);
    }

    //打开本地播放器并播放视频
    public static void openExe(File file) {
        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try {
            String[] cmdMac2 = {"/Applications/QQLive.app"};
            p = rn.exec(cmdMac2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
