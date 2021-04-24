package ButtonEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame implements ActionListener{
    JButton btn;
    Container c;
    MyFrame1(){
        c=this.getContentPane();
        c.setLayout(null);
        btn = new JButton("Make Red");
        btn.setBounds(100,100,50,30);
        c.add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.RED);
        btn.setBackground(Color.orange);
    }
        }
public class ButtonEvent2 {
    public static void main(String[] args) {
        MyFrame1 f2= new MyFrame1();
        f2.setTitle("New Form");
        f2.setSize(700,500);
        f2.setLocation(100,100);
        f2.setDefaultCloseOperation(MyFrame1.EXIT_ON_CLOSE);
        f2.setVisible(true);


    }
}
