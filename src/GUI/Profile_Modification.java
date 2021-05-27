/*
 * Created by JFormDesigner on Mon May 24 20:15:45 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.MemberDO;
import service.CustomerChangeProfile;
import service.Util;
/**
 * @author MudongGuo
 */
public class Profile_Modification extends JFrame {
    MemberDO m;
    public Profile_Modification(MemberDO m) {
        initComponents();
        frame1.setVisible(true);
        this.m = m;
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        if(Util.checkEmail(textField3.getText())&&Util.checkPhone(textField2.getText()) == true&&textField1.getText()!="") {
            this.m.setName(textField1.getText());
            this.m.setPhoneNumber(textField2.getText());
            this.m.setEmail(textField3.getText());
            frame1.setVisible(false);
            CustomerChangeProfile s = new CustomerChangeProfile();
            s.changeProfile(m);
            JOptionPane.showMessageDialog(null,"Successfully Modified!");
            new Information(this.m);
            frame1.dispose();
        }else if(Util.checkEmail(textField3.getText())==false&&Util.checkPhone(textField2.getText()) == true){
            JOptionPane.showMessageDialog(null,"Invalid e-mail address!"+"\n"+"Please input again!");
        }else if(Util.checkEmail(textField3.getText())==true&&Util.checkPhone(textField2.getText()) == false){
            JOptionPane.showMessageDialog(null,"Invalid phone number format!"+"\n"+"Please input again!");
        }else if(textField1.getText()==""){
            JOptionPane.showMessageDialog(null,"Invalid name format!"+"\n"+"Please input again!");
        }else{
            JOptionPane.showMessageDialog(null,"Invalid e-mail address and phone number format!"+"\n"+"Please input again!");
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Information(this.m);
        frame1.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        label1 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== frame1 ========
        {
            frame1.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- label1 ----
            label1.setText("Personal Information Modification");
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 20));
            frame1ContentPane.add(label1);
            label1.setBounds(30, 30, 335, 40);

            //---- textField1 ----
            textField1.setBackground(new Color(255, 204, 255));
            frame1ContentPane.add(textField1);
            textField1.setBounds(160, 110, 150, textField1.getPreferredSize().height);

            //---- textField2 ----
            textField2.setBackground(new Color(255, 204, 255));
            frame1ContentPane.add(textField2);
            textField2.setBounds(160, 150, 150, textField2.getPreferredSize().height);

            //---- textField3 ----
            textField3.setBackground(new Color(255, 204, 255));
            frame1ContentPane.add(textField3);
            textField3.setBounds(160, 190, 150, textField3.getPreferredSize().height);

            //---- label2 ----
            label2.setText("New Name");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 15));
            frame1ContentPane.add(label2);
            label2.setBounds(new Rectangle(new Point(50, 110), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("New Phone");
            label3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 15));
            frame1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(50, 150), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("New Mail");
            label4.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 15));
            frame1ContentPane.add(label4);
            label4.setBounds(new Rectangle(new Point(50, 190), label4.getPreferredSize()));

            //---- button1 ----
            button1.setText("Confirm");
            button1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button1.getFont().getStyle() | Font.BOLD, button1.getFont().getSize() + 8));
            button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.blue, new Color(0, 166, 197), new Color(200, 83, 103), new Color(155, 65, 189)));
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            frame1ContentPane.add(button1);
            button1.setBounds(60, 270, 150, 50);

            //---- button2 ----
            button2.setText("Cancel");
            button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button2.getFont().getStyle() | Font.BOLD, button2.getFont().getSize() + 8));
            button2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(174, 53, 53), new Color(0, 131, 218), new Color(132, 128, 16), new Color(182, 80, 80)));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(280, 270, 150, 50);

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
            frame1.setSize(600, 450);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JFrame frame1;
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
