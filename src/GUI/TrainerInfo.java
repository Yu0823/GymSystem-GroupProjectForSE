package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Sun Apr 11 18:55:03 CST 2021
 */



/**
 * @author Mudong Guo
 */
public class TrainerInfo extends JFrame {
    public TrainerInfo() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {

    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        frame1 = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        label3 = new JLabel();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        scrollPane3 = new JScrollPane();
        textArea3 = new JTextArea();
        button1 = new JButton();
        button2 = new JButton();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);
            frame1ContentPane.add(label1);
            label1.setBounds(45, 35, 170, 145);

            //---- label2 ----
            label2.setText("Trainer information");
            frame1ContentPane.add(label2);
            label2.setBounds(new Rectangle(new Point(250, 35), label2.getPreferredSize()));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(255, 60, 190, 90);

            //---- label3 ----
            label3.setText("Course Information");
            frame1ContentPane.add(label3);
            label3.setBounds(250, 165, 165, 35);

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(textArea2);
            }
            frame1ContentPane.add(scrollPane2);
            scrollPane2.setBounds(255, 200, 190, 95);

            //======== scrollPane3 ========
            {
                scrollPane3.setViewportView(textArea3);
            }
            frame1ContentPane.add(scrollPane3);
            scrollPane3.setBounds(45, 200, 160, 95);

            //---- button1 ----
            button1.setText("Book");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            frame1ContentPane.add(button1);
            button1.setBounds(60, 350, 115, button1.getPreferredSize().height);

            //---- button2 ----
            button2.setText("Return");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(new Rectangle(new Point(305, 350), button2.getPreferredSize()));

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
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame frame1;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JLabel label3;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JScrollPane scrollPane3;
    private JTextArea textArea3;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
