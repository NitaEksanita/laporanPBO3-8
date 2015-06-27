package cek;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Form2 extends JFrame {
	JLabel lblTest;
	public Form2(){
		Container c=getContentPane();
		setLayout(null);
		c.setLayout(null);
		
		lblTest=new JLabel();
		lblTest.setText("To Form 2");
		lblTest.setBounds(16, 16, 100, 21);
		c.add(lblTest);
		
		setTitle("Form 2");
		setSize(400, 300);
	}
}
