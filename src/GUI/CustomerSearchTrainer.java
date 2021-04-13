package GUI;

import dao.alldo.MemberDO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Sun Apr 11 15:19:35 CST 2021
 */



/**
 * @author Mudong Guo
 */
public class CustomerSearchTrainer extends JFrame {
    MemberDO member;
    public CustomerSearchTrainer(MemberDO member) {
        initComponents();
        this.member = member;
        frame1.setVisible(true);
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        CustomerMainmenu c = new CustomerMainmenu(member);
        frame1.dispose();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        frame1 = new JFrame();
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        label1 = new JLabel();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button6 = new JButton();
        Image = new JLabel();
        button5 = new JButton();
        panel3 = new JPanel();
        label2 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        label7 = new JLabel();
        comboBox3 = new JComboBox<>();
        comboBox4 = new JComboBox<>();
        comboBox5 = new JComboBox<>();
        label8 = new JLabel();
        label9 = new JLabel();
        label6 = new JLabel();
        comboBox6 = new JComboBox<>();
        comboBox7 = new JComboBox<>();
        comboBox8 = new JComboBox<>();
        comboBox9 = new JComboBox<>();
        comboBox10 = new JComboBox<>();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();

        //======== frame1 ========
        {
            frame1.setMinimumSize(new Dimension(14, 37));
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //======== panel1 ========
            {
                panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
                . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing
                .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
                Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
                ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
                public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName (
                ) ) )throw new RuntimeException( ) ;} } );
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
            frame1ContentPane.add(panel1);
            panel1.setBounds(15, 55, 110, 300);

            //---- label1 ----
            label1.setText("Trainer select");
            frame1ContentPane.add(label1);
            label1.setBounds(60, 15, 80, 32);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(textArea1);
                }
                panel2.add(scrollPane1);
                scrollPane1.setBounds(205, 50, 140, 125);

                //---- button6 ----
                button6.setText("Reserve");
                button6.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button6MouseClicked(e);
                    }
                });
                panel2.add(button6);
                button6.setBounds(new Rectangle(new Point(270, 190), button6.getPreferredSize()));
                panel2.add(Image);
                Image.setBounds(10, 50, 180, 125);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(panel2);
            panel2.setBounds(190, 120, 350, 275);

            //---- button5 ----
            button5.setText("Search");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            frame1ContentPane.add(button5);
            button5.setBounds(new Rectangle(new Point(535, 70), button5.getPreferredSize()));

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //---- label2 ----
                label2.setText("from");
                panel3.add(label2);
                label2.setBounds(5, 15, 30, label2.getPreferredSize().height);

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "2021",
                    "2022",
                    "2023"
                }));
                panel3.add(comboBox1);
                comboBox1.setBounds(45, 10, 65, comboBox1.getPreferredSize().height);

                //---- comboBox2 ----
                comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12"
                }));
                panel3.add(comboBox2);
                comboBox2.setBounds(115, 10, 70, comboBox2.getPreferredSize().height);

                //---- label7 ----
                label7.setText("-");
                panel3.add(label7);
                label7.setBounds(110, 15, 5, 17);

                //---- comboBox3 ----
                comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31"
                }));
                panel3.add(comboBox3);
                comboBox3.setBounds(190, 10, 60, comboBox3.getPreferredSize().height);

                //---- comboBox4 ----
                comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24"
                }));
                panel3.add(comboBox4);
                comboBox4.setBounds(255, 10, 50, comboBox4.getPreferredSize().height);

                //---- comboBox5 ----
                comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31",
                    "32",
                    "33",
                    "34",
                    "35",
                    "36",
                    "37",
                    "38",
                    "39",
                    "40",
                    "41",
                    "42",
                    "43",
                    "44",
                    "45",
                    "46",
                    "47",
                    "48",
                    "49",
                    "50",
                    "51",
                    "52",
                    "53",
                    "54",
                    "55",
                    "56",
                    "57",
                    "58",
                    "59",
                    "60"
                }));
                panel3.add(comboBox5);
                comboBox5.setBounds(310, 10, 55, comboBox5.getPreferredSize().height);

                //---- label8 ----
                label8.setText("-");
                panel3.add(label8);
                label8.setBounds(185, 20, 20, 15);

                //---- label9 ----
                label9.setText(":");
                panel3.add(label9);
                label9.setBounds(305, 15, 15, label9.getPreferredSize().height);

                //---- label6 ----
                label6.setText("to");
                panel3.add(label6);
                label6.setBounds(new Rectangle(new Point(15, 55), label6.getPreferredSize()));

                //---- comboBox6 ----
                comboBox6.setModel(new DefaultComboBoxModel<>(new String[] {
                    "2021",
                    "2022",
                    "2023"
                }));
                panel3.add(comboBox6);
                comboBox6.setBounds(45, 50, 65, 30);

                //---- comboBox7 ----
                comboBox7.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12"
                }));
                panel3.add(comboBox7);
                comboBox7.setBounds(115, 50, 70, 30);

                //---- comboBox8 ----
                comboBox8.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31"
                }));
                panel3.add(comboBox8);
                comboBox8.setBounds(190, 50, 60, 30);

                //---- comboBox9 ----
                comboBox9.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24"
                }));
                panel3.add(comboBox9);
                comboBox9.setBounds(255, 50, 50, 30);

                //---- comboBox10 ----
                comboBox10.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31",
                    "32",
                    "33",
                    "34",
                    "35",
                    "36",
                    "37",
                    "38",
                    "39",
                    "40",
                    "41",
                    "42",
                    "43",
                    "44",
                    "45",
                    "46",
                    "47",
                    "48",
                    "49",
                    "50",
                    "51",
                    "52",
                    "53",
                    "54",
                    "55",
                    "56",
                    "57",
                    "58",
                    "59",
                    "60"
                }));
                panel3.add(comboBox10);
                comboBox10.setBounds(310, 50, 55, 30);

                //---- label10 ----
                label10.setText(":");
                panel3.add(label10);
                label10.setBounds(305, 55, 15, 17);

                //---- label11 ----
                label11.setText("-");
                panel3.add(label11);
                label11.setBounds(110, 55, 15, 17);

                //---- label12 ----
                label12.setText("-");
                panel3.add(label12);
                label12.setBounds(185, 55, 40, 17);

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
            frame1ContentPane.add(panel3);
            panel3.setBounds(145, 15, 430, 95);

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
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label1;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button6;
    private JLabel Image;
    private JButton button5;
    private JPanel panel3;
    private JLabel label2;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JLabel label7;
    private JComboBox<String> comboBox3;
    private JComboBox<String> comboBox4;
    private JComboBox<String> comboBox5;
    private JLabel label8;
    private JLabel label9;
    private JLabel label6;
    private JComboBox<String> comboBox6;
    private JComboBox<String> comboBox7;
    private JComboBox<String> comboBox8;
    private JComboBox<String> comboBox9;
    private JComboBox<String> comboBox10;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
