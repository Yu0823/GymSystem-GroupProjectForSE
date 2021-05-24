/*
 * Created by JFormDesigner on Mon Apr 12 18:01:18 CST 2021
 */

package GUI;

import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;
import service.CustomerService;
import service.TrainerService;
import service.Util;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author yly
 */
public class Register extends JPanel {
    public Register() {
        initComponents();
        Register.setVisible(true);
    }

    private void button2ActionPerformed(ActionEvent e) {
        String type = comboBox1.getSelectedItem().toString();
        String id = Util.generateID(type);
        textField1.setText(id);
    }

    private void button1ActionPerformed(ActionEvent e) {
        String id = textField1.getText();
        String password = textField2.getText();
        String confirmPassword = textField3.getText();
        String type = comboBox1.getSelectedItem().toString();
        if(password.equals(confirmPassword)){
            if(type.equals("trainer")){
                TrainerService s1 = new TrainerService();
                TrainerDO trainer = new TrainerDO();
                trainer.setId(id);
                trainer.setPassword(password);
                String result = s1.register(trainer);
                if(result.equals("Register success, please login.")){
                    Notice n = new Notice("register");
                    UserLogin u = new UserLogin();
                    Register.dispose();
                }
                else
                    warning.setText(result);
            }else {
                CustomerService s1 = new CustomerService();
                MemberDO m = new MemberDO();
                m.setId(id);
                m.setPassword(password);
                String result = s1.register(m);
                if(result.equals("Register success, please login.")){
                    JOptionPane.showMessageDialog(Register, "Register Success", "message",JOptionPane.WARNING_MESSAGE);
                    UserLogin u = new UserLogin();
                    Register.dispose();
                }
                else
                    warning.setText(result);
            }
        }
        else
            warning.setText("password is not same");


    }

    private void button3ActionPerformed(ActionEvent e) {
        UserLogin u = new UserLogin();
        Register.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        Register = new JFrame();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        warning = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        comboBox1 = new JComboBox<>();
        button3 = new JButton();

        //======== Register ========
        {
            Register.setTitle("Register");
            var RegisterContentPane = Register.getContentPane();
            RegisterContentPane.setLayout(null);
            RegisterContentPane.add(textField1);
            textField1.setBounds(190, 30, 255, 55);
            RegisterContentPane.add(textField2);
            textField2.setBounds(190, 105, 255, 55);
            RegisterContentPane.add(textField3);
            textField3.setBounds(190, 190, 260, 55);
            RegisterContentPane.add(warning);
            warning.setBounds(60, 335, 550, 80);

            //---- label1 ----
            label1.setText("id");
            RegisterContentPane.add(label1);
            label1.setBounds(150, 45, 35, 35);

            //---- label2 ----
            label2.setText("password");
            RegisterContentPane.add(label2);
            label2.setBounds(new Rectangle(new Point(105, 120), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("confirm pasword");
            RegisterContentPane.add(label3);
            label3.setBounds(40, 205, 145, 30);

            //---- button1 ----
            button1.setText("register");
            button1.addActionListener(e -> button1ActionPerformed(e));
            RegisterContentPane.add(button1);
            button1.setBounds(195, 270, 140, 55);

            //---- button2 ----
            button2.setText("generate id automatically");
            button2.addActionListener(e -> button2ActionPerformed(e));
            RegisterContentPane.add(button2);
            button2.setBounds(375, 265, 235, 60);

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "member",
                "trainer"
            }));
            RegisterContentPane.add(comboBox1);
            comboBox1.setBounds(new Rectangle(new Point(40, 280), comboBox1.getPreferredSize()));

            //---- button3 ----
            button3.setText("back");
            button3.addActionListener(e -> button3ActionPerformed(e));
            RegisterContentPane.add(button3);
            button3.setBounds(new Rectangle(new Point(10, 25), button3.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < RegisterContentPane.getComponentCount(); i++) {
                    Rectangle bounds = RegisterContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = RegisterContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                RegisterContentPane.setMinimumSize(preferredSize);
                RegisterContentPane.setPreferredSize(preferredSize);
            }
            Register.pack();
            Register.setLocationRelativeTo(Register.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame Register;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel warning;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JComboBox<String> comboBox1;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

/**
 * test
    public static void main(String[] args) {
        Register r = new Register();
    }
 **/
}
