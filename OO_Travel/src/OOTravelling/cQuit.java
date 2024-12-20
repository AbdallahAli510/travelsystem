/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOTravelling;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ALAMIIA
 */
class cQuit {
    private JFrame frame;

    public void quit() {
        frame = new JFrame("Exit");
        frame.setSize(1200, 200);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Travel Management System",
              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
}
