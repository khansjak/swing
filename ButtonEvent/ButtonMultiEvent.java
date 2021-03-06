package ButtonEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ButtonMultiEvent {
    public static void main(String[] args) {
        JFrame f = new JFrame("J Frame Demo 3");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("Click Me");
        btn.setBounds(100,100,100,50);
        c.add(btn);

        //Anonymous inner class
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.pink);
            }
        });
    }
}
