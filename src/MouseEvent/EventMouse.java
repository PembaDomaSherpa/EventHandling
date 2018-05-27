package MouseEvent;

import WindowEvent.EventWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventMouse extends JFrame implements MouseListener {
    int x,y,r1,r2;
    public EventMouse(){
        addMouseListener(this);
        setSize(400,300);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        r1=60;
        r2=40;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(x,y,r1,r2);
    }

    public static  void main(String[] args){
        new EventMouse();

    }
}
