/*
 * Created by JFormDesigner on Wed May 26 07:05:42 GMT+08:00 2021
 */

package GUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author 666
 */
public class Promoter extends JFrame {
    public Promoter() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 666
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("Promoter");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("current price");
        contentPane.add(label1);
        label1.setBounds(60, 20, 135, 50);
        contentPane.add(textField1);
        textField1.setBounds(55, 75, 285, 140);

        //---- button1 ----
        button1.setText("discount");
        contentPane.add(button1);
        button1.setBounds(445, 65, 115, 35);

        //---- button2 ----
        button2.setText("feedback");
        contentPane.add(button2);
        button2.setBounds(450, 185, 115, 45);

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
    // Generated using JFormDesigner Evaluation license - 666
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
