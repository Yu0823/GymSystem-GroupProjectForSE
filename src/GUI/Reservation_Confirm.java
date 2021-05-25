/*
 * Created by JFormDesigner on Tue May 25 10:58:07 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;
import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;
import dao.alldo.ClassDO;
import service.CustomerBook;
/**
 * @author MudongGuo
 */
public class Reservation_Confirm extends JFrame {
    MemberDO m;
    TrainerDO t;
    ClassDO c;
    public Reservation_Confirm(MemberDO m, TrainerDO t) {
        initComponents();
        frame1.setVisible(true);
        this.m = m;
        this.t = t;
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        String type = comboBox2.getSelectedItem().toString();
        String month = comboBox4.getSelectedItem().toString();
        String date = comboBox3.getSelectedItem().toString();
        String time = null;//输出的时间
        if(comboBox1.getSelectedItem().toString()=="8:30-10:00"){
            time = "0830";
        }else if(comboBox1.getSelectedItem().toString()=="10:00-11:30"){
            time = "1030";
        }else if(comboBox1.getSelectedItem().toString()=="14:00-15:30"){
            time = "1400";
        }else if(comboBox1.getSelectedItem().toString()=="15:30-17:00"){
            time = "1530";
        }else if(comboBox1.getSelectedItem().toString()=="20:00-21:30"){
            time = "2000";
        }
        if(month=="02"&&(date=="31"||date=="30")
                ||month=="04"&&date=="31"
                ||month=="06"&&date=="31"
                ||month=="09"&&date=="31"
                ||month=="011"&&date=="31"
        ){
            JOptionPane.showMessageDialog(null,"Invalid Date!");
        }else {
            String finalDate = "2021"+month+date; //输出的日期
            //c.setType(type);
            c.setCusId(this.m.getId());
            c.setDate(finalDate);
            c.setTime(time);
            c.setIsConfirm("false");
            c.setTrainerId(this.t.getId());
            CustomerBook a = new CustomerBook();
            a.book(c);
            JOptionPane.showMessageDialog(null,"Please wait for the trainer to confirm your appointment!");
        }
        frame1.setVisible(false);
        new Reservation(this.m);
        frame1.dispose();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.dispose();
        new Reservation(this.m);
        frame1.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        comboBox1 = new JComboBox<>();
        label2 = new JLabel();
        label3 = new JLabel();
        comboBox2 = new JComboBox<>();
        comboBox3 = new JComboBox<>();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        comboBox4 = new JComboBox<>();

        //======== frame1 ========
        {
            frame1.setUndecorated(true);
            frame1.setFont(new Font(Font.DIALOG, Font.ITALIC, 32));
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- button1 ----
            button1.setText("Back");
            button1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button1.getFont().getStyle(), button1.getFont().getSize() + 8));
            button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.pink, Color.green, Color.orange, new Color(0, 77, 187)));
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            frame1ContentPane.add(button1);
            button1.setBounds(540, 470, 150, 50);

            //---- label1 ----
            label1.setText("Reservation Confirm");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.white);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5));
            frame1ContentPane.add(label1);
            label1.setBounds(45, 25, 190, 70);

            //---- button2 ----
            button2.setText("Confirm");
            button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button2.getFont().getStyle(), button2.getFont().getSize() + 8));
            button2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.yellow, Color.red, Color.magenta, new Color(0, 119, 182)));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(370, 470, 150, 50);

            //---- comboBox1 ----
            comboBox1.setBorder(new BevelBorder(BevelBorder.RAISED));
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "8:30-10:00",
                "10:00-11:30",
                "14:00-15:30",
                "15:30-17:00",
                "20:00-21:30"
            }));
            frame1ContentPane.add(comboBox1);
            comboBox1.setBounds(505, 340, 100, 50);

            //---- label2 ----
            label2.setText("Choose when you want to take classes");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
            label2.setAutoscrolls(true);
            frame1ContentPane.add(label2);
            label2.setBounds(95, 260, 315, 50);

            //---- label3 ----
            label3.setText("Choose type of the classes");
            label3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
            label3.setAutoscrolls(true);
            frame1ContentPane.add(label3);
            label3.setBounds(95, 170, 315, 50);

            //---- comboBox2 ----
            comboBox2.setBorder(new BevelBorder(BevelBorder.RAISED));
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "Yoga",
                "Martial art",
                "Fitness",
                "Aerobics"
            }));
            frame1ContentPane.add(comboBox2);
            comboBox2.setBounds(420, 170, 100, 50);

            //---- comboBox3 ----
            comboBox3.setBorder(new BevelBorder(BevelBorder.RAISED));
            comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                "01",
                "02",
                "03",
                "04",
                "05",
                "06",
                "07",
                "08",
                "09",
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
            frame1ContentPane.add(comboBox3);
            comboBox3.setBounds(330, 340, 100, 50);

            //---- label4 ----
            label4.setText("Time");
            label4.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
            label4.setAutoscrolls(true);
            frame1ContentPane.add(label4);
            label4.setBounds(455, 340, 45, 50);

            //---- label5 ----
            label5.setText("Day");
            label5.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
            label5.setAutoscrolls(true);
            frame1ContentPane.add(label5);
            label5.setBounds(290, 340, 35, 50);

            //---- label6 ----
            label6.setText("Month");
            label6.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
            label6.setAutoscrolls(true);
            frame1ContentPane.add(label6);
            label6.setBounds(105, 340, 55, 50);

            //---- comboBox4 ----
            comboBox4.setBorder(new BevelBorder(BevelBorder.RAISED));
            comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                "01",
                "02",
                "03",
                "04",
                "05",
                "06",
                "07",
                "08",
                "09",
                "10",
                "11",
                "12"
            }));
            frame1ContentPane.add(comboBox4);
            comboBox4.setBounds(165, 340, 100, 50);

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
            frame1.setSize(725, 585);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JFrame frame1;
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    private JComboBox<String> comboBox1;
    private JLabel label2;
    private JLabel label3;
    private JComboBox<String> comboBox2;
    private JComboBox<String> comboBox3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JComboBox<String> comboBox4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
