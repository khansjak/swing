package form;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Form");
        frame.setBounds(500,200,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= frame.getContentPane();
        c.setLayout(null);

        //Labels
        JLabel label1 = new JLabel("User Name");
        label1.setBounds(100,50,120,30);
        JLabel label2 = new JLabel("Password");
        label2.setBounds(100,100,120,30);

        //Text Fields
        JTextField textField1 = new JTextField();
        textField1.setBounds(180,50,200,30);
        textField1.setText("Enter User Name");
        textField1.setForeground(Color.lightGray);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(180,100,200,30);
        passwordField.setText("Enter Password");
        passwordField.setForeground(Color.lightGray);

        //Buttons
        ImageIcon icon = new ImageIcon("/Users/jak/Simplilearn/Swings/src/form/login.png");
        JButton button1 = new JButton(icon);
        //button1.setSize(icon.getIconWidth(),icon.getIconHeight());
        //button1.setSize(icon.getIconWidth(),icon.getIconHeight());
        button1.setBounds(240,150,icon.getIconWidth(),icon.getIconHeight());
        c.add(button1);
        c.add(label1);
        c.add(label2);
        c.add(textField1);
        c.add(passwordField);


        //frame.setBackground(Color.gray);
        c.setBackground(Color.gray);
        label1.setForeground(Color.ORANGE);
        label2.setForeground(Color.ORANGE);
        textField1.setBackground(Color.ORANGE);
        textField1.setForeground(Color.gray);
        passwordField.setBackground(Color.ORANGE);
        passwordField.setForeground(Color.gray);
        frame.setVisible(true);
    }
}
