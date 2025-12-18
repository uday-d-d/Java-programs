import java.applet.Applet;
import java.awt.*;

public class name_branch extends Applet {
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.magenta);

    }
    public void paint(Graphics g){
        String name = getParameter("name");
        String branch = getParameter("branch");

        g.drawString("Name: " + name, 50, 50);
        g.drawString("Branch: " + branch, 50, 70);
    }
}

/*
<html>
<body>
<applet code = "name_branch.class" width = "300" height = "300"
<param name = "name" value = "John Doe">
<param name = "branch" value = "Computer Science">
</applet>
</applet>
</body>
</html>
*/