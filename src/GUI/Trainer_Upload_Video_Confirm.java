/*
 * Created by JFormDesigner on Wed May 26 18:05:44 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.TrainerDO;
import service.TrainerAddFilm;
import dao.alldo.VideoDO;
/**
 * @author MudongGuo
 */
public class Trainer_Upload_Video_Confirm extends JFrame {
    TrainerDO t;
    TrainerAddFilm taf = new TrainerAddFilm();
    VideoDO v = new VideoDO();
    String name;
    public Trainer_Upload_Video_Confirm(TrainerDO t, String path) {
        initComponents();
        frame1.setVisible(true);
        this.t = t;
        this.name = path.substring(0,path.length()-4);
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        frame1.dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        String videoid = this.name;
        String name = textField1.getText();
        String path = "video//"+videoid+".mp4";
        String type = comboBox1.getSelectedItem().toString();
        String length = "20min";
        String uploader = this.t.getId();
        String level;
        if(comboBox2.getSelectedItem().toString()=="All"){
            level = "0";
        }else if(comboBox2.getSelectedItem().toString()=="VIP"){
            level = "1";
        }else {
            level = "2";
        }
        v.setId(videoid);
        v.setUploader(t.getId());
        v.setLength(length);
        v.setVideoType(type);
        v.setPath(path);
        v.setLevel(level);
        v.setName(name);
        v.setUploader(uploader);
        if(taf.addFilm(v)==true){
            JOptionPane.showMessageDialog(null,"Video successfully uploaded!");
            frame1.setVisible(false);
            frame1.dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Video upload fail! Please input valid information!");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 666
        frame1 = new JFrame();
        button1 = new JButton();
        label1 = new JLabel();
        button3 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        label5 = new JLabel();
        textField1 = new JTextField();

        //======== frame1 ========
        {
            frame1.setUndecorated(true);
            frame1.setFont(new Font(Font.DIALOG, Font.ITALIC, 32));
            frame1.setTitle("Confirmation");
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- button1 ----
            button1.setText("Back");
            button1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button1.getFont().getStyle(), button1.getFont().getSize() + 8));
            button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.pink, Color.green, Color.orange, new Color(0, 77, 187)));
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            frame1ContentPane.add(button1);
            button1.setBounds(395, 315, 150, 50);

            //---- label1 ----
            label1.setText("Upload Video");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.pink);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5));
            frame1ContentPane.add(label1);
            label1.setBounds(60, 30, 120, 70);

            //---- button3 ----
            button3.setText("Confirm");
            button3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button3.getFont().getStyle(), button3.getFont().getSize() + 8));
            button3.setBorder(new BevelBorder(BevelBorder.RAISED, Color.magenta, Color.red, Color.pink, new Color(0, 73, 41)));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            frame1ContentPane.add(button3);
            button3.setBounds(65, 310, 150, 50);

            //---- label3 ----
            label3.setText("Type of the Video:");
            label3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(75, 240), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("Level of the video:");
            label4.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label4);
            label4.setBounds(new Rectangle(new Point(75, 190), label4.getPreferredSize()));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "Yoga",
                "Martial art",
                "Fitness",
                "Aerobics"
            }));
            frame1ContentPane.add(comboBox1);
            comboBox1.setBounds(new Rectangle(new Point(225, 235), comboBox1.getPreferredSize()));

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "All",
                "VIP",
                "SVIP"
            }));
            frame1ContentPane.add(comboBox2);
            comboBox2.setBounds(225, 190, 105, comboBox2.getPreferredSize().height);

            //---- label5 ----
            label5.setText("Name of the video:");
            label5.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label5);
            label5.setBounds(70, 140, 135, 17);
            frame1ContentPane.add(textField1);
            textField1.setBounds(225, 140, 230, textField1.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frame1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = frame1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frame1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frame1ContentPane.setMinimumSize(preferredSize);
                frame1ContentPane.setPreferredSize(preferredSize);
            }
            frame1.setSize(585, 460);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 666
    private JFrame frame1;
    private JButton button1;
    private JLabel label1;
    private JButton button3;
    private JLabel label3;
    private JLabel label4;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JLabel label5;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
