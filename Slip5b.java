import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class Slip5b extends Applet implements MouseListener, MouseMotionListener{
    String string = "";
    public void init(){
        //<applet code="Slip5b.class" height="500" width="500"></applet>
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void paint(Graphics g){ g.drawString(string,100,100);}
    public void mouseExited(MouseEvent ae){
        string = "mouseExited";
        repaint();
    }
    public void mouseReleased(MouseEvent ae){
        string = "mouseReleased";
        repaint();
    }
    public void mouseEntered(MouseEvent ae){
        string = "mouseEntered";
        repaint();
    }
    public void mousePressed(MouseEvent ae){
        string = "mousePressed";
        repaint();
    }
    public void mouseClicked(MouseEvent ae){
        string = "mouseClicked";
        repaint();
    }
    public void mouseMoved(MouseEvent ae){
        string = "mouseMoved";
        repaint();
    }
    public void mouseDragged(MouseEvent ae){
        string = "mouseDragged";
        repaint();
    }
}