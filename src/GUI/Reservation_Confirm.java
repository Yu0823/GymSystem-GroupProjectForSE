/*
 * Created by JFormDesigner on Tue May 25 10:58:07 CST 2021
 */

package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.MemberDO;
import dao.alldo.TrainerDO;
/**
 * @author MudongGuo
 */
public class Reservation_Confirm extends JFrame {
    public Reservation_Confirm(MemberDO m, TrainerDO t) {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
