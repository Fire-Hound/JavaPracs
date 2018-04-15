import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Cal implements ActionListener
{
	static Frame f;
    TextField input;
	Button b[]=new Button[10];
	Button b10,b11,b12,b13,b14,b15,b16;
	int val1, val2, result;
	char OPRAT;
	String ins, input_value = "";	//inserted values in textfield
	void addGrid(int x, int y, Insets inset, Button b)
	{
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = inset;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth=1;
		gbc.fill = GridBagConstraints.BOTH;
		f.add(b, gbc);
	}
	Cal()
    {
		input = new TextField(20);
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		b10 = new Button("+");
		b11 = new Button("-");
		b12 = new Button("*");
		b13 = new Button("/");
		b14 = new Button("%");
		b15 = new Button("=");
		b16 = new Button("C");
		GridBagLayout gl=new GridBagLayout();
		f.setLayout(gl);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth=5;
		gbc.insets = new Insets(0, 0, 0,0);
		f.add(input, gbc);
		Insets inset = new Insets(0, 0, 10, 10);
		for(int i=0;i<5;i++)
		{	
			addGrid(i, 1, inset, b[i]);
		}
		for(int i=5;i<10;i++)
		{
			addGrid(i%5, 2, inset, b[i]);
		}
		Button [] butts = {b10,b11,b12,b13,b14,b15,b16}; //hehe
		int i =0;
		for(int x=0;x<5;x++)
		{	
			addGrid(x, 3, inset, butts[i]);
			i++;
		}
		for(int x=0;x<2;x++)
		{	
			addGrid(x, 4, inset, butts[i]);
			i++;
		}
		for(i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		} 
		for(Button butt:butts) 
		{
			butt.addActionListener(this);  			
		}	
	}
	public long calculate(String str)
	{	
		String num1="";
		String num2="";
		int i=0;
		for(;i<str.length();i++)
		{
			if(str.charAt(i)==OPRAT)
			{
				break;
			}		
			num1+=""+str.charAt(i);
		}
		for(i+=1;i<str.length();i++)
		{
			num2+=""+str.charAt(i);
		}
		System.out.println(OPRAT);
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		switch(OPRAT)
		{
			case '+': return Long.parseLong(num1)+Long.parseLong(num2);
			case '-': return Long.parseLong(num1)-Long.parseLong(num2);
			case '/': return Long.parseLong(num1)/Long.parseLong(num2);
			case '*': return Long.parseLong(num1)*Long.parseLong(num2);
			case '%': return Long.parseLong(num1)%Long.parseLong(num2);
		}
		return 0;
	}
	
	public void actionPerformed(ActionEvent ae)
    {		
		String button_pressed = ae.getActionCommand();
		switch(button_pressed)
		{
			case "+":	OPRAT='+';
						break;
			case "-" :	OPRAT='-';
						break;
			case "*" :	OPRAT='*';
						break;
			case "/" :	OPRAT='/';
						break;
			case "%" :	OPRAT='%';
						break;
			case "=" : 	input_value = calculate(input_value)+"";
						input.setText(input_value);
						return;
			case "C" : 	OPRAT='C';
						input.setText("");
						input_value="";
						return;
		}		
		input_value += ae.getActionCommand();
		input.setText(input_value);
	}
	public static void main(String[] args) {
		
		f = new Frame("Calculator");
		f.show();
		f.setSize(300,300);
		Cal c = new Cal();



			
		//This is not important IGNORE. 
		//closes app when user clicks on X above
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				f.dispose();
				System.exit(0);
			}
		});
	}
}	