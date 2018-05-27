package KeyEvent;

import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class EventKey extends JFrame implements KeyListener {
    private JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4;

    public EventKey(){
        super("Handling Action Events");
        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        l1=new JLabel("First Value");
        l2=new JLabel("Second Value");
        l3=new JLabel("Result Value");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        b1=new JButton("Calculate");
       // b2=new JButton("Subtract");
        //b3=new JButton("Multiply");
        //b4=new JButton("Divide");
        b1.addKeyListener(this);
        //b2.addActionListener(this);
        //b3.addActionListener(this);
        // b4.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        //add(b2);
        // add(b3);
        // add(b4);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e){
        int x,y,z=0;
        x=Integer.parseInt(t1.getText());
        y=Integer.parseInt(t2.getText());
        if (e.getKeyChar()=='a')
            z=x+y;
        else if (e.getKeyChar()=='s')
            z=x-y;
        else
            t3.setText("Press a or s");
        t3.setText(String.valueOf(z));
        return;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static  void main(String[] args){
        EventKey cal=new EventKey();
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setSize(400,500);
        cal.setVisible(true);
    }
}

