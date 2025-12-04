package Applet;
import java.applet.Applet;
import java.awt.*;


public class UseParam extends Applet{
    public void init(){
        setBackground(Color.red);
        setForeground(Color.green);
    }

    public void paint(Graphics g){
        String str = getParameter("msg");
        g.drawString(str,50,50);
    }
}

/* <applet code = "UseParam.class" width = "300" height = "300" > 
<param name = "msg" value = "Welcome to my page">
</applet> */
