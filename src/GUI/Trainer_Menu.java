/*
 * Created by JFormDesigner on Wed May 26 16:15:29 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.TrainerDO;
import service.TrainerListConformedClassInformation;
/**
 * @author MudongGuo
 */
public class Trainer_Menu extends JFrame {
    TrainerDO t;
    TrainerListConformedClassInformation tlc = new TrainerListConformedClassInformation();

    public Trainer_Menu(TrainerDO t) {
        initComponents();
        frame1.setVisible(true);
        this.t = t;
        textArea1.append(tlc.listConfirmedClassInformation(this.t.getId()));
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new UserLogin();
        frame1.dispose();
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Trainer_Information(this.t);
        frame1.dispose();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Trainer_Upload_Video(this.t);
        frame1.dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Trainer_Confirm_Reservation(this.t);
        frame1.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== frame1 ========
        {
            frame1.setFont(new Font(Font.DIALOG, Font.ITALIC, 32));
            frame1.setForeground(SystemColor.desktop);
            frame1.setBackground(UIManager.getColor("ActionButton.focusedBorderColor"));
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- button2 ----
            button2.setText("Appointment");
            button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button2.getFont().getStyle() | Font.BOLD, button2.getFont().getSize() + 8));
            button2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(170, 71, 209), Color.orange, new Color(0, 73, 158), new Color(135, 123, 169)));
            button2.setMaximumSize(new Dimension(122, 28));
            button2.setMinimumSize(new Dimension(122, 28));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(45, 110, 150, 50);

            //---- button3 ----
            button3.setText("My Video");
            button3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button3.getFont().getStyle() | Font.BOLD, button3.getFont().getSize() + 8));
            button3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 65, 93), Color.darkGray, new Color(0, 117, 190), Color.yellow));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            frame1ContentPane.add(button3);
            button3.setBounds(40, 180, 150, 50);

            //---- button4 ----
            button4.setText("Profile");
            button4.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button4.getFont().getStyle() | Font.BOLD, button4.getFont().getSize() + 8));
            button4.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 126, 219), new Color(112, 42, 42), new Color(36, 130, 212), new Color(0, 96, 221)));
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            frame1ContentPane.add(button4);
            button4.setBounds(40, 250, 150, 50);

            //---- button5 ----
            button5.setText("Log out");
            button5.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button5.getFont().getStyle() | Font.BOLD, button5.getFont().getSize() + 8));
            button5.setBorder(new BevelBorder(BevelBorder.RAISED, Color.yellow, new Color(0, 114, 189), new Color(229, 137, 78), new Color(33, 41, 70)));
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            frame1ContentPane.add(button5);
            button5.setBounds(40, 320, 150, 50);

            //---- label1 ----
            label1.setText("Home Page");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.black);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 10));
            frame1ContentPane.add(label1);
            label1.setBounds(45, 25, 155, 70);

            //---- label2 ----
            label2.setText("Future schedule");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label2.getFont().getStyle(), label2.getFont().getSize() + 5));
            frame1ContentPane.add(label2);
            label2.setBounds(305, 25, 145, 70);

            //======== scrollPane1 ========
            {
                scrollPane1.setForeground(Color.white);

                //---- textArea1 ----
                textArea1.setEditable(false);
                textArea1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 12));
                scrollPane1.setViewportView(textArea1);
            }
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(310, 110, 340, 315);

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
            frame1.setSize(710, 500);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JFrame frame1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
