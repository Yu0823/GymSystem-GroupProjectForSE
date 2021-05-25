/*
 * Created by JFormDesigner on Mon May 24 19:39:46 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
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
        panel1.add(new JTextArea(m.getInfo()));
        profile.setFont(new Font("微软雅黑",Font.BOLD,16));
        profile.setText("ID:"+m.getId()+"\n");
        profile.setText("Name:"+m.getName()+"\n");
        profile.setText("Age:"+m.getAge()+"\n");
        profile.setText("Email:"+m.getEmail()+"\n");
        profile.setText("Phone Number:"+m.getPhoneNumber()+"\n");
        profile.setText("Account type:"+m.getType()+"\n");
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
        label2 = new JLabel();
        panel1 = new JPanel();
        label1 = new JLabel();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        profile = new JTextArea();
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
                    button5MouseClicked(e);
                }
            });
            frame1ContentPane.add(button1);
            button1.setBounds(495, 430, 150, 50);

            //---- label2 ----
            label2.setText("Schedule");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label2.getFont().getStyle(), label2.getFont().getSize() + 5));
            frame1ContentPane.add(label2);
            label2.setBounds(305, 25, 115, 70);

            //======== panel1 ========
            {
                panel1.setBackground(new Color(204, 204, 255));
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
                border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER
                , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
                .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
                new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r"
                .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
                panel1.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(panel1);
            panel1.setBounds(305, 110, 345, 265);

            //---- label1 ----
            label1.setText("Personal Information");
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 17));
            frame1ContentPane.add(label1);
            label1.setBounds(25, 25, 175, 70);

            //---- button2 ----
            button2.setText("Modify");
            button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button2.getFont().getStyle(), button2.getFont().getSize() + 8));
            button2.setBackground(new Color(204, 204, 255));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(315, 430, 150, 50);

            //======== scrollPane1 ========
            {

                //---- profile ----
                profile.setBackground(new Color(204, 204, 255));
                scrollPane1.setViewportView(profile);
            }
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(25, 110, 235, 265);

            //---- button3 ----
            button3.setText("Recharge");
            button3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button3.getFont().getStyle(), button3.getFont().getSize() + 8));
            button3.setBackground(new Color(204, 204, 255));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            frame1ContentPane.add(button3);
            button3.setBounds(135, 430, 150, 50);

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
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JFrame frame1;
    private JButton button1;
    private JLabel label2;
    private JPanel panel1;
    private JLabel label1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTextArea profile;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
