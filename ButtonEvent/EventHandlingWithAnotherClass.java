package ButtonEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingWithAnotherClass {
    public static Container c;
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c=f.getContentPane();
        c.setLayout(null);
        JButton red = new JButton("Red");
        JButton yellow = new JButton("Yellow");
        JButton green = new JButton("Green");

        red.setBounds(100,100,100,50);
        green.setBounds(200,100,100,50);
        yellow.setBounds(300,100,100,50);

        c.add(red);
        c.add(green);
        c.add(yellow);

        red.addActionListener(new RedClass());
        green.addActionListener(new GreenClass());
        yellow.addActionListener(new YellowClass());
        f.setVisible(true);

    }
}

class RedClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        EventHandlingWithAnotherClass.c.setBackground(Color.RED);
    }
}

class GreenClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        EventHandlingWithAnotherClass.c.setBackground(Color.GREEN);
    }
}

class YellowClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        EventHandlingWithAnotherClass.c.setBackground(Color.YELLOW);
    }
}
