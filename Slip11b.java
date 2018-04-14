import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Slip11b extends Applet implements ActionListener{
    //<applet code="Slip11b.class" height="500" width="500"></applet>
    
        TextField tb;
        Button calc;
        Label ans;
        public void init()
        {
            tb = new TextField(6);
            add(tb);
            calc = new Button("Calc cube");
            add(calc);
            ans = new Label();
            add(ans);
            calc.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae)
        {
            int num = Integer.parseInt(tb.getText());
            ans.setText(String.valueOf(num*num*num));
        }
    

}