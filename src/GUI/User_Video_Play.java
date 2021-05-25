/*
 * Created by JFormDesigner on Mon May 24 20:51:46 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.MemberDO;
import dao.alldo.VideoDO;
import service.CustomerListAllVideoId;
import service.CustomerSearchVideoByType;
import service.VIdeoPlayer;

/**
 * @author MudongGuo
 */
public class User_Video_Play extends JFrame {
    MemberDO m;
    public User_Video_Play(MemberDO m) {
        initComponents();
        frame1.setVisible(true);
        this.m = m;
        comboBox2.addItem("Yoga");
        comboBox2.addItem("Martial art");
        comboBox2.addItem("Fitness");
        comboBox2.addItem("Aerobics");
        int count1 = 0;
        if(count1==0){
            {
                CustomerListAllVideoId s1 = new CustomerListAllVideoId();
                for(String str:s1.listAllVideoId()){
                    comboBox1.addItem(str);
                }
                count1++;
            }
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Main_Menu(this.m);
        frame1.dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        String ID = comboBox1.getSelectedItem().toString();
        VIdeoPlayer newWindow = new VIdeoPlayer("video\\"+ID+".mp4");
        newWindow.run();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        String s = comboBox2.getSelectedItem().toString();
        //ID picture
        CustomerSearchVideoByType list = new CustomerSearchVideoByType();
        List<VideoDO> list1 = list.searchVideoByType(s);
        for(VideoDO a: list1){
            ImageIcon i = new ImageIcon(a.getPath());
            JLabel l = new JLabel();
            JLabel id = new JLabel();
            l.setIcon(i);
            l.setVisible(true);
            id.setText(a.getId());
            scrollPane1.add(l);
            scrollPane1.add(id);
        }
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 666
        frame1 = new JFrame();
        button1 = new JButton();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        comboBox1 = new JComboBox();
        label2 = new JLabel();
        button2 = new JButton();
        comboBox2 = new JComboBox();
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
            button1.setBackground(new Color(204, 204, 255));
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            frame1ContentPane.add(button1);
            button1.setBounds(540, 470, 150, 50);

            //---- label1 ----
            label1.setText("Video Play");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.white);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5));
            frame1ContentPane.add(label1);
            label1.setBounds(45, 25, 115, 70);
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(140, 110, 545, 345);
            frame1ContentPane.add(comboBox1);
            comboBox1.setBounds(260, 470, 100, 50);

            //---- label2 ----
            label2.setText("Select the ID of the video ");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
            label2.setAutoscrolls(true);
            frame1ContentPane.add(label2);
            label2.setBounds(40, 470, label2.getPreferredSize().width, 50);

            //---- button2 ----
            button2.setText("Play");
            button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button2.getFont().getStyle(), button2.getFont().getSize() + 8));
            button2.setBackground(new Color(204, 204, 255));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(370, 470, 150, 50);
            frame1ContentPane.add(comboBox2);
            comboBox2.setBounds(370, 45, 100, 50);

            //---- button3 ----
            button3.setText("Search");
            button3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button3.getFont().getStyle(), button3.getFont().getSize() + 8));
            button3.setBackground(new Color(204, 204, 255));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            frame1ContentPane.add(button3);
            button3.setBounds(490, 45, 150, 50);

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
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 666
    private JFrame frame1;
    private JButton button1;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JButton button2;
    private JComboBox comboBox2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
