package WindowEvent;


import KeyEvent.EventKey;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventWindow extends WindowAdapter {
    JFrame frame;
    public EventWindow(){
        frame=new JFrame();
        frame.setTitle("Handling Window Event");
        frame.addWindowListener(this);
        frame.setSize(400,300);
        frame.setVisible(true);

    }

    @Override
    public void windowClosing(WindowEvent e) {
       JOptionPane.showMessageDialog(frame,"GoodBye");
       System.exit(1);

    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(frame,"Welcome");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(frame,"See you later");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(frame,"Welcome Back");
    }
    public static  void main(String[] args){
       new EventWindow();

    }
}
