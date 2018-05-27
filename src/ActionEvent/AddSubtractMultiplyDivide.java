package ActionEvent;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSubtractMultiplyDivide extends JFrame implements ActionListener {
    private JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4;

   public AddSubtractMultiplyDivide(){
        super("Handling Action Events");
        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        l1=new JLabel("First Value");
        l2=new JLabel("Second Value");
        l3=new JLabel("Result Value");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        b1=new JButton("Add");
        b2=new JButton("Subtract");
        b3=new JButton("Multiply");
        b4=new JButton("Divide");
        b1.addActionListener(this);
        b2.addActionListener(this);
        //b3.addActionListener(this);
       // b4.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
       // add(b3);
       // add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x,y,z;
        x=Integer.parseInt(t1.getText());
        y=Integer.parseInt(t2.getText());
        if (e.getActionCommand()=="Add")
            z=x+y;
        else
            z=x-y;
        t3.setText(String.valueOf(z));



    }
    public static  void main(String[] args){
        AddSubtractMultiplyDivide cal=new AddSubtractMultiplyDivide();
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setSize(400,500);
        cal.setVisible(true);
    }
}
