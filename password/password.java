package password;

import javax.swing.*;
import java.awt.*;

public class password {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 700, 500);
        frame.setTitle("My Text Field");

        Container c =frame.getContentPane();
        c.setLayout(null);

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(100,50,120,30);
        c.add(jPasswordField);
        //Show particular character in place of dots
        jPasswordField.setEchoChar('*');

        //How to show password
        jPasswordField.setEchoChar((char)0);
        jPasswordField.setVisible(true);
    }
}
