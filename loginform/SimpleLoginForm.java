package loginform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;

class MyFrame extends JFrame implements ActionListener {
    Container c;
    JLabel label1,label2;
    JTextField user;
    JPasswordField pass;
    JButton btn;

    MyFrame(){

        setTitle("Login Form");
        setSize(500,400);
        setLocation(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c=getContentPane();
        c.setLayout(null);
        label1=new JLabel("User ID");
        label2=new JLabel("Password");
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);

        c.add(label1);
        c.add(label2);

        user = new JTextField();
        user.setBounds(120,50,120,20);
        c.add(user);

        pass = new JPasswordField();
        pass.setBounds(120,100,120,20);
        c.add(pass);

        btn=new JButton("Login");
        btn.setBounds(140,150,70,20);
        c.add(btn);
        btn.addActionListener(this);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        System.out.println("User ID :"+user.getText()+" Password is :"+pass.getText());
    }
}
public class SimpleLoginForm {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();

    }
}
