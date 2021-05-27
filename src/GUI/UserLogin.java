/*
 * Created by JFormDesigner on Mon Apr 12 17:18:31 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;



import dao.alldo.AdminDO;
import dao.alldo.MemberDO;
import dao.alldo.PromoterDO;
import dao.alldo.TrainerDO;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;
import service.AdminLogin;
import service.CustomerLogin;
import service.PromoterLogin;
import service.TrainerLogin;


/**
 * @author yly
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
                TrainerLogin s1 = new TrainerLogin();
                TrainerDO u = new TrainerDO();
                u.setPassword(password);
                u.setId(id);
                if(s1.login(u) == null)
                    JOptionPane.showMessageDialog(null,"登陆失败！");
                else{
                    TrainerDO trainer = s1.login(u);
                    System.out.println(trainer.toString());
                    new Trainer_Menu(trainer);
                    Login.dispose();
                }
                break;
            case "member":
                CustomerLogin s2 = new CustomerLogin();
                MemberDO m = new MemberDO();
                m.setPassword(password);
                m.setId(id);
                if(s2.login(m) == null)
                    JOptionPane.showMessageDialog(null,"用户名或密码错误！");
                else{
                    MemberDO member = s2.login(m);
                    new Main_Menu(member);
                    Login.dispose();
                }
            case "promoter":
                PromoterLogin pl = new PromoterLogin();
                PromoterDO p = new PromoterDO();
                p.setPassword(password);
                p.setId(id);
                if(pl.login(p)==null)
                    JOptionPane.showMessageDialog(null,"用户名或密码错误！");
                else{
                    PromoterDO member = pl.login(p);
                    new Promoter(member);
                    Login.dispose();
                }
                break;
            case "admin":
                AdminLogin al = new AdminLogin();
                AdminDO a = new AdminDO();
                a.setId(id);
                a.setPassword(password);
                if(al.login(a)==null)
                    JOptionPane.showMessageDialog(null,"用户名或密码错误！");
                else{
                    AdminDO member = al.login(a);
                    new Admin_Menu(member);
                    Login.dispose();
                }
                break;
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
        // Generated using JFormDesigner Evaluation license - MudongGuo
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
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label2.getFont().getStyle() | Font.BOLD, 21));
            label2.setBorder(null);
            LoginContentPane.add(label2);
            label2.setBounds(285, 10, 130, 65);

            //======== panel1 ========
            {
                panel1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
                EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing
                . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
                java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
                { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () ))
                throw new RuntimeException( ); }} );
                panel1.setLayout(null);

                //---- passwordField1 ----
                passwordField1.setToolTipText("input the passworld");
                passwordField1.setColumns(1);
                passwordField1.setBackground(new Color(255, 204, 255));
                panel1.add(passwordField1);
                passwordField1.setBounds(130, 45, 270, 41);

                //---- textField1 ----
                textField1.setBackground(new Color(255, 204, 255));
                panel1.add(textField1);
                textField1.setBounds(130, 0, 270, 41);

                //---- button1 ----
                button1.setText("login");
                button1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 17));
                button1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(100, 157, 186), new Color(46, 196, 196), new Color(153, 124, 19), new Color(128, 22, 22)));
                button1.setAutoscrolls(true);
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel1.add(button1);
                button1.setBounds(130, 115, 135, 45);

                //---- button2 ----
                button2.setText("register");
                button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 17));
                button2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(111, 104, 167), new Color(0, 87, 176), new Color(245, 71, 71), new Color(105, 21, 21)));
                button2.addActionListener(e -> button2ActionPerformed(e));
                panel1.add(button2);
                button2.setBounds(320, 115, 135, 45);

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "trainer",
                    "member",
                    "promoter",
                    "admin"
                }));
                comboBox1.setBackground(new Color(238, 238, 238));
                comboBox1.setForeground(Color.black);
                comboBox1.setBorder(new BevelBorder(BevelBorder.RAISED));
                comboBox1.addActionListener(e -> comboBox1ActionPerformed(e));
                panel1.add(comboBox1);
                comboBox1.setBounds(new Rectangle(new Point(420, 5), comboBox1.getPreferredSize()));

                //---- label5 ----
                label5.setText("user id");
                label5.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 16));
                panel1.add(label5);
                label5.setBounds(30, 10, 90, label5.getPreferredSize().height);

                //---- label6 ----
                label6.setText("password");
                label6.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 16));
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
    // Generated using JFormDesigner Evaluation license - MudongGuo
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
