package service;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.io.File;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;

import javax.swing.JFrame;

/**
 * @author yuan
 * */
public class VIdeoPlayer {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    /**
     *  play the video
     * @param path the video's path
     */
    public VIdeoPlayer(String path) {
        this.path = path;
    }

    String path;


    public void run() {

        JFrame frame = new JFrame("play");
        final JFXPanel VFXPanel = new JFXPanel();
        frame.setLayout(new BorderLayout());
        frame.add(VFXPanel, BorderLayout.CENTER);
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                File video_source = new File(path);
                Media m = new Media(video_source.toURI().toString());
                MediaPlayer player = new MediaPlayer(m);
                player.setAutoPlay(true);
                MediaView viewer = new MediaView(player);

                StackPane root = new StackPane();
                Scene scene = new Scene(root);

                // center video position
                javafx.geometry.Rectangle2D screen = Screen.getPrimary().getVisualBounds();
                viewer.setX((screen.getWidth() - frame.getWidth()) / 2);
                viewer.setY((screen.getHeight() - frame.getHeight()) / 2);

                // resize video based on screen size
                DoubleProperty width = viewer.fitWidthProperty();
                DoubleProperty height = viewer.fitHeightProperty();
                width.bind(Bindings.selectDouble(viewer.sceneProperty(), "width"));
                height.bind(Bindings.selectDouble(viewer.sceneProperty(), "height"));
                viewer.setPreserveRatio(true);

                root.getChildren().add(viewer);
                VFXPanel.setScene(scene);
                frame.add(VFXPanel, BorderLayout.CENTER);


            } });

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation((screenWidth - WIDTH) / 2, (screenHeight - HEIGHT) / 2);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        VIdeoPlayer c = new VIdeoPlayer("video\\3.mp4");
        c.run();
    }

}  