import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class C extends Applet implements ItemListener {
//<applet code="C.class" height="300" width="300"></applet>
    Label l1, l2, lr;
    TextField t1, t2, tr;
    Choice operators;
    double value, num1, num2;
    public void init()
    {
        l1 = new Label("Enter First Number ");
        l2 = new Label("Enter Second Number ");
        lr = new Label("Result ");

        t1 = new TextField(10);
        t2 = new TextField(10);
        tr = new TextField(10);

        operators = new Choice();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(lr);
        add(tr);
        add(operators);
        operators.addItemListener(this);
        
    }
    public void itemStateChanged(ItemEvent ie)
    {
        value=0;
        num1 = Double.parseDouble(t1.getText());
        num2 = Double.parseDouble(t2.getText());
        System.out.println(num1+num2+value);
        switch (operators.getSelectedItem()) {
            case "+": value = num1 + num2;  break;
            case "-": value = num1 - num2;  break;
            case "*": value = num1 * num2;  break;
            case "/": value = num1 / num2;  break;
        }
        tr.setText(value+"");
    }
    
}