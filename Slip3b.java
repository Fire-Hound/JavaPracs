import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Slip3b extends Applet implements ActionListener
{
    //<applet code="Slip3b.class" height="200" width="200"></applet>
    TextField num;
    Label res;
    Button calc;
    public void init()
    {
        setLayout(new GridLayout(3, 2, 10, 15));  
        num = new TextField(5);
        add(num);
        calc = new Button("Calc if Prime");
        add(calc);
        res = new Label();
        add(res);
        calc.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n = Integer.parseInt(num.getText());
        for(int i=2; i<=n/2;i++)
        {
            if(n%i==0) 
            {
                res.setText("Not Prime");
                return;
            }
        }
        res.setText("Prime");
    }
}