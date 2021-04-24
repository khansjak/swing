package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    private Container c;
    private JLabel l1,l2,r;
    private JTextField t1,t2;
    private JButton add,substract,multiply,devide;


    MyFrame(){
        setTitle("Simple Calculator");
        setSize(500,600);
        setLocation(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        l1 = new JLabel("Number 1");
        l1.setBounds(10,100,100,30);
        c.add(l1);
        t1=new JTextField();
        t1.setBounds(100,100,100,30);
        c.add(t1);

        l2 = new JLabel("Number 2");
        l2.setBounds(10,150,100,30);
        c.add(l2);
        t2=new JTextField();
        t2.setBounds(100,150,100,30);
        c.add(t2);

        add=new JButton("+");
        add.setBounds(10,250,50,30);
        c.add(add);
        add.addActionListener(this);

        substract=new JButton("-");
        substract.setBounds(60,250,50,30);
        c.add(substract);
        substract.addActionListener(this);

        multiply=new JButton("*");
        multiply.setBounds(110,250,50,30);
        c.add(multiply);
        multiply.addActionListener(this);

        devide=new JButton("/");
        devide.setBounds(160,250,50,30);
        c.add(devide);
        devide.addActionListener(this);

        r = new JLabel("Result :");
        r.setBounds(10,300,200,30);
        c.add(r);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        try{
            if (e.getSource()==add){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a+b;
                r.setText(a+"+"+b+"="+c);
                r.setForeground(Color.black);
            }
            if (e.getSource()==substract){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a-b;
                r.setText(a+"-"+b+"="+c);
                r.setForeground(Color.black);
            }
            if (e.getSource()==multiply){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a*b;
                r.setText(a+"*"+b+"="+c);
                r.setForeground(Color.black);
            }
            if (e.getSource()==devide){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a/b;
                r.setText(a+"/"+b+"="+c);
                r.setForeground(Color.black);
            }

        }catch(NumberFormatException e1){
            r.setText("Enter only numbers");
            r.setForeground(Color.red);
        }catch (ArithmeticException e2){
            r.setText("Cannot devide by zero");
            r.setForeground(Color.red);
        }
    }
}
public class SimpleCalculator {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();

    }
}
