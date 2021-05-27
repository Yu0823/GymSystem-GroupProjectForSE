/*
 * Created by JFormDesigner on Mon May 24 19:39:46 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
import dao.alldo.MemberDO;

/**
 * @author MudongGuo
 */
public class Information extends JFrame {
    MemberDO m;
    public Information(MemberDO m) {
        initComponents();
        frame1.setVisible(true);
        this.m = m;
        //panel1.add(new JTextArea(m.getInfo()));
        profile.setFont(new Font("微软雅黑",Font.BOLD,16));
        profile.setText("ID:"+m.getId()+"\n"+"Name:"+m.getName()+"\n"+"Age:"+m.getAge()+"\n"+"Email:"+m.getEmail()+"\n"+"Phone Number:"+m.getPhoneNumber()+"\n"+"Account type:"+m.getType()+"\n");
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Profile_Modification(this.m);
        frame1.dispose();
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Main_Menu(this.m);
        frame1.dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        if(m.getType().toString()=="SVIP"){
            JOptionPane.showMessageDialog(null,"Your account is already the highest level!");
        }else{
            frame1.setVisible(false);
            new Recharge(this.m);
            frame1.dispose();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        profile = new JTextArea();
        button3 = new JButton();

        //======== frame1 ========
        {
            frame1.setFont(new Font(Font.DIALOG, Font.ITALIC, 32));
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- button1 ----
            button1.setText("Back");
            button1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button1.getFont().getStyle() | Font.BOLD, button1.getFont().getSize() + 8));
            button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.orange, Color.red, Color.cyan, Color.magenta));
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            frame1ContentPane.add(button1);
            button1.setBounds(405, 260, 150, 50);

            //---- label1 ----
            label1.setText("Personal Information");
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 20));
            frame1ContentPane.add(label1);
            label1.setBounds(25, 25, 215, 70);

            //---- button2 ----
            button2.setText("Modify");
            button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button2.getFont().getStyle() | Font.BOLD, button2.getFont().getSize() + 8));
            button2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.darkGray, new Color(0, 206, 157), new Color(216, 107, 107), new Color(52, 157, 233)));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(405, 180, 150, 50);

            //======== scrollPane1 ========
            {

                //---- profile ----
                profile.setBackground(Color.white);
                profile.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 12));
                profile.setBorder(new MatteBorder(5, 2, 1, 2, Color.gray));
                profile.setEditable(false);
                scrollPane1.setViewportView(profile);
            }
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(25, 110, 235, 265);

            //---- button3 ----
            button3.setText("Recharge");
            button3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button3.getFont().getStyle() | Font.BOLD, button3.getFont().getSize() + 8));
            button3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(80, 44, 228), Color.magenta, Color.yellow, Color.cyan));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            frame1ContentPane.add(button3);
            button3.setBounds(405, 100, 150, 50);

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
            frame1.setSize(710, 570);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JFrame frame1;
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTextArea profile;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
