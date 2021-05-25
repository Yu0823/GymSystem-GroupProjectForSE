/*
 * Created by JFormDesigner on Tue May 25 11:49:07 CST 2021
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
public class Recharge extends JFrame {
    MemberDO m;
    public Recharge(MemberDO m) {
        initComponents();
        frame1.setVisible(true);
        this.m = m;
        if(m.getType().toString()=="VIP"){
            radioButton2.setVisible(false);
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Information(this.m);
        frame1.dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        label3 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label4 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

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
            button1.setBounds(495, 430, 150, 50);

            //---- label1 ----
            label1.setText("Account Upgrade");
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 17));
            frame1ContentPane.add(label1);
            label1.setBounds(25, 25, 175, 70);

            //---- button2 ----
            button2.setText("Confirm");
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

            //---- label3 ----
            label3.setText("Select the target level");
            label3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 26));
            frame1ContentPane.add(label3);
            label3.setBounds(110, 105, 290, 55);

            //---- radioButton1 ----
            radioButton1.setText("SVIP-200$");
            frame1ContentPane.add(radioButton1);
            radioButton1.setBounds(new Rectangle(new Point(105, 170), radioButton1.getPreferredSize()));

            //---- radioButton2 ----
            radioButton2.setText("VIP-100$");
            frame1ContentPane.add(radioButton2);
            radioButton2.setBounds(new Rectangle(new Point(105, 210), radioButton2.getPreferredSize()));

            //---- label4 ----
            label4.setText("Your account balance:");
            label4.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 19));
            frame1ContentPane.add(label4);
            label4.setBounds(110, 235, 195, 55);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(315, 255, 110, scrollPane1.getPreferredSize().height);

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
    private JLabel label1;
    private JButton button2;
    private JLabel label3;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label4;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
