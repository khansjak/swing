package radiobutton;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    Container c;
    JRadioButton jRadioButton,jRadioButton2,general,obc,st,sc;
    ButtonGroup gender,cast;
    MyFrame(){
        setTitle("Radio Button Demo");
        setSize(500,600);
        setLocation(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        jRadioButton = new JRadioButton("Male");
        jRadioButton.setBounds(100,50,100,30);
        c.add(jRadioButton);

        jRadioButton2 = new JRadioButton("Female");
        jRadioButton2.setBounds(200,50,100,30);
        c.add(jRadioButton2);

        general = new JRadioButton("General");
        obc = new JRadioButton("OBC");
        st = new JRadioButton("ST");
        sc = new JRadioButton("SC");
        general.setBounds(100,100,100,20);
        obc.setBounds(200,100,100,20);
        st.setBounds(300,100,100,20);
        sc.setBounds(400,100,100,20);
        c.add(general);
        c.add(obc);
        c.add(st);
        c.add(sc);

        cast=new ButtonGroup();
        cast.add(general);
        cast.add(obc);
        cast.add(st);
        cast.add(sc);
        sc.setEnabled(false);

        gender=new ButtonGroup();
        gender.add(jRadioButton);
        gender.add(jRadioButton2);


        setVisible(true);


    }
}

public class RadioButton {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
