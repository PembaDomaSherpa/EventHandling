package ActionCommands;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventAction extends JFrame implements ActionListener {
    JLabel lb;
    EventAction(){
        lb=new JLabel();
        lb.setBounds(60,50,170,20);
        setLayout(new FlowLayout());
        JButton b1=new JButton("Continue");
        JButton b2=new JButton("Ok");

        add(b1);
        add(b2);
        add(lb);
        b1.addActionListener(this);
        b1.setBounds(50,120,100,40);
        b2.addActionListener(this);
        b2.setBounds(140,120,80,40);
        b1.setActionCommand("Proceed");
        b2.setActionCommand("Proceed");

    }
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand()=="Proceed")
            lb.setText("Do you want to proceed?");
    }
}
