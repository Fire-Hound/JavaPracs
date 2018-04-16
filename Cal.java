import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.applet.Applet;
public class Cal implements ActionListener
{
	static Frame f;
    TextField input;
	Button b[]=new Button[10];
	Button b10,b11,b12,b13,b14,b15,b16;
	int val1, val2, result;
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
	public double calculate(String str)
	{	

		ArrayList<String> nums = new ArrayList<String>();
		ArrayList<String> ops = new ArrayList<String>();
		String recentNum = "";
		String calc = "";
		for (char n : str.toCharArray()) {
			switch(n)
			{
				case '+': ops.add("+"); nums.add(recentNum); recentNum = ""; break;
				case '-': ops.add("-"); nums.add(recentNum); recentNum = ""; break;
				case '/': ops.add("/"); nums.add(recentNum); recentNum = ""; break;
				case '*': ops.add("*"); nums.add(recentNum); recentNum = ""; break;
				case '%': ops.add("%"); nums.add(recentNum); recentNum = ""; break;
				default:recentNum+=n+"";
			}
		}
		nums.add(recentNum);
		double value = Double.parseDouble(nums.get(0));
		for(int i=1;i<nums.size(); i++)
		{
			String operator = ops.get(i-1);
			double current = Double.parseDouble(nums.get(i));
			switch(operator)
			{
				case "+":  value = value + current; break;
				case "-":  value = value - current; break;
				case "/":  value = value / current; break;
				case "*":  value = value * current; break;
				case "%":  value = value % current; break;
			}
		}
		return value;
	}
	
	public void actionPerformed(ActionEvent ae)
    {		
		String button_pressed = ae.getActionCommand();
		switch(button_pressed)
		{
			case "=" : 	input_value = calculate(input_value)+"";
						input.setText(input_value);
						return;
			case "C" : 	
						input_value="";
						input.setText(input_value);
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