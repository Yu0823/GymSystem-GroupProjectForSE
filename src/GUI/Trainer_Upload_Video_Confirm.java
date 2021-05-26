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
    public Trainer_Upload_Video_Confirm(TrainerDO t) {
        initComponents();
        frame1.setVisible(true);
        this.t = t;
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        frame1.dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        String name = textField1.getText();
        String path = textField2.getText();
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
        v.setId(t.getId());
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
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button1 = new JButton();
        label1 = new JLabel();
        button3 = new JButton();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        label5 = new JLabel();
        textField2 = new JTextField();

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
            button1.setBounds(360, 310, 150, 50);

            //---- label1 ----
            label1.setText("Upload Video");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.pink);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5));
            frame1ContentPane.add(label1);
            label1.setBounds(45, 25, 115, 70);

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
            button3.setBounds(360, 245, 150, 50);

            //---- label2 ----
            label2.setText("Name of the video:");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label2);
            label2.setBounds(new Rectangle(new Point(65, 105), label2.getPreferredSize()));
            frame1ContentPane.add(textField1);
            textField1.setBounds(200, 105, 140, textField1.getPreferredSize().height);

            //---- label3 ----
            label3.setText("Type of the Video:");
            label3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(65, 225), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("Level of the video:");
            label4.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label4);
            label4.setBounds(new Rectangle(new Point(65, 185), label4.getPreferredSize()));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "Yoga",
                "Martial art",
                "Fitness",
                "Aerobics"
            }));
            frame1ContentPane.add(comboBox1);
            comboBox1.setBounds(new Rectangle(new Point(200, 225), comboBox1.getPreferredSize()));

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "All",
                "VIP",
                "SVIP"
            }));
            frame1ContentPane.add(comboBox2);
            comboBox2.setBounds(200, 185, 105, comboBox2.getPreferredSize().height);

            //---- label5 ----
            label5.setText("Path of the video:");
            label5.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label5);
            label5.setBounds(new Rectangle(new Point(65, 145), label5.getPreferredSize()));
            frame1ContentPane.add(textField2);
            textField2.setBounds(200, 145, 140, textField2.getPreferredSize().height);

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
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JFrame frame1;
    private JButton button1;
    private JLabel label1;
    private JButton button3;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JLabel label4;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JLabel label5;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
