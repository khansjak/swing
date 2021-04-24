package ButtonEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton btn;
    MyFrame(){
        c= this.getContentPane();
        c.setLayout(null);
        btn=new JButton("Go Yellow");
        btn.setBounds(100,100,100,50);
        c.add(btn);
        btn.addActionListener(this);
    }
    //We have to override in order to avoid abstract error for action listener
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.ORANGE);
    }
}

public class ButtonEvents {
    public static void main(String[] args) {
        MyFrame f =new MyFrame();
        f.setTitle("Action Demo");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set yellow color on button click


    }
}
