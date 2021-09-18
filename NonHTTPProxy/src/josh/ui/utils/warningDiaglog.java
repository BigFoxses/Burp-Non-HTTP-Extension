package josh.ui.utils;




import javax.swing.JPanel;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

import javax.swing.JCheckBox;

public class warningDiaglog extends JPanel {
    public warningDiaglog() {} 

    public void warning(String message){
        JFrame frame =new JFrame("Warning");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(frame,message);

    }

}