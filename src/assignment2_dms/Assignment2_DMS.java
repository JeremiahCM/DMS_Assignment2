/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_dms;

//GUI List
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JColorChooser;
import javax.swing.JComponent;

/**
 *
 * @author valar
 */
public class Assignment2_DMS {
         // GUI frame
    private JButton Enter;
    private JButton Exit;
    private JButton Back;
    private JMenuBar menuBar;
    private JLabel label;
    private JPasswordField password;

    public Assignment2_DMS() {
        //Buttons
        Enter = new JButton("Enter");
        Exit = new JButton("Exit");
        Back = new JButton("Back");
        //Menu
        Enter.setBounds(160, 150, 80, 80);
        Exit.setBounds(190, 190, 100, 200);
        Back.setBounds(220, 230, 120, 320);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
