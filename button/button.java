package button;

import javax.swing.*;
import java.awt.*;

public class button {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 700, 500);
        frame.setTitle("My Button");

        Container c =frame.getContentPane();
        c.setLayout(null);

        ImageIcon icon = new ImageIcon("/Users/jak/Simplilearn/Swings/src/button/swan.png");
        //JButton jButton = new JButton("Click Me");
        JButton jButton = new JButton(icon);
        jButton.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
        c.add(jButton);
        jButton.setFont(new Font("Arial",Font.BOLD,23));
        jButton.setForeground(Color.ORANGE);
        jButton.setBackground(Color.gray);

        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        jButton.setCursor(cur);

        //Disable Enable

        //jButton.setEnabled(false);
        //Hide button
        //jButton.setVisible(false);
        //Use image in button

    }
}
