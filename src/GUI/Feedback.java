/*
 * Created by JFormDesigner on Wed May 26 17:48:35 GMT+08:00 2021
 */

package GUI;

import javax.swing.border.*;
import service.PromoterDiscount;
import service.PromoterReward;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 666
 */
public class Feedback extends JFrame {
    public Feedback() {
        initComponents();
        this.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        String discount = textField1.getText();
        double d = Double.parseDouble(discount);
        PromoterReward pr = new PromoterReward();
        pr.rewardBalance(d);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setTitle("Feedback");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("input amount :");
        label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 20));
        contentPane.add(label1);
        label1.setBounds(130, 175, 140, 40);
        contentPane.add(textField1);
        textField1.setBounds(270, 185, 165, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("confirm");
        button1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 15));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.yellow, new Color(0, 221, 199), new Color(0, 86, 136), new Color(190, 56, 56)));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(250, 340, 100, 50);

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
