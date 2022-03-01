package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.FlowLayout;

public class Calculator implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	
	Calculator()
	{
		f = new JFrame("MyCalculator");
		f.setSize(300,300);
		
		l1 = new JLabel("Input1");
		f.add(l1);
		
		t1 = new JTextField(20);
		f.add(t1);
		
		l2 = new JLabel("Input2");
		f.add(l2);
		
		t2 = new JTextField(20);
		f.add(t2);
		
		l3 = new JLabel("Output");
		f.add(l3);
		
		t3 = new JTextField(20);
		f.add(t3);
		
		b1 = new JButton("ADD");
		f.add(b1);
		
		b2 = new JButton("SUB");
		f.add(b2);
		
		b3 = new JButton("MUL");
		f.add(b3);
		
		b4 = new JButton("DIV");
		f.add(b4);
		
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);	
	}
	
	public static void main(String[] args)
	{
		new Calculator();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			double a = Double.parseDouble(t1.getText());
			double b = Double.parseDouble(t2.getText());
			double c = a+b;
			t3.setText(Double.toString(c));
		}
		else if(e.getSource() == b2)
		{
			double a = Double.parseDouble(t1.getText());
			double b = Double.parseDouble(t2.getText());
			double c = a-b;
			t3.setText(Double.toString(c));
		}
		else if(e.getSource() == b3)
		{
			double a = Double.parseDouble(t1.getText());
			double b = Double.parseDouble(t2.getText());
			double c = a*b;
			t3.setText(Double.toString(c));
		}
		else if(e.getSource() == b4)
		{
			double a = Double.parseDouble(t1.getText());
			double b = Double.parseDouble(t2.getText());
			double c = a/b;
			t3.setText(Double.toString(c));
		}
		
	}	
}

