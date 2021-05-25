/*
 * Created by JFormDesigner on Tue May 25 10:50:09 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;
import service.CustomerListAllTrainerId;
import service.CustomerSearchTrainerById;

/**
 * @author MudongGuo
 */
public class Reservation extends JFrame {
    MemberDO m;
    public Reservation(MemberDO m) {
        initComponents();
        frame1.setVisible(true);
        this.m = m;
        int count1 = 0;
        if(count1==0){
            {
                CustomerListAllTrainerId s1 = new CustomerListAllTrainerId();
                for(String str:s1.listAllTrainerId()){
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
        CustomerSearchTrainerById c = new CustomerSearchTrainerById();
        new Reservation_Confirm(this.m, c.searchById(comboBox1.getSelectedItem().toString()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button1 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        button2 = new JButton();
        comboBox1 = new JComboBox();

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
            label1.setText("Reservation");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.white);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5));
            frame1ContentPane.add(label1);
            label1.setBounds(45, 25, 115, 70);

            //---- label2 ----
            label2.setText("Select the ID of the Trainer ");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
            label2.setAutoscrolls(true);
            frame1ContentPane.add(label2);
            label2.setBounds(40, 470, label2.getPreferredSize().width, 50);
            frame1ContentPane.add(scrollPane1);
            scrollPane1.setBounds(140, 110, 545, 345);

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
            button2.setBounds(370, 470, 150, 50);
            frame1ContentPane.add(comboBox1);
            comboBox1.setBounds(260, 470, 100, 50);

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
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JButton button2;
    private JComboBox comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
