/*
 * Created by JFormDesigner on Thu May 27 19:40:42 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.AdminDO;
import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;
import dao.alldo.PromoterDO;
import service.AdminAddCustomer;
import service.AdminAddTrainer;
import service.AdminAddPromoter;
import service.AdminDeleteCustomer;
import service.AdminDeletePromoter;
import service.AdminDeleteTrainer;

/**
 * @author MudongGuo
 */
public class Admin_Menu extends JFrame {
    AdminDO a;
    public Admin_Menu(AdminDO a) {
        initComponents();
        frame1.setVisible(true);
        this.a = a;
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new UserLogin();
        frame1.dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        String id = textField1.getText();
        String pwd = textField2.getText();
        String type = comboBox1.getSelectedItem().toString();
        if(type == "Customer"){
            AdminAddCustomer aac = new AdminAddCustomer();
            MemberDO m = new MemberDO();
            m.setId(id);
            m.setPassword(pwd);
            int result = aac.addCustomer(m);
            if(result==1){
                JOptionPane.showMessageDialog(null,"ID has been occupied! Please Try another ID!");
            }else if(result==2){
                JOptionPane.showMessageDialog(null,"Add a customer successfully!");
            }else{
                JOptionPane.showMessageDialog(null,"Invalid input format! Please try again!");
            }
        }else if(type == "Trainer"){
            AdminAddTrainer aac = new AdminAddTrainer();
            TrainerDO m = new TrainerDO();
            m.setId(id);
            m.setPassword(pwd);
            int result = aac.addTrainer(m);
            if(result==1){
                JOptionPane.showMessageDialog(null,"ID has been occupied! Please Try another ID!");
            }else if(result==2){
                JOptionPane.showMessageDialog(null,"Add a trainer successfully!");
            }else{
                JOptionPane.showMessageDialog(null,"Invalid input format! Please try again!");
            }
        }else{
            AdminAddPromoter aac = new AdminAddPromoter();
            PromoterDO m = new PromoterDO();
            m.setId(id);
            m.setPassword(pwd);
            int result = aac.addPromoter(m);
            if(result==1){
                JOptionPane.showMessageDialog(null,"ID has been occupied! Please Try another ID!");
            }else if(result==2){
                JOptionPane.showMessageDialog(null,"Add a Promoter successfully!");
            }else{
                JOptionPane.showMessageDialog(null,"Invalid input format! Please try again!");
            }
        }
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        String id = textField3.getText();
        String type = comboBox2.getSelectedItem().toString();
        if(type == "Customer"){
            AdminDeleteCustomer adc = new AdminDeleteCustomer();
            if(adc.deleteCustomer(id)){
                JOptionPane.showMessageDialog(null,"Delete a customer successfully!");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to delete a customer! Please try again!");
            }
        }else if(type == "Trainer"){
            AdminDeleteTrainer adc = new AdminDeleteTrainer();
            if(adc.deleteTrainer(id)){
                JOptionPane.showMessageDialog(null,"Delete a trainer successfully!");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to delete a trainer! Please try again!");
            }
        }else{
            AdminDeletePromoter adc = new AdminDeletePromoter();
            if(adc.deletePromoter(id)){
                JOptionPane.showMessageDialog(null,"Delete a promoter successfully!");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to delete a promoter! Please try again!");
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button2 = new JButton();
        button3 = new JButton();
        button5 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label4 = new JLabel();
        comboBox1 = new JComboBox<>();
        label5 = new JLabel();
        label6 = new JLabel();
        textField3 = new JTextField();
        comboBox2 = new JComboBox<>();

        //======== frame1 ========
        {
            frame1.setFont(new Font(Font.DIALOG, Font.ITALIC, 32));
            frame1.setForeground(SystemColor.desktop);
            frame1.setBackground(UIManager.getColor("ActionButton.focusedBorderColor"));
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- button2 ----
            button2.setText("Add");
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
            button2.setBounds(130, 235, 150, 50);

            //---- button3 ----
            button3.setText("Delete");
            button3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button3.getFont().getStyle() | Font.BOLD, button3.getFont().getSize() + 8));
            button3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 65, 93), Color.darkGray, new Color(0, 117, 190), Color.yellow));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            frame1ContentPane.add(button3);
            button3.setBounds(450, 235, 150, 50);

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
            button5.setBounds(520, 40, 150, 50);

            //---- label1 ----
            label1.setText("Administrator");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.black);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 10));
            frame1ContentPane.add(label1);
            label1.setBounds(45, 25, 155, 70);

            //---- label2 ----
            label2.setText("new ID:");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label2);
            label2.setBounds(new Rectangle(new Point(55, 135), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("new Password:");
            label3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(55, 165), label3.getPreferredSize()));
            frame1ContentPane.add(textField1);
            textField1.setBounds(165, 135, 115, textField1.getPreferredSize().height);
            frame1ContentPane.add(textField2);
            textField2.setBounds(165, 165, 115, textField2.getPreferredSize().height);

            //---- label4 ----
            label4.setText("Type:");
            label4.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label4);
            label4.setBounds(new Rectangle(new Point(55, 195), label4.getPreferredSize()));

            //---- comboBox1 ----
            comboBox1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "Customer",
                "Trainer",
                "Promoter"
            }));
            frame1ContentPane.add(comboBox1);
            comboBox1.setBounds(new Rectangle(new Point(165, 195), comboBox1.getPreferredSize()));

            //---- label5 ----
            label5.setText("ID to be delete:");
            label5.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label5);
            label5.setBounds(new Rectangle(new Point(380, 135), label5.getPreferredSize()));

            //---- label6 ----
            label6.setText("Type:");
            label6.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            frame1ContentPane.add(label6);
            label6.setBounds(new Rectangle(new Point(380, 165), label6.getPreferredSize()));
            frame1ContentPane.add(textField3);
            textField3.setBounds(485, 135, 115, textField3.getPreferredSize().height);

            //---- comboBox2 ----
            comboBox2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "Customer",
                "Trainer",
                "Promoter"
            }));
            frame1ContentPane.add(comboBox2);
            comboBox2.setBounds(new Rectangle(new Point(485, 165), comboBox2.getPreferredSize()));

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
    private JButton button5;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label4;
    private JComboBox<String> comboBox1;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField3;
    private JComboBox<String> comboBox2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
