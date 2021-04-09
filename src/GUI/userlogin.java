/*
 * Created by JFormDesigner on Thu Apr 08 13:30:21 CST 2021
 */

package GUI;

import java.awt.event.*;

import dao.allDo.MemberDO;
import dao.allDo.TrainerDO;
import service.CustomerService;
import service.TrainerService;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class userlogin extends JFrame {
    public userlogin() {
        initComponents();
    }

    private void chooseuser(MouseEvent e) {
        this.choose.setVisible(false);
        this.memberlogin.setVisible(true);


        // TODO add your code here
    }

    private void choosetrainer(MouseEvent e) {
        this.choose.setVisible(false);
        this.trainerlogin.setVisible(true);
        // TODO add your code here
    }

    private void memberrigister(MouseEvent e) {
        this.memberlogin.setVisible(false);
        this.memberrigister.setVisible(true);
        // TODO add your code here
    }

    private void trainerrigister(MouseEvent e) {
        this.trainerlogin.setVisible(false);
        this.trainerrigister.setVisible(true);
        // TODO add your code here
    }

    private void trainerrigisterback(MouseEvent e) {
        this.trainerlogin.setVisible(true);
        this.trainerrigister.setVisible(false);
        // TODO add your code here
    }

    private TrainerDO trainerrigistercomplete(MouseEvent e) {
        TrainerDO t = new TrainerDO();
        t.setId(textField5.getText());
        t.setPhoneNumber(textField6.getText());
        t.setPassword(textField7.getText());
        t.setPhoneNumber(textField11.getText());
        TrainerService s1 = new TrainerService();
        String result = s1.register(t);
        if (result.equals("Register success, please login.")) {
            this.trainerlogin.setVisible(true);
            this.trainerrigister.setVisible(false);
        }
        else
            this.trainerrigister.setVisible(true);
        return t;
        // TODO add your code here
    }

    private void memberrigisterback(MouseEvent e) {
        this.memberlogin.setVisible(true);
        this.memberrigister.setVisible(false);
        // TODO add your code here
    }

    private MemberDO memberrigistercomplete(MouseEvent e) {
        MemberDO t = new MemberDO();
        t.setId(textField8.getText());
        t.setEmail(textField9.getText());
        t.setPassword(textField10.getText());
        CustomerService s1 = new CustomerService();
        if(s1.register(t).equals("Register success, please login.")){
            this.memberlogin.setVisible(true);
            this.memberrigister.setVisible(false);
        }

        return t;
        // TODO add your code here
    }

    private void label1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void member_entermain(MouseEvent e) {
        this.member_main.setVisible(true);
        this.memberlogin.setVisible(false);
        // TODO add your code here
    }

    private void watch_video(MouseEvent e) {
        this.member_video.setVisible(true);
        this.member_main.setVisible(false);
        // TODO add your code here
    }

    private void video_back(MouseEvent e) {
        this.member_video.setVisible(false);
        this.member_main.setVisible(true);
        // TODO add your code here
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("GUI.test");
        frame1 = new JFrame();
        member_main = new JPanel();
        button18 = new JButton();
        member_video = new JPanel();
        label17 = new JLabel();
        label18 = new JLabel();
        button2 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button19 = new JButton();
        memberlogin = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        button1 = new JButton();
        button8 = new JButton();
        memberrigister = new JPanel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        textField8 = new JTextField();
        textField9 = new JTextField();
        textField10 = new JTextField();
        button6 = new JButton();
        button11 = new JButton();
        label15 = new JLabel();
        textField11 = new JTextField();
        trainerrigister = new JPanel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        button5 = new JButton();
        button10 = new JButton();
        trainerlogin = new JPanel();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        button4 = new JButton();
        button9 = new JButton();
        choose = new JPanel();
        button3 = new JButton();
        button7 = new JButton();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //======== member_main ========
            {
                member_main.setBorder (new CompoundBorder( new TitledBorder (new
                        EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", TitledBorder. CENTER, TitledBorder. BOTTOM, new Font ("D\u0069al\u006fg" , Font .BOLD ,12 ),
                Color. red) ,member_main. getBorder( )) ); member_main. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
                { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () ))
                throw new RuntimeException( ); }} );
                member_main.setLayout(null);

                //---- button18 ----
                button18.setText(bundle.getString("userlogin.button18.text"));
                button18.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        watch_video(e);
                    }
                });
                member_main.add(button18);
                button18.setBounds(15, 35, 178, 75);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < member_main.getComponentCount(); i++) {
                        Rectangle bounds = member_main.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = member_main.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    member_main.setMinimumSize(preferredSize);
                    member_main.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(member_main);
            member_main.setBounds(0, 30, 400, 230);

            //======== member_video ========
            {
                member_video.setLayout(null);

                //---- label17 ----
                label17.setText(bundle.getString("userlogin.label17.text"));
                member_video.add(label17);
                label17.setBounds(30, 20, 110, label17.getPreferredSize().height);

                //---- label18 ----
                label18.setText(bundle.getString("userlogin.label18.text"));
                member_video.add(label18);
                label18.setBounds(35, 125, 105, label18.getPreferredSize().height);

                //---- button2 ----
                button2.setText(bundle.getString("userlogin.button2.text"));
                member_video.add(button2);
                button2.setBounds(new Rectangle(new Point(35, 50), button2.getPreferredSize()));

                //---- button12 ----
                button12.setText(bundle.getString("userlogin.button12.text"));
                member_video.add(button12);
                button12.setBounds(145, 50, 78, 30);

                //---- button13 ----
                button13.setText(bundle.getString("userlogin.button13.text"));
                member_video.add(button13);
                button13.setBounds(255, 50, 78, 30);

                //---- button14 ----
                button14.setText(bundle.getString("userlogin.button14.text"));
                member_video.add(button14);
                button14.setBounds(35, 150, 78, 30);

                //---- button15 ----
                button15.setText(bundle.getString("userlogin.button15.text"));
                member_video.add(button15);
                button15.setBounds(145, 150, 78, 30);

                //---- button16 ----
                button16.setText(bundle.getString("userlogin.button16.text"));
                member_video.add(button16);
                button16.setBounds(260, 150, 78, 30);

                //---- button19 ----
                button19.setText(bundle.getString("userlogin.button19.text"));
                button19.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        video_back(e);
                    }
                });
                member_video.add(button19);
                button19.setBounds(new Rectangle(new Point(295, 210), button19.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < member_video.getComponentCount(); i++) {
                        Rectangle bounds = member_video.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = member_video.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    member_video.setMinimumSize(preferredSize);
                    member_video.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(member_video);
            member_video.setBounds(0, 30, 368, 240);

            //======== memberlogin ========
            {
                memberlogin.setLayout(null);

                //---- label1 ----
                label1.setText(bundle.getString("userlogin.label1.text"));
                memberlogin.add(label1);
                label1.setBounds(new Rectangle(new Point(40, 85), label1.getPreferredSize()));
                memberlogin.add(textField1);
                textField1.setBounds(130, 85, 120, textField1.getPreferredSize().height);

                //---- label2 ----
                label2.setText(bundle.getString("userlogin.label2.text"));
                memberlogin.add(label2);
                label2.setBounds(40, 150, 85, label2.getPreferredSize().height);
                memberlogin.add(textField2);
                textField2.setBounds(130, 140, 120, textField2.getPreferredSize().height);

                //---- label3 ----
                label3.setText(bundle.getString("userlogin.label3.text"));
                memberlogin.add(label3);
                label3.setBounds(105, 25, 115, label3.getPreferredSize().height);

                //---- button1 ----
                button1.setText(bundle.getString("userlogin.button1.text"));
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        member_entermain(e);
                    }
                });
                memberlogin.add(button1);
                button1.setBounds(new Rectangle(new Point(65, 200), button1.getPreferredSize()));

                //---- button8 ----
                button8.setText(bundle.getString("userlogin.button8.text"));
                button8.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        memberrigister(e);
                    }
                });
                memberlogin.add(button8);
                button8.setBounds(new Rectangle(new Point(190, 200), button8.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < memberlogin.getComponentCount(); i++) {
                        Rectangle bounds = memberlogin.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = memberlogin.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    memberlogin.setMinimumSize(preferredSize);
                    memberlogin.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(memberlogin);
            memberlogin.setBounds(25, 30, 425, 225);

            //======== memberrigister ========
            {
                memberrigister.setLayout(null);

                //---- label11 ----
                label11.setText(bundle.getString("userlogin.label11.text"));
                memberrigister.add(label11);
                label11.setBounds(new Rectangle(new Point(150, 15), label11.getPreferredSize()));

                //---- label12 ----
                label12.setText(bundle.getString("userlogin.label12.text"));
                memberrigister.add(label12);
                label12.setBounds(20, 55, 85, label12.getPreferredSize().height);

                //---- label13 ----
                label13.setText(bundle.getString("userlogin.label13.text"));
                memberrigister.add(label13);
                label13.setBounds(20, 100, 95, label13.getPreferredSize().height);

                //---- label14 ----
                label14.setText(bundle.getString("userlogin.label14.text"));
                memberrigister.add(label14);
                label14.setBounds(10, 180, 100, label14.getPreferredSize().height);
                memberrigister.add(textField8);
                textField8.setBounds(115, 55, 175, textField8.getPreferredSize().height);
                memberrigister.add(textField9);
                textField9.setBounds(115, 100, 175, textField9.getPreferredSize().height);
                memberrigister.add(textField10);
                textField10.setBounds(115, 175, 175, textField10.getPreferredSize().height);

                //---- button6 ----
                button6.setText(bundle.getString("userlogin.button6.text"));
                button6.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        memberrigisterback(e);
                    }
                });
                memberrigister.add(button6);
                button6.setBounds(new Rectangle(new Point(205, 210), button6.getPreferredSize()));

                //---- button11 ----
                button11.setText(bundle.getString("userlogin.button11.text"));
                button11.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        memberrigistercomplete(e);
                    }
                });
                memberrigister.add(button11);
                button11.setBounds(new Rectangle(new Point(85, 210), button11.getPreferredSize()));

                //---- label15 ----
                label15.setText(bundle.getString("userlogin.label15.text"));
                memberrigister.add(label15);
                label15.setBounds(5, 140, 115, label15.getPreferredSize().height);
                memberrigister.add(textField11);
                textField11.setBounds(115, 140, 175, textField11.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < memberrigister.getComponentCount(); i++) {
                        Rectangle bounds = memberrigister.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = memberrigister.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    memberrigister.setMinimumSize(preferredSize);
                    memberrigister.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(memberrigister);
            memberrigister.setBounds(45, 20, 400, 245);

            //======== trainerrigister ========
            {
                trainerrigister.setLayout(null);

                //---- label7 ----
                label7.setText(bundle.getString("userlogin.label7.text"));
                trainerrigister.add(label7);
                label7.setBounds(new Rectangle(new Point(150, 15), label7.getPreferredSize()));

                //---- label8 ----
                label8.setText(bundle.getString("userlogin.label8.text"));
                trainerrigister.add(label8);
                label8.setBounds(new Rectangle(new Point(20, 55), label8.getPreferredSize()));

                //---- label9 ----
                label9.setText(bundle.getString("userlogin.label9.text"));
                trainerrigister.add(label9);
                label9.setBounds(new Rectangle(new Point(20, 100), label9.getPreferredSize()));

                //---- label10 ----
                label10.setText(bundle.getString("userlogin.label10.text"));
                trainerrigister.add(label10);
                label10.setBounds(new Rectangle(new Point(20, 150), label10.getPreferredSize()));
                trainerrigister.add(textField5);
                textField5.setBounds(115, 55, 175, textField5.getPreferredSize().height);
                trainerrigister.add(textField6);
                textField6.setBounds(115, 100, 175, textField6.getPreferredSize().height);
                trainerrigister.add(textField7);
                textField7.setBounds(115, 145, 175, textField7.getPreferredSize().height);

                //---- button5 ----
                button5.setText(bundle.getString("userlogin.button5.text"));
                button5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        trainerrigisterback(e);
                    }
                });
                trainerrigister.add(button5);
                button5.setBounds(new Rectangle(new Point(205, 210), button5.getPreferredSize()));

                //---- button10 ----
                button10.setText(bundle.getString("userlogin.button10.text"));
                button10.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        trainerrigistercomplete(e);
                    }
                });
                trainerrigister.add(button10);
                button10.setBounds(new Rectangle(new Point(95, 210), button10.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < trainerrigister.getComponentCount(); i++) {
                        Rectangle bounds = trainerrigister.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = trainerrigister.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    trainerrigister.setMinimumSize(preferredSize);
                    trainerrigister.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(trainerrigister);
            trainerrigister.setBounds(45, 20, 370, 240);

            //======== trainerlogin ========
            {
                trainerlogin.setLayout(null);

                //---- label4 ----
                label4.setText(bundle.getString("userlogin.label4.text"));
                trainerlogin.add(label4);
                label4.setBounds(new Rectangle(new Point(40, 85), label4.getPreferredSize()));
                trainerlogin.add(textField3);
                textField3.setBounds(130, 85, 120, textField3.getPreferredSize().height);

                //---- label5 ----
                label5.setText(bundle.getString("userlogin.label5.text"));
                trainerlogin.add(label5);
                label5.setBounds(40, 150, 85, label5.getPreferredSize().height);
                trainerlogin.add(textField4);
                textField4.setBounds(130, 140, 120, textField4.getPreferredSize().height);

                //---- label6 ----
                label6.setText(bundle.getString("userlogin.label6.text"));
                trainerlogin.add(label6);
                label6.setBounds(105, 25, 115, label6.getPreferredSize().height);

                //---- button4 ----
                button4.setText(bundle.getString("userlogin.button4.text"));
                trainerlogin.add(button4);
                button4.setBounds(new Rectangle(new Point(95, 200), button4.getPreferredSize()));

                //---- button9 ----
                button9.setText(bundle.getString("userlogin.button9.text"));
                button9.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        trainerrigister(e);
                    }
                });
                trainerlogin.add(button9);
                button9.setBounds(new Rectangle(new Point(210, 200), button9.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < trainerlogin.getComponentCount(); i++) {
                        Rectangle bounds = trainerlogin.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = trainerlogin.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    trainerlogin.setMinimumSize(preferredSize);
                    trainerlogin.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(trainerlogin);
            trainerlogin.setBounds(50, 30, 400, 240);

            //======== choose ========
            {
                choose.setLayout(null);

                //---- button3 ----
                button3.setText(bundle.getString("userlogin.button3.text"));
                button3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        choosetrainer(e);
                    }
                });
                choose.add(button3);
                button3.setBounds(240, 100, 145, button3.getPreferredSize().height);

                //---- button7 ----
                button7.setText(bundle.getString("userlogin.button7.text"));
                button7.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        chooseuser(e);
                    }
                });
                choose.add(button7);
                button7.setBounds(40, 100, 145, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < choose.getComponentCount(); i++) {
                        Rectangle bounds = choose.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = choose.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    choose.setMinimumSize(preferredSize);
                    choose.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(choose);
            choose.setBounds(35, 15, 415, 245);

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
    public static void main(String[] args) {
        userlogin u = new userlogin();
        u.frame1.setVisible(true);
        u.choose.setVisible(true);
        u.trainerlogin.setVisible(false);
        u.trainerrigister.setVisible(false);
        u.memberlogin.setVisible(false);
        u.memberrigister.setVisible(false);
        u.member_main.setVisible(false);
        u.member_video.setVisible(false);
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame frame1;
    private JPanel member_main;
    private JButton button18;
    private JPanel member_video;
    private JLabel label17;
    private JLabel label18;
    private JButton button2;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button19;
    private JPanel memberlogin;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JButton button1;
    private JButton button8;
    private JPanel memberrigister;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JButton button6;
    private JButton button11;
    private JLabel label15;
    private JTextField textField11;
    private JPanel trainerrigister;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton button5;
    private JButton button10;
    private JPanel trainerlogin;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label6;
    private JButton button4;
    private JButton button9;
    private JPanel choose;
    private JButton button3;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
