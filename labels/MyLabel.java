package labels;

import javax.swing.*;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,500);
        //frame.setLocation(500,300);
        frame.setBounds(500, 300, 700, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);
        frame.setResizable(false);
        ImageIcon icon = new ImageIcon("/Users/jak/Simplilearn/Swings/src/labels/swan.png");
        JLabel jLabel = new JLabel("Click Me",icon,SwingConstants.RIGHT);
        jLabel.setBounds(100,50,200,30);
        Font font = new Font("Arial",Font.PLAIN,18);
        jLabel.setFont(font);
        c.add(jLabel);
        frame.setVisible(true);


    }
}
