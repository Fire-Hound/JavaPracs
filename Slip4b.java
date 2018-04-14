import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Slip4b extends Applet implements ActionListener
{
    //<applet code="Slip4b.class" height="200" width="200"></applet>
    TextField num;
    Label res;
    Button calc;
    public void init()
    {
        setLayout(new GridLayout(3,1,10,15));  
        num = new TextField(5);
        add(num);
        calc = new Button("Calc Reverse");
        add(calc);
        res = new Label();
        add(res);
        calc.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = num.getText();
        String rev="";
        for(int i=s.length()-1; i>=0; i--)
        {
            rev += ""+s.charAt(i);
        }
        res.setText(rev);
    }
}