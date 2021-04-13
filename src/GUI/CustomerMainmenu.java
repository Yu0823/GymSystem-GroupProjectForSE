/*
 * Created by JFormDesigner on Mon Apr 12 17:12:01 CST 2021
 */

package GUI;

import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class CustomerMainmenu {
    MemberDO member;
    public CustomerMainmenu(MemberDO trainer) {
        initComponents();
        this.member = member;
        User.setVisible(true);

    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        
    }

    private void button2MouseClicked(MouseEvent e) {
        CustomerSearchTrainer cst = new CustomerSearchTrainer(member);
        User.dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        User = new Frame();
        scrollBar1 = new JScrollBar();
        label1 = new JLabel();
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        MyActivity = new JPanel();
        label2 = new JLabel();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        Membership = new JPanel();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== User ========
        {
            User.setTitle("User");
            User.setLayout(null);
            User.add(scrollBar1);
            scrollBar1.setBounds(605, 0, 15, 450);

            //---- label1 ----
            label1.setText("Home");
            User.add(label1);
            label1.setBounds(155, 20, 80, 30);

            //======== panel1 ========
            {
                panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
                .border.EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder
                .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.
                awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder()))
                ;panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
                ){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException();}})
                ;
                panel1.setLayout(null);

                //---- button1 ----
                button1.setText("Home");
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });
                panel1.add(button1);
                button1.setBounds(new Rectangle(new Point(15, 10), button1.getPreferredSize()));

                //---- button2 ----
                button2.setText("Trainer");
                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button2MouseClicked(e);
                    }
                });
                panel1.add(button2);
                button2.setBounds(new Rectangle(new Point(15, 60), button2.getPreferredSize()));

                //---- button3 ----
                button3.setText("Video");
                button3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button3MouseClicked(e);
                    }
                });
                panel1.add(button3);
                button3.setBounds(new Rectangle(new Point(15, 110), button3.getPreferredSize()));

                //---- button4 ----
                button4.setText("Profile");
                button4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button4MouseClicked(e);
                    }
                });
                panel1.add(button4);
                button4.setBounds(new Rectangle(new Point(15, 160), button4.getPreferredSize()));

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
            User.add(panel1);
            panel1.setBounds(20, 25, 110, 380);

            //======== MyActivity ========
            {
                MyActivity.setLayout(null);

                //---- label2 ----
                label2.setText("My Activity");
                MyActivity.add(label2);
                label2.setBounds(5, 10, 110, label2.getPreferredSize().height);

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(textArea2);
                }
                MyActivity.add(scrollPane2);
                scrollPane2.setBounds(5, 35, 320, 115);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < MyActivity.getComponentCount(); i++) {
                        Rectangle bounds = MyActivity.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = MyActivity.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    MyActivity.setMinimumSize(preferredSize);
                    MyActivity.setPreferredSize(preferredSize);
                }
            }
            User.add(MyActivity);
            MyActivity.setBounds(150, 50, 335, 165);

            //======== Membership ========
            {
                Membership.setLayout(null);

                //---- label3 ----
                label3.setText("My Membership");
                Membership.add(label3);
                label3.setBounds(new Rectangle(new Point(5, 10), label3.getPreferredSize()));

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(textArea1);
                }
                Membership.add(scrollPane1);
                scrollPane1.setBounds(5, 40, 320, 110);
            }
            User.add(Membership);
            Membership.setBounds(150, 225, 335, 165);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < User.getComponentCount(); i++) {
                    Rectangle bounds = User.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = User.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                User.setMinimumSize(preferredSize);
                User.setPreferredSize(preferredSize);
            }
            User.pack();
            User.setLocationRelativeTo(User.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private Frame User;
    private JScrollBar scrollBar1;
    private JLabel label1;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel MyActivity;
    private JLabel label2;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JPanel Membership;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
