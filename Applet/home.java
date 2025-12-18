import java.applet.Applet;
import java.awt.*;

public class home extends Applet {
    public void paint(Graphics g){

        //home
        g.setColor(Color.yellow);
        g.fillRect(100,100,200,400);

        //windows
        g.setColor(Color.blue);
        g.fillRect(125,150,50,50);
        g.fillRect(175,150,50,50);

        //door
        g.setColor(Color.blue);
        g.fillRect(150, 250, 50,40);
        g.setColor(Color.black);
        g.fillOval(170, 270, 10, 10);

        //grass
        g.setColor(Color.green);
        g.fillRect(0,60,10,100);

        //stop
        g.setColor(Color.black);
        g.drawLine(400,100,500,100);
        g.setColor(Color.red);
        int x[] = {210,160,230};
        int y[] = {160,200,210};
        g.fillPolygon(x,y,7);

        //roof
        g.setColor(Color.blue);
        int a[] = {90, 140, 210};
        int b[] = {100, 50, 100};
        g.fillPolygon(a,b,3);
    }
}