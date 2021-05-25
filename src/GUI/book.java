/*
 * Created by JFormDesigner on Sun Apr 18 17:14:47 CST 2021
 */

package GUI;

import dao.UserDataUtil;
import dao.alldo.MemberDO;
import dao.alldo.UserDO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * @author unknown
 */
public class book extends JFrame {
    MemberDO m;
    UserDO trainer;
    public book(MemberDO m, String id) {
        initComponents();
        this.frame1.setVisible(true);
        this.m = m;
        this.trainer = UserDataUtil.findSingleNode(UserDataUtil.xpathBuilder("trainer","id",id));
        textArea13.setText(trainer.getInfo());
    }

    private void book_back(MouseEvent e) {
        System.exit(0);
    }

    private void book_confirm(MouseEvent e) {
        Book_confirm b = new Book_confirm(m,trainer);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        frame1 = new JFrame();
        book = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea12 = new JTextArea();
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        textArea13 = new JTextArea();
        label2 = new JLabel();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //======== book ========
            {
                book.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
                0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
                .BOTTOM,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,12),java.awt.Color.
                red),book. getBorder()));book. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
                beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException();}});
                book.setLayout(null);

                //---- button1 ----
                button1.setText("Return");
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button2MouseClicked(e);
                        book_back(e);
                    }
                });
                book.add(button1);
                button1.setBounds(275, 280, 100, button1.getPreferredSize().height);

                //---- button2 ----
                button2.setText("Book");
                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                        book_confirm(e);
                    }
                });
                book.add(button2);
                button2.setBounds(90, 280, 80, button2.getPreferredSize().height);

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(textArea12);
                }
                book.add(scrollPane1);
                scrollPane1.setBounds(215, 165, 190, 95);

                //---- label1 ----
                label1.setText("Course Information");
                book.add(label1);
                label1.setBounds(30, 195, 165, 35);

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(textArea13);
                }
                book.add(scrollPane2);
                scrollPane2.setBounds(215, 40, 190, 90);

                //---- label2 ----
                label2.setText("Trainer information");
                book.add(label2);
                label2.setBounds(new Rectangle(new Point(30, 70), label2.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < book.getComponentCount(); i++) {
                        Rectangle bounds = book.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = book.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    book.setMinimumSize(preferredSize);
                    book.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(book);
            book.setBounds(0, 0, 470, 335);

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
    private JPanel book;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTextArea textArea12;
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JTextArea textArea13;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
