package cek;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Form1 extends JFrame {
	JButton btnTest;
	public Form1(){
		Container c=getContentPane();
		c.setLayout(null);
		
		btnTest=new JButton();
		btnTest.setText("To Form 2");
		btnTest.setBounds(16, 16, 100, 21);
		c.add(btnTest);
		ButtonHandler h=new ButtonHandler();
		btnTest.addActionListener(h);
		
		setTitle("Form 1");
		setSize(300, 200);
		setVisible(true);
	}
	
	public class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==btnTest){
				//JOptionPane.showConfirmDialog(rootPane, "Message Alert", "Title Alert", JOptionPane.ERROR_MESSAGE);
				Form2 frm2=new Form2();
				frm2.setVisible(true);
				frm2.setLocationRelativeTo(null);
				frm2.lblTest.setText("Coba lah Form 2");
			}
		}
		
	}
}