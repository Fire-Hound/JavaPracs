import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Slip8b extends Applet implements KeyListener
{
    //<applet code="Slip8b.class" height="500" width="500"></applet>
    public void init()
    {
     addKeyListener(this);   
    }
    public void keyReleased(KeyEvent ke)
    {
        System.out.println("keyReleased: " + ke.getKeyChar());
    }
    public void keyPressed(KeyEvent ke)
    {
        System.out.println("keyPressed: " + ke.getKeyChar());
    }
    public void keyTyped(KeyEvent ke)
    {
        System.out.println("keyTyped: " + ke.getKeyChar());
    }
}