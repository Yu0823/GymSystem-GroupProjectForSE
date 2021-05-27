/*
 * Created by JFormDesigner on Wed May 26 16:27:06 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.TrainerDO;
import dao.alldo.VideoDO;
import service.TrainerListConformedClassInformation;
import service.TrainerListUpload;
import service.TrainerListVideo;
import service.VIdeoPlayer;
import service.TrainerDeleteFilm;

import java.util.Iterator;
import java.util.List;
/**
 * @author MudongGuo
 */
public class Trainer_Upload_Video extends JFrame {
    TrainerDO t;
    TrainerListUpload tll = new TrainerListUpload();
    TrainerListVideo tlv = new TrainerListVideo();
    TrainerDeleteFilm tdf = new TrainerDeleteFilm();
    public Trainer_Upload_Video(TrainerDO trainerDO) {
        initComponents();
        frame1.setVisible(true);
        this.t = trainerDO;
        textArea1.append(tll.listUpload(t.getId()));
        List<VideoDO> lv = tlv.listUpload(this.t.getId());
        for(VideoDO str:lv){
            comboBox1.addItem(str.getId());
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Trainer_Menu(this.t);
        frame1.dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        new Trainer_Upload_Video_Confirm(this.t);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        if(comboBox2.getSelectedItem().toString()=="Watch"){
            String id = comboBox1.getSelectedItem().toString();
            VIdeoPlayer vp = new VIdeoPlayer("video//"+id+".mp4");
            vp.run();
        }else if(comboBox2.getSelectedItem().toString()=="Delete"){
            String id = comboBox1.getSelectedItem().toString();
            tdf.deleteFilm(id);
            JOptionPane.showMessageDialog(null,"You have delete the video successfully!");
            frame1.setVisible(false);
            frame1.dispose();
            new Trainer_Upload_Video(this.t);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button1 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button2 = new JButton();
        comboBox1 = new JComboBox();
        comboBox2 = new JComboBox<>();
        button3 = new JButton();

        //======== frame1 ========
        {
            frame1.setUndecorated(true);
            frame1.setFont(new Font(Font.DIALOG, Font.ITALIC, 32));
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
            button1.setBounds(510, 470, 150, 50);

            //---- label1 ----
            label1.setText("My Video");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.pink);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5));
            frame1ContentPane.add(label1);
            label1.setBounds(45, 25, 115, 70);

            //---- label2 ----
            label2.setText("Select the ID of the video and your choice");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
            label2.setAutoscrolls(true);
            frame1ContentPane.add(label2);
            label2.setBounds(40, 425, label2.getPreferredSize().width, 50);

            //======== scrollPane1 ========
            {
                scrollPane1.setBorder(new MatteBorder(4, 2, 1, 2, Color.gray));

                //---- textArea1 ----
                textArea1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 13));
                textArea1.setForeground(Color.black);
                scrollPane1.setViewportView(textArea1);
            }
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(140, 50, 545, 345);

            //---- button2 ----
            button2.setText("Confirm");
            button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button2.getFont().getStyle(), button2.getFont().getSize() + 8));
            button2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.yellow, Color.red, Color.magenta, new Color(0, 119, 182)));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(250, 470, 150, 50);
            frame1ContentPane.add(comboBox1);
            comboBox1.setBounds(35, 470, 100, 50);

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "Watch",
                "Delete"
            }));
            frame1ContentPane.add(comboBox2);
            comboBox2.setBounds(145, 470, 100, 50);

            //---- button3 ----
            button3.setText("Upload");
            button3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button3.getFont().getStyle(), button3.getFont().getSize() + 8));
            button3.setBorder(new BevelBorder(BevelBorder.RAISED, Color.magenta, Color.red, Color.pink, new Color(0, 73, 41)));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            frame1ContentPane.add(button3);
            button3.setBounds(510, 415, 150, 50);

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
            frame1.setSize(725, 585);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JFrame frame1;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button2;
    private JComboBox comboBox1;
    private JComboBox<String> comboBox2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
