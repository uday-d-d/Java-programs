import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class StatusApplet2 extends Applet implements MouseListner{
    public void init(){
        addMouseListner(this);
    }

    public void mouseClicked(MouseEvent e){
        showStatus("Mouse Clicked");
        setBackground(Color.red);
        repaint();
    }

    public void mouseReleased(MouseEvent e){
        showStatus("Mouse Released");
        setBackground(Color.green);
    }

    public void mousePressed(MouseEvent e){
        shoeStatus("Mouse Pressed");
        setBackground(Color.black);
    }

    public void mouseEntered(MouseEvent e){
        showStatus("Mouse Entered");
        setBackground(Color.blue);
    }

    public void mouseExited(MouseEvent e){
        showStatus("Mouse Exited"):
        setBackground(Color.yellow);
    }
}