/*
 * Created by JFormDesigner on Mon Apr 12 17:18:31 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;
import service.CustomerService;
import service.TrainerService;

/**
 * @author unknown
 */
public class UserLogin {
    public UserLogin() {
        initComponents();
        Login.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        String type = comboBox1.getSelectedItem().toString();
        String id = textField1.getText();
        String password = String.valueOf(passwordField1.getPassword());
        switch (type){
            case "trainer":
                TrainerService s1 = new TrainerService();
                TrainerDO u = new TrainerDO();
                u.setPassword(password);
                u.setId(id);
                if(s1.login(u) == null)
                    new Notice("The password or userid is wrong");
                else{
                    TrainerDO trainer = s1.login(u);

                    Login.dispose();
                }
                break;
            case "member":
                CustomerService s2 = new CustomerService();
                MemberDO m = new MemberDO();
                m.setPassword(password);
                m.setId(id);
                if(s2.login(m)==null)
                    new Notice("The password or userid is wrong");
                else{
                    MemberDO member = s2.login(m);
                    new CustomerMainmenu(member);
                    Login.dispose();
                }
        }
    }

    private void button2ActionPerformed(ActionEvent e) {
        Register r = new Register();
        Login.dispose();
    }

    private void comboBox1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        Login = new JFrame();
        label2 = new JLabel();
        panel1 = new JPanel();
        passwordField1 = new JPasswordField();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        comboBox1 = new JComboBox<>();
        label5 = new JLabel();
        label6 = new JLabel();

        //======== Login ========
        {
            Login.setTitle("Login");
            var LoginContentPane = Login.getContentPane();
            LoginContentPane.setLayout(null);

            //---- label2 ----
            label2.setText("welcome!");
            LoginContentPane.add(label2);
            label2.setBounds(285, 10, 90, 65);

            //======== panel1 ========
            {
                panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
                . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing
                .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
                Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
                ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
                public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName (
                ) ) )throw new RuntimeException( ) ;} } );
                panel1.setLayout(null);

                //---- passwordField1 ----
                passwordField1.setToolTipText("input the passworld");
                panel1.add(passwordField1);
                passwordField1.setBounds(130, 45, 270, 41);
                panel1.add(textField1);
                textField1.setBounds(130, 0, 270, 41);

                //---- button1 ----
                button1.setText("login");
                button1.addActionListener(this::button1ActionPerformed);
                panel1.add(button1);
                button1.setBounds(90, 115, 135, 45);

                //---- button2 ----
                button2.setText("register");
                button2.addActionListener(this::button2ActionPerformed);
                panel1.add(button2);
                button2.setBounds(335, 115, 115, 43);

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "trainer",
                    "member",
                    "promoter",
                    "admin"
                }));
                panel1.add(comboBox1);
                comboBox1.setBounds(new Rectangle(new Point(410, 0), comboBox1.getPreferredSize()));

                //---- label5 ----
                label5.setText("user id");
                panel1.add(label5);
                label5.setBounds(35, 10, 90, label5.getPreferredSize().height);

                //---- label6 ----
                label6.setText("password");
                panel1.add(label6);
                label6.setBounds(30, 55, 90, label6.getPreferredSize().height);

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
            LoginContentPane.add(panel1);
            panel1.setBounds(55, 105, 600, 240);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < LoginContentPane.getComponentCount(); i++) {
                    Rectangle bounds = LoginContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = LoginContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                LoginContentPane.setMinimumSize(preferredSize);
                LoginContentPane.setPreferredSize(preferredSize);
            }
            Login.pack();
            Login.setLocationRelativeTo(Login.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame Login;
    private JLabel label2;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JComboBox<String> comboBox1;
    private JLabel label5;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        UserLogin u = new UserLogin();

    }
}
