package GUI;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

/**
 * @author yu
 */
public class FileTest {
    public static void fileChooser() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "MP4 Videos", "mp4");
        //set the type
        chooser.setFileFilter(filter);

        //open the panel
        int returnVal = chooser.showOpenDialog(new JPanel());

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("你打开的文件是: " +
                    chooser.getSelectedFile().getName());
        }


        File file = chooser.getSelectedFile();
        System.out.println(file.getAbsolutePath());
        copyFile(file.getAbsolutePath(), "data/videoFile/" + file.getName());
    }

    public static boolean copyFile(String oldPath, String newPath) {
        try {
            int byteSum = 0;
            int byteRead = 0;
            File oldFile = new File(oldPath);
            if (oldFile.exists()) {
                InputStream in = new FileInputStream(oldPath);
                System.out.println(newPath);
                FileOutputStream out = new FileOutputStream(newPath);
                byte[] buffer = new byte[1024];
                while ((byteRead = in.read(buffer)) != -1) {
                    byteSum += byteRead;
                    //the whole byte sum
                    out.write(buffer, 0, byteRead);
                }
                in.close();
                out.close();
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("Met error when copying file!");
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        fileChooser();
    }
}