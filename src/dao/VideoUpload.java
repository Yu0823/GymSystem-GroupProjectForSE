package dao;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

/**
 * @author yu
 * Put the video that trainer want to upload to our database
 */
public class VideoUpload {

    /**
     * Move the video in mp4 type the trainer choose and copy to the destination you set;
     * @param des the destination of the file copying
     * @return the file name you choose
     */
    public static String fileChooser(String des) {
        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "MP4 Videos", "mp4");
            //set the type
            chooser.setFileFilter(filter);

            //open the panel
            int returnVal = chooser.showOpenDialog(new JPanel());


            File file = chooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());
            copyFile(file.getAbsolutePath(), des + file.getName());
            return file.getName();
        }catch (Exception e){
            return null;
        }

    }

    /**
     * Copy the file from the oldPath to the new Path
     * @param oldPath the old path of the file
     * @param newPath the new path
     * @return true if success, false if fail
     */
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
        fileChooser("data/");
    }
}
