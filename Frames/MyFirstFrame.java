package Frames;

import javax.swing.*;
import java.awt.*;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,500);
        //frame.setLocation(500,300);
        frame.setBounds(500, 300, 700, 500);
        frame.setTitle("Swinging Here");

        ImageIcon icon = new ImageIcon("/Users/jak/Simplilearn/Swings/src/Frames/cup.png");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        c.setBackground(Color.gray);
        JLabel jLabel1 = new JLabel(icon);
        jLabel1.setBounds(100,100,icon.getIconWidth(),icon.getIconHeight());
        c.add(jLabel1);

        frame.setResizable(false);
    }
}
