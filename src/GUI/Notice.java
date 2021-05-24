/*
 * Created by JFormDesigner on Mon Apr 12 18:08:37 CST 2021
 */

package GUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author yly
 */
public class Notice extends JPanel {
    String type;
    public Notice(String type) {
        initComponents();
        this.type = type;
        if(type.equals("register")){
            register.setVisible(true);
        }
        else
        {
            register.setText(type);
            register.setVisible(true);
        }
        Notice.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - PangYu
        Notice = new JFrame();
        register = new JLabel();

        //======== Notice ========
        {
            Notice.setTitle("Notice");
            var NoticeContentPane = Notice.getContentPane();
            NoticeContentPane.setLayout(null);

            //---- register ----
            register.setText("Register successfully");
            register.setForeground(Color.red);
            register.setHorizontalAlignment(SwingConstants.LEFT);
            NoticeContentPane.add(register);
            register.setBounds(55, 45, 595, 215);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < NoticeContentPane.getComponentCount(); i++) {
                    Rectangle bounds = NoticeContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = NoticeContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                NoticeContentPane.setMinimumSize(preferredSize);
                NoticeContentPane.setPreferredSize(preferredSize);
            }
            Notice.pack();
            Notice.setLocationRelativeTo(Notice.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - PangYu
    private JFrame Notice;
    private JLabel register;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
