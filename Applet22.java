import java.awt.*;
import java.applet.*; 
//<applet code="Applet22" width=500 height=500></applet>
public class Applet22 extends Applet
{
public void init()
{
System.out.println("inti() method is called");
}
public void start()
{
System.out.println("start() method is called");
}
public void paint(Graphics g)
{
g.drawString("hello welcome to  java applet",100,250);
System.out.println("paint() method is called");
}
public void stop()
{
System.out.println("stop()  method is called");
}
public void destroy()
{
System.out.println("destroy() method is called");
}

}