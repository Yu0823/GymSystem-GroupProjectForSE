/*
 * Created by JFormDesigner on Thu Apr 15 22:26:48 CST 2021
 */

package GUI;

import javax.swing.event.*;
import dao.UserDataUtil;
import dao.alldo.MemberDO;
import service.CustomerService;
import service.Util;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class Main_menu extends JFrame {
    MemberDO m;
    int count = 0;
    public Main_menu(MemberDO member) {
        initComponents();
        this.m = member;
        this.textArea7.setText(this.m.getType());
        CustomerService s1 = new CustomerService();
        this.textArea6.setText(s1.getclass(this.m));
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void show_trainer(MouseEvent e) {
        this.home.setVisible(false);
        this.trainer.setVisible(true);
    }

    private void show_video(MouseEvent e) {
        this.home.setVisible(false);
        this.video.setVisible(true);
    }

    private void show_profile(MouseEvent e) {
        this.home.setVisible(false);
        this.user_profile.setVisible(true);
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button6MouseClicked(MouseEvent e) {
        if(comboBox1.getSelectedItem()!=null){
            String id = comboBox1.getSelectedItem().toString();
            book b = new book(this.m,id);
    }
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void show_home(MouseEvent e) {
        this.trainer.setVisible(false);
        this.home.setVisible(true);

    }

    private void button35MouseClicked(MouseEvent e) {
        this.trainer.setVisible(false);
        this.video.setVisible(true);
    }

    private void button36MouseClicked(MouseEvent e) {
        this.trainer.setVisible(false);
        this.user_profile.setVisible(true);
    }

    private void button52MouseClicked(MouseEvent e) {
        this.user_profile.setVisible(false);
        this.home.setVisible(true);
    }

    private void button53MouseClicked(MouseEvent e) {
        this.user_profile.setVisible(false);
        this.trainer.setVisible(true);
    }

    private void button54MouseClicked(MouseEvent e) {
        this.user_profile.setVisible(false);
        this.video.setVisible(true);
    }

    private void button44MouseClicked(MouseEvent e) {
        this.video.setVisible(false);
        this.home.setVisible(true);
    }

    private void button45MouseClicked(MouseEvent e) {
        this.video.setVisible(false);
        this.trainer.setVisible(true);
    }

    private void button46MouseClicked(MouseEvent e) {
        // TODO add your code here
    }


    private void button47MouseClicked(MouseEvent e) {
    }

    private void button29ActionPerformed(ActionEvent e) {
    }

    private void button30ActionPerformed(ActionEvent e) {
        // TODO add your code here
        textField13.setText(null);
        textArea14.setText(null);

    }

    private void button23ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.textArea22.setText(null);
        this.textArea11.setText(null);
        this.textArea20.setText(null);
        this.textArea21.setText(null);
    }

    private void button24ActionPerformed(ActionEvent e) {
        // TODO add your code here
        String name = this.textArea22.getText();
        String age = this.textArea11.getText();
        String gender = this.textArea20.getText();
        String email = this.textArea21.getText();
        System.out.println(email==null);
        int error = 0;
        if (name.length()!=0)
            m.setName(name);
        if (age.length()!=0)
            m.setAge(age);
        if (gender.length()!=0)
            m.setGender(gender);
        if (email.length()!=0) {
            if (Util.checkEmail(email))
                m.setEmail(email);
            else {
                Notice notice = new Notice("Your email is not valid!");
                error++;
            }
        }
        if (error == 0){
            UserDataUtil.delNodes(UserDataUtil.xpathBuilder("member","id",m.getId()));
            UserDataUtil.addUser(m);
            new Notice("Change successfully");
        }

    }

    private void button26ActionPerformed(ActionEvent e) {
        // TODO add your code here
        CustomerService s1 = new CustomerService();
        textArea1.setText(s1.listAllTrainer());
    }

    private void comboBox1PopupMenuWillBecomeVisible(PopupMenuEvent e) {
        // TODO add your code here
        if (count==0)
        {CustomerService s1 = new CustomerService();
            for(String str:s1.listAllTrainerId()){
                comboBox1.addItem(str);
            }
            count++;
        }

    }

    private void comboBox1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        frame1 = new JFrame();
        profile_modify = new JPanel();
        label31 = new JLabel();
        textField13 = new JTextField();
        button29 = new JButton();
        button30 = new JButton();
        textField14 = new JTextField();
        label32 = new JLabel();
        trainer = new JPanel();
        button12 = new JButton();
        textField12 = new JTextField();
        label17 = new JLabel();
        button33 = new JButton();
        button34 = new JButton();
        button35 = new JButton();
        button36 = new JButton();
        menuBar2 = new JMenuBar();
        menu2 = new JMenu();
        menuItem10 = new JMenuItem();
        menuItem7 = new JMenuItem();
        menuItem8 = new JMenuItem();
        menuItem9 = new JMenuItem();
        panel5 = new JPanel();
        button32 = new JButton();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        comboBox1 = new JComboBox();
        label48 = new JLabel();
        video = new JPanel();
        button45 = new JButton();
        button44 = new JButton();
        label35 = new JLabel();
        textField15 = new JTextField();
        button46 = new JButton();
        button47 = new JButton();
        button37 = new JButton();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem5 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menuItem6 = new JMenuItem();
        user_profile = new JPanel();
        button23 = new JButton();
        button24 = new JButton();
        label19 = new JLabel();
        label20 = new JLabel();
        button52 = new JButton();
        label21 = new JLabel();
        button54 = new JButton();
        button53 = new JButton();
        button55 = new JButton();
        label22 = new JLabel();
        textArea11 = new JTextArea();
        textArea20 = new JTextArea();
        textArea21 = new JTextArea();
        textArea22 = new JTextArea();
        video_info = new JPanel();
        label36 = new JLabel();
        label37 = new JLabel();
        label38 = new JLabel();
        label39 = new JLabel();
        scrollPane16 = new JScrollPane();
        textArea14 = new JTextArea();
        scrollPane17 = new JScrollPane();
        textArea15 = new JTextArea();
        label40 = new JLabel();
        scrollPane18 = new JScrollPane();
        textArea16 = new JTextArea();
        scrollPane19 = new JScrollPane();
        textArea17 = new JTextArea();
        scrollPane20 = new JScrollPane();
        textArea18 = new JTextArea();
        scrollPane21 = new JScrollPane();
        textArea19 = new JTextArea();
        label41 = new JLabel();
        button42 = new JButton();
        button43 = new JButton();
        panel3 = new JPanel();
        button38 = new JButton();
        button39 = new JButton();
        button40 = new JButton();
        button41 = new JButton();
        home = new JPanel();
        label23 = new JLabel();
        scrollPane6 = new JScrollPane();
        textArea6 = new JTextArea();
        label24 = new JLabel();
        scrollPane7 = new JScrollPane();
        textArea7 = new JTextArea();
        button27 = new JButton();
        button25 = new JButton();
        button26 = new JButton();
        button28 = new JButton();
        Booking_course = new JPanel();
        button18 = new JButton();
        button19 = new JButton();
        label18 = new JLabel();
        scrollPane9 = new JScrollPane();
        list1 = new JList();
        spinner2 = new JSpinner();
        label25 = new JLabel();
        spinner1 = new JSpinner();
        scrollPane10 = new JScrollPane();
        textArea9 = new JTextArea();
        scrollPane11 = new JScrollPane();
        textArea10 = new JTextArea();
        label26 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label29 = new JLabel();
        label30 = new JLabel();

        //======== frame1 ========
        {
            frame1.setVisible(true);
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //======== profile_modify ========
            {
                profile_modify.setVisible(false);
                profile_modify.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
                new javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn"
                ,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
                ,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12)
                ,java.awt.Color.red),profile_modify. getBorder()));profile_modify. addPropertyChangeListener(
                new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
                ){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
                ;}});
                profile_modify.setLayout(null);

                //---- label31 ----
                label31.setText("Input your new Email:");
                profile_modify.add(label31);
                label31.setBounds(new Rectangle(new Point(15, 55), label31.getPreferredSize()));
                profile_modify.add(textField13);
                textField13.setBounds(160, 50, 150, textField13.getPreferredSize().height);

                //---- button29 ----
                button29.setText("Confirm");
                button29.addActionListener(e -> button29ActionPerformed(e));
                profile_modify.add(button29);
                button29.setBounds(new Rectangle(new Point(90, 220), button29.getPreferredSize()));

                //---- button30 ----
                button30.setText("Cancel");
                button30.addActionListener(e -> button30ActionPerformed(e));
                profile_modify.add(button30);
                button30.setBounds(new Rectangle(new Point(215, 220), button30.getPreferredSize()));
                profile_modify.add(textField14);
                textField14.setBounds(165, 110, 150, textField14.getPreferredSize().height);

                //---- label32 ----
                label32.setText("Input your new name:");
                profile_modify.add(label32);
                label32.setBounds(new Rectangle(new Point(25, 115), label32.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < profile_modify.getComponentCount(); i++) {
                        Rectangle bounds = profile_modify.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = profile_modify.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    profile_modify.setMinimumSize(preferredSize);
                    profile_modify.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(profile_modify);
            profile_modify.setBounds(10, 0, 475, 330);

            //======== trainer ========
            {
                trainer.setVisible(false);
                trainer.setLayout(null);

                //---- button12 ----
                button12.setText("Search");
                button12.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button5MouseClicked(e);
                    }
                });
                trainer.add(button12);
                button12.setBounds(new Rectangle(new Point(415, 10), button12.getPreferredSize()));
                trainer.add(textField12);
                textField12.setBounds(195, 10, 200, textField12.getPreferredSize().height);

                //---- label17 ----
                label17.setText("Trainer");
                trainer.add(label17);
                label17.setBounds(140, 10, 50, 22);

                //---- button33 ----
                button33.setText("Home");
                button33.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        show_home(e);
                    }
                });
                trainer.add(button33);
                button33.setBounds(5, 5, 90, button33.getPreferredSize().height);

                //---- button34 ----
                button34.setText("Trainer");
                trainer.add(button34);
                button34.setBounds(5, 45, 90, button34.getPreferredSize().height);

                //---- button35 ----
                button35.setText("Video");
                button35.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button35MouseClicked(e);
                    }
                });
                trainer.add(button35);
                button35.setBounds(5, 85, 90, button35.getPreferredSize().height);

                //---- button36 ----
                button36.setText("Profile");
                button36.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button36MouseClicked(e);
                    }
                });
                trainer.add(button36);
                button36.setBounds(5, 125, 90, button36.getPreferredSize().height);

                //======== menuBar2 ========
                {

                    //======== menu2 ========
                    {
                        menu2.setText("type");

                        //---- menuItem10 ----
                        menuItem10.setText("all");
                        menu2.add(menuItem10);

                        //---- menuItem7 ----
                        menuItem7.setText("yoga");
                        menu2.add(menuItem7);

                        //---- menuItem8 ----
                        menuItem8.setText("HIIT");
                        menu2.add(menuItem8);

                        //---- menuItem9 ----
                        menuItem9.setText("strength");
                        menu2.add(menuItem9);
                    }
                    menuBar2.add(menu2);
                }
                trainer.add(menuBar2);
                menuBar2.setBounds(30, 170, 39, 25);

                //======== panel5 ========
                {
                    panel5.setLayout(null);

                    //---- button32 ----
                    button32.setText("Reserve");
                    button32.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            button6MouseClicked(e);
                        }
                    });
                    panel5.add(button32);
                    button32.setBounds(245, 240, 90, button32.getPreferredSize().height);

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setViewportView(textArea1);
                    }
                    panel5.add(scrollPane2);
                    scrollPane2.setBounds(10, 15, 345, 215);

                    //---- comboBox1 ----
                    comboBox1.setMaximumRowCount(21);
                    comboBox1.addActionListener(e -> comboBox1ActionPerformed(e));
                    comboBox1.addPopupMenuListener(new PopupMenuListener() {
                        @Override
                        public void popupMenuCanceled(PopupMenuEvent e) {}
                        @Override
                        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {}
                        @Override
                        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                            comboBox1PopupMenuWillBecomeVisible(e);
                        }
                    });
                    panel5.add(comboBox1);
                    comboBox1.setBounds(100, 240, 145, comboBox1.getPreferredSize().height);

                    //---- label48 ----
                    label48.setText("choose id:");
                    panel5.add(label48);
                    label48.setBounds(15, 245, 78, label48.getPreferredSize().height);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel5.getComponentCount(); i++) {
                            Rectangle bounds = panel5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel5.setMinimumSize(preferredSize);
                        panel5.setPreferredSize(preferredSize);
                    }
                }
                trainer.add(panel5);
                panel5.setBounds(140, 50, 375, 295);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < trainer.getComponentCount(); i++) {
                        Rectangle bounds = trainer.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = trainer.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    trainer.setMinimumSize(preferredSize);
                    trainer.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(trainer);
            trainer.setBounds(0, 5, 520, 365);

            //======== video ========
            {
                video.setVisible(false);
                video.setLayout(null);

                //---- button45 ----
                button45.setText("Trainer");
                button45.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button45MouseClicked(e);
                    }
                });
                video.add(button45);
                button45.setBounds(5, 45, 90, button45.getPreferredSize().height);

                //---- button44 ----
                button44.setText("Home");
                button44.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button44MouseClicked(e);
                    }
                });
                video.add(button44);
                button44.setBounds(5, 5, 90, button44.getPreferredSize().height);

                //---- label35 ----
                label35.setText("Video");
                label35.setInheritsPopupMenu(false);
                video.add(label35);
                label35.setBounds(120, 20, 65, label35.getPreferredSize().height);
                video.add(textField15);
                textField15.setBounds(220, 15, 150, textField15.getPreferredSize().height);

                //---- button46 ----
                button46.setText("Video");
                video.add(button46);
                button46.setBounds(5, 85, 90, button46.getPreferredSize().height);

                //---- button47 ----
                button47.setText("Profile");
                button47.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button47MouseClicked(e);
                    }
                });
                video.add(button47);
                button47.setBounds(5, 125, 90, button47.getPreferredSize().height);

                //---- button37 ----
                button37.setText("Search");
                video.add(button37);
                button37.setBounds(new Rectangle(new Point(395, 20), button37.getPreferredSize()));

                //======== menuBar1 ========
                {

                    //======== menu1 ========
                    {
                        menu1.setText("type");

                        //---- menuItem5 ----
                        menuItem5.setText("yoga");
                        menu1.add(menuItem5);

                        //---- menuItem4 ----
                        menuItem4.setText("HIIT");
                        menu1.add(menuItem4);

                        //---- menuItem6 ----
                        menuItem6.setText("strength");
                        menu1.add(menuItem6);
                    }
                    menuBar1.add(menu1);
                }
                video.add(menuBar1);
                menuBar1.setBounds(40, 180, 39, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < video.getComponentCount(); i++) {
                        Rectangle bounds = video.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = video.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    video.setMinimumSize(preferredSize);
                    video.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(video);
            video.setBounds(0, 0, 505, 390);

            //======== user_profile ========
            {
                user_profile.setVisible(false);
                user_profile.setLayout(null);

                //---- button23 ----
                button23.setText("Back");
                button23.addActionListener(e -> button23ActionPerformed(e));
                user_profile.add(button23);
                button23.setBounds(325, 195, 75, 30);

                //---- button24 ----
                button24.setText("Modify");
                button24.addActionListener(e -> button24ActionPerformed(e));
                user_profile.add(button24);
                button24.setBounds(190, 193, 80, button24.getPreferredSize().height);

                //---- label19 ----
                label19.setText("Age:");
                user_profile.add(label19);
                label19.setBounds(210, 100, 71, label19.getPreferredSize().height);

                //---- label20 ----
                label20.setText("Grnder:");
                user_profile.add(label20);
                label20.setBounds(210, 70, 83, label20.getPreferredSize().height);

                //---- button52 ----
                button52.setText("Home");
                button52.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button52MouseClicked(e);
                    }
                });
                user_profile.add(button52);
                button52.setBounds(5, 5, 90, button52.getPreferredSize().height);

                //---- label21 ----
                label21.setText("E-mail:");
                user_profile.add(label21);
                label21.setBounds(210, 45, 79, label21.getPreferredSize().height);

                //---- button54 ----
                button54.setText("Video");
                button54.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button54MouseClicked(e);
                    }
                });
                user_profile.add(button54);
                button54.setBounds(5, 85, 90, button54.getPreferredSize().height);

                //---- button53 ----
                button53.setText("Trainer");
                button53.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button53MouseClicked(e);
                    }
                });
                user_profile.add(button53);
                button53.setBounds(5, 45, 90, button53.getPreferredSize().height);

                //---- button55 ----
                button55.setText("Profile");
                user_profile.add(button55);
                button55.setBounds(5, 125, 90, 30);

                //---- label22 ----
                label22.setText("User name: ");
                user_profile.add(label22);
                label22.setBounds(210, 15, 100, label22.getPreferredSize().height);
                user_profile.add(textArea11);
                textArea11.setBounds(325, 100, 128, 19);
                user_profile.add(textArea20);
                textArea20.setBounds(325, 70, 128, 19);
                user_profile.add(textArea21);
                textArea21.setBounds(325, 45, 128, 19);
                user_profile.add(textArea22);
                textArea22.setBounds(325, 15, 128, 19);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < user_profile.getComponentCount(); i++) {
                        Rectangle bounds = user_profile.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = user_profile.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    user_profile.setMinimumSize(preferredSize);
                    user_profile.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(user_profile);
            user_profile.setBounds(5, 5, 490, 355);

            //======== video_info ========
            {
                video_info.setFocusCycleRoot(true);
                video_info.setVisible(false);
                video_info.setLayout(null);

                //---- label36 ----
                label36.setText("Title:");
                video_info.add(label36);
                label36.setBounds(new Rectangle(new Point(255, 15), label36.getPreferredSize()));

                //---- label37 ----
                label37.setText("Trainer:");
                video_info.add(label37);
                label37.setBounds(new Rectangle(new Point(250, 40), label37.getPreferredSize()));

                //---- label38 ----
                label38.setText("type:");
                video_info.add(label38);
                label38.setBounds(new Rectangle(new Point(255, 70), label38.getPreferredSize()));

                //---- label39 ----
                label39.setText("Level:");
                video_info.add(label39);
                label39.setBounds(new Rectangle(new Point(255, 100), label39.getPreferredSize()));

                //======== scrollPane16 ========
                {
                    scrollPane16.setViewportView(textArea14);
                }
                video_info.add(scrollPane16);
                scrollPane16.setBounds(305, 45, 180, scrollPane16.getPreferredSize().height);

                //======== scrollPane17 ========
                {
                    scrollPane17.setViewportView(textArea15);
                }
                video_info.add(scrollPane17);
                scrollPane17.setBounds(305, 75, 180, scrollPane17.getPreferredSize().height);

                //---- label40 ----
                label40.setText("Duration:");
                video_info.add(label40);
                label40.setBounds(new Rectangle(new Point(245, 130), label40.getPreferredSize()));

                //======== scrollPane18 ========
                {
                    scrollPane18.setViewportView(textArea16);
                }
                video_info.add(scrollPane18);
                scrollPane18.setBounds(305, 105, 180, scrollPane18.getPreferredSize().height);

                //======== scrollPane19 ========
                {
                    scrollPane19.setViewportView(textArea17);
                }
                video_info.add(scrollPane19);
                scrollPane19.setBounds(305, 130, 180, scrollPane19.getPreferredSize().height);

                //======== scrollPane20 ========
                {
                    scrollPane20.setViewportView(textArea18);
                }
                video_info.add(scrollPane20);
                scrollPane20.setBounds(305, 15, 180, scrollPane20.getPreferredSize().height);

                //======== scrollPane21 ========
                {
                    scrollPane21.setViewportView(textArea19);
                }
                video_info.add(scrollPane21);
                scrollPane21.setBounds(305, 155, 180, scrollPane21.getPreferredSize().height);

                //---- label41 ----
                label41.setText("Information:");
                video_info.add(label41);
                label41.setBounds(new Rectangle(new Point(235, 160), label41.getPreferredSize()));

                //---- button42 ----
                button42.setText("Play");
                video_info.add(button42);
                button42.setBounds(165, 265, 70, button42.getPreferredSize().height);

                //---- button43 ----
                button43.setText("Back");
                video_info.add(button43);
                button43.setBounds(270, 265, 70, button43.getPreferredSize().height);

                //======== panel3 ========
                {
                    panel3.setLayout(null);

                    //---- button38 ----
                    button38.setText("Home");
                    button38.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            show_home(e);
                        }
                    });
                    panel3.add(button38);
                    button38.setBounds(0, 0, 75, button38.getPreferredSize().height);

                    //---- button39 ----
                    button39.setText("Trainer");
                    button39.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            show_trainer(e);
                        }
                    });
                    panel3.add(button39);
                    button39.setBounds(new Rectangle(new Point(0, 45), button39.getPreferredSize()));

                    //---- button40 ----
                    button40.setText("Video");
                    button40.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            show_video(e);
                        }
                    });
                    panel3.add(button40);
                    button40.setBounds(0, 95, 75, button40.getPreferredSize().height);

                    //---- button41 ----
                    button41.setText("Profile");
                    button41.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            show_profile(e);
                        }
                    });
                    panel3.add(button41);
                    button41.setBounds(new Rectangle(new Point(0, 140), button41.getPreferredSize()));

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel3.getComponentCount(); i++) {
                            Rectangle bounds = panel3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel3.setMinimumSize(preferredSize);
                        panel3.setPreferredSize(preferredSize);
                    }
                }
                video_info.add(panel3);
                panel3.setBounds(20, 5, 85, 240);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < video_info.getComponentCount(); i++) {
                        Rectangle bounds = video_info.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = video_info.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    video_info.setMinimumSize(preferredSize);
                    video_info.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(video_info);
            video_info.setBounds(0, 15, 520, 380);

            //======== home ========
            {
                home.setLayout(null);

                //---- label23 ----
                label23.setText("My Activity");
                home.add(label23);
                label23.setBounds(145, 25, 110, label23.getPreferredSize().height);

                //======== scrollPane6 ========
                {
                    scrollPane6.setViewportView(textArea6);
                }
                home.add(scrollPane6);
                scrollPane6.setBounds(145, 65, 320, 115);

                //---- label24 ----
                label24.setText("My Membership");
                home.add(label24);
                label24.setBounds(new Rectangle(new Point(150, 220), label24.getPreferredSize()));

                //======== scrollPane7 ========
                {
                    scrollPane7.setViewportView(textArea7);
                }
                home.add(scrollPane7);
                scrollPane7.setBounds(145, 250, 320, 110);

                //---- button27 ----
                button27.setText("Video");
                button27.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        show_video(e);
                    }
                });
                home.add(button27);
                button27.setBounds(5, 85, 90, button27.getPreferredSize().height);

                //---- button25 ----
                button25.setText("Home");
                home.add(button25);
                button25.setBounds(5, 5, 90, button25.getPreferredSize().height);

                //---- button26 ----
                button26.setText("Trainer");
                button26.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        show_trainer(e);
                    }
                });
                button26.addActionListener(e -> button26ActionPerformed(e));
                home.add(button26);
                button26.setBounds(5, 45, 90, button26.getPreferredSize().height);

                //---- button28 ----
                button28.setText("Profile");
                button28.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        show_profile(e);
                    }
                });
                home.add(button28);
                button28.setBounds(5, 125, 90, button28.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < home.getComponentCount(); i++) {
                        Rectangle bounds = home.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = home.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    home.setMinimumSize(preferredSize);
                    home.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(home);
            home.setBounds(0, 0, 525, 380);

            //======== Booking_course ========
            {
                Booking_course.setVisible(false);
                Booking_course.setLayout(null);

                //---- button18 ----
                button18.setText("Cancle");
                button18.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button2MouseClicked(e);
                    }
                });
                Booking_course.add(button18);
                button18.setBounds(160, 230, 70, button18.getPreferredSize().height);

                //---- button19 ----
                button19.setText("Confirm");
                button19.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });
                Booking_course.add(button19);
                button19.setBounds(new Rectangle(new Point(60, 230), button19.getPreferredSize()));

                //---- label18 ----
                label18.setText("Booking course");
                Booking_course.add(label18);
                label18.setBounds(30, -5, 120, 42);

                //======== scrollPane9 ========
                {
                    scrollPane9.setViewportView(list1);
                }
                Booking_course.add(scrollPane9);
                scrollPane9.setBounds(90, 145, 130, 20);
                Booking_course.add(spinner2);
                spinner2.setBounds(new Rectangle(new Point(265, 110), spinner2.getPreferredSize()));

                //---- label25 ----
                label25.setText("Month");
                Booking_course.add(label25);
                label25.setBounds(new Rectangle(new Point(95, 115), label25.getPreferredSize()));
                Booking_course.add(spinner1);
                spinner1.setBounds(new Rectangle(new Point(140, 110), spinner1.getPreferredSize()));

                //======== scrollPane10 ========
                {
                    scrollPane10.setViewportView(textArea9);
                }
                Booking_course.add(scrollPane10);
                scrollPane10.setBounds(95, 85, 155, scrollPane10.getPreferredSize().height);

                //======== scrollPane11 ========
                {
                    scrollPane11.setViewportView(textArea10);
                }
                Booking_course.add(scrollPane11);
                scrollPane11.setBounds(95, 55, 155, scrollPane11.getPreferredSize().height);

                //---- label26 ----
                label26.setText("Time:");
                Booking_course.add(label26);
                label26.setBounds(new Rectangle(new Point(45, 145), label26.getPreferredSize()));

                //---- label27 ----
                label27.setText("Date:");
                Booking_course.add(label27);
                label27.setBounds(new Rectangle(new Point(50, 115), label27.getPreferredSize()));

                //---- label28 ----
                label28.setText("Course:");
                Booking_course.add(label28);
                label28.setBounds(new Rectangle(new Point(35, 85), label28.getPreferredSize()));

                //---- label29 ----
                label29.setText("Trainer:");
                Booking_course.add(label29);
                label29.setBounds(new Rectangle(new Point(35, 55), label29.getPreferredSize()));

                //---- label30 ----
                label30.setText("Day");
                Booking_course.add(label30);
                label30.setBounds(235, 115, 30, label30.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Booking_course.getComponentCount(); i++) {
                        Rectangle bounds = Booking_course.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Booking_course.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Booking_course.setMinimumSize(preferredSize);
                    Booking_course.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(Booking_course);
            Booking_course.setBounds(10, 0, 475, 340);

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
    private JPanel profile_modify;
    private JLabel label31;
    private JTextField textField13;
    private JButton button29;
    private JButton button30;
    private JTextField textField14;
    private JLabel label32;
    private JPanel trainer;
    private JButton button12;
    private JTextField textField12;
    private JLabel label17;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JMenuBar menuBar2;
    private JMenu menu2;
    private JMenuItem menuItem10;
    private JMenuItem menuItem7;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JPanel panel5;
    private JButton button32;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JLabel label48;
    private JPanel video;
    private JButton button45;
    private JButton button44;
    private JLabel label35;
    private JTextField textField15;
    private JButton button46;
    private JButton button47;
    private JButton button37;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem5;
    private JMenuItem menuItem4;
    private JMenuItem menuItem6;
    private JPanel user_profile;
    private JButton button23;
    private JButton button24;
    private JLabel label19;
    private JLabel label20;
    private JButton button52;
    private JLabel label21;
    private JButton button54;
    private JButton button53;
    private JButton button55;
    private JLabel label22;
    private JTextArea textArea11;
    private JTextArea textArea20;
    private JTextArea textArea21;
    private JTextArea textArea22;
    private JPanel video_info;
    private JLabel label36;
    private JLabel label37;
    private JLabel label38;
    private JLabel label39;
    private JScrollPane scrollPane16;
    private JTextArea textArea14;
    private JScrollPane scrollPane17;
    private JTextArea textArea15;
    private JLabel label40;
    private JScrollPane scrollPane18;
    private JTextArea textArea16;
    private JScrollPane scrollPane19;
    private JTextArea textArea17;
    private JScrollPane scrollPane20;
    private JTextArea textArea18;
    private JScrollPane scrollPane21;
    private JTextArea textArea19;
    private JLabel label41;
    private JButton button42;
    private JButton button43;
    private JPanel panel3;
    private JButton button38;
    private JButton button39;
    private JButton button40;
    private JButton button41;
    private JPanel home;
    private JLabel label23;
    private JScrollPane scrollPane6;
    private JTextArea textArea6;
    private JLabel label24;
    private JScrollPane scrollPane7;
    private JTextArea textArea7;
    private JButton button27;
    private JButton button25;
    private JButton button26;
    private JButton button28;
    private JPanel Booking_course;
    private JButton button18;
    private JButton button19;
    private JLabel label18;
    private JScrollPane scrollPane9;
    private JList list1;
    private JSpinner spinner2;
    private JLabel label25;
    private JSpinner spinner1;
    private JScrollPane scrollPane10;
    private JTextArea textArea9;
    private JScrollPane scrollPane11;
    private JTextArea textArea10;
    private JLabel label26;
    private JLabel label27;
    private JLabel label28;
    private JLabel label29;
    private JLabel label30;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
