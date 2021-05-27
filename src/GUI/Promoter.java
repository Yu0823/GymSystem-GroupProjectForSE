/*
 * Created by JFormDesigner on Wed May 26 07:05:42 GMT+08:00 2021
 */

package GUI;

import java.awt.event.*;
import javax.swing.border.*;
import dao.PriceListUtil;
import dao.alldo.PriceListDO;
import dao.alldo.PromoterDO;

import java.awt.*;
import javax.swing.*;

/**
 * @author 666
 */
public class Promoter extends JFrame {
    PromoterDO p;
    public Promoter(PromoterDO a) {
        this.p = a;
        initComponents();
        PriceListDO price = PriceListUtil.getPriceList();
        textArea1.setText("VIP price:\n"+price.getPrice1()+"\n\n"+"SVIP price:\n"+price.getPrice2());
        this.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Discount d = new Discount();
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        PriceListDO price = PriceListUtil.getPriceList();
        textArea1.setText("VIP price:\n"+price.getPrice1()+"\n\n"+"SVIP price:\n"+price.getPrice2());
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Feedback f = new Feedback();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        textArea1 = new JTextArea();
        button3 = new JButton();

        //======== this ========
        setTitle("Promoter");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("current price");
        label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 19));
        contentPane.add(label1);
        label1.setBounds(60, 35, 135, 50);

        //---- button1 ----
        button1.setText("discount");
        button1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.yellow, new Color(200, 27, 27), new Color(255, 93, 225), new Color(0, 14, 198)));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(450, 125, 100, 50);

        //---- button2 ----
        button2.setText("feedback");
        button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
        button2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.green, new Color(106, 59, 113), new Color(204, 51, 0), Color.darkGray));
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(450, 185, 100, 50);

        //---- textArea1 ----
        textArea1.setEditable(false);
        textArea1.setBorder(new MatteBorder(5, 2, 1, 2, Color.gray));
        contentPane.add(textArea1);
        textArea1.setBounds(55, 100, 270, 275);

        //---- button3 ----
        button3.setText("refresh");
        button3.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 95, 201), new Color(23, 35, 216), new Color(100, 146, 47), Color.green));
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3);
        button3.setBounds(215, 35, 100, 50);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JTextArea textArea1;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {

    }
}
