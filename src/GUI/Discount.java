/*
 * Created by JFormDesigner on Wed May 26 17:48:20 GMT+08:00 2021
 */

package GUI;

import javax.swing.border.*;
import service.PromoterDiscount;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 666
 */
public class Discount extends JFrame {
    public Discount() {
        initComponents();
        label2.setVisible(false);
        this.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(textField1.getText().isEmpty()){
            label2.setVisible(true);
        }
        else{
            label2.setVisible(false);
            String discount = textField1.getText();
            double d = Double.parseDouble(discount);
            PromoterDiscount pd = new PromoterDiscount();
            pd.makeDiscount(d);
            this.dispose();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        label2 = new JLabel();

        //======== this ========
        setTitle("Modify");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("discount");
        label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 20));
        contentPane.add(label1);
        label1.setBounds(180, 170, 90, 40);
        contentPane.add(textField1);
        textField1.setBounds(275, 180, 160, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("confirm");
        button1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.BOLD, 15));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.pink, new Color(109, 59, 221), new Color(211, 41, 41), Color.yellow));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(250, 345, 100, 50);

        //---- label2 ----
        label2.setText("please input a number!");
        label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 20));
        contentPane.add(label2);
        label2.setBounds(190, 220, 235, 25);

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
        setSize(620, 495);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
