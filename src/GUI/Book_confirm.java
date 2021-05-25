/*
 * Created by JFormDesigner on Sun Apr 18 17:28:17 CST 2021
 */

package GUI;

import dao.alldo.MemberDO;
import dao.alldo.UserDO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class Book_confirm extends JFrame {
    MemberDO m;
    UserDO trainer;
    public Book_confirm(MemberDO m, UserDO trainer) {
        initComponents();
        this.frame1.setVisible(true);
        this.m = m;
        this. trainer = trainer;
    }

    private void button1MouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void button2MouseClicked(MouseEvent e) {
        frame1.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - PangYu
        frame1 = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        spinner1 = new JSpinner();
        label6 = new JLabel();
        label7 = new JLabel();
        spinner2 = new JSpinner();
        scrollPane3 = new JScrollPane();
        list1 = new JList();
        button1 = new JButton();
        button2 = new JButton();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- label1 ----
            label1.setText("Booking course");
            frame1ContentPane.add(label1);
            label1.setBounds(10, 5, 175, 42);

            //---- label2 ----
            label2.setText("Trainer:");
            frame1ContentPane.add(label2);
            label2.setBounds(new Rectangle(new Point(75, 55), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("Course:");
            frame1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(75, 90), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("Date:");
            frame1ContentPane.add(label4);
            label4.setBounds(new Rectangle(new Point(50, 120), label4.getPreferredSize()));

            //---- label5 ----
            label5.setText("Time:");
            frame1ContentPane.add(label5);
            label5.setBounds(new Rectangle(new Point(65, 160), label5.getPreferredSize()));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(165, 55, 155, scrollPane1.getPreferredSize().height);

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(textArea2);
            }
            frame1ContentPane.add(scrollPane2);
            scrollPane2.setBounds(165, 85, 155, scrollPane2.getPreferredSize().height);
            frame1ContentPane.add(spinner1);
            spinner1.setBounds(new Rectangle(new Point(175, 115), spinner1.getPreferredSize()));

            //---- label6 ----
            label6.setText("Month");
            frame1ContentPane.add(label6);
            label6.setBounds(new Rectangle(new Point(105, 120), label6.getPreferredSize()));

            //---- label7 ----
            label7.setText("Day");
            frame1ContentPane.add(label7);
            label7.setBounds(185, 120, 20, label7.getPreferredSize().height);
            frame1ContentPane.add(spinner2);
            spinner2.setBounds(new Rectangle(new Point(290, 115), spinner2.getPreferredSize()));

            //======== scrollPane3 ========
            {
                scrollPane3.setViewportView(list1);
            }
            frame1ContentPane.add(scrollPane3);
            scrollPane3.setBounds(130, 160, 160, 40);

            //---- button1 ----
            button1.setText("Confirm");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            frame1ContentPane.add(button1);
            button1.setBounds(60, 245, 95, button1.getPreferredSize().height);

            //---- button2 ----
            button2.setText("Cancle");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(215, 245, 100, button2.getPreferredSize().height);

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
    // Generated using JFormDesigner Evaluation license - PangYu
    private JFrame frame1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JSpinner spinner1;
    private JLabel label6;
    private JLabel label7;
    private JSpinner spinner2;
    private JScrollPane scrollPane3;
    private JList list1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
