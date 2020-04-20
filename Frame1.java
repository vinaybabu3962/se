package hello;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;

public class Frame1 extends JFrame {
	private JLabel lbltxt;
	private JButton btn1;
	Frame1(){
		setSize(500,500);
		btn1=new JButton("alrm");
		add(btn1);
		setVisible(true);
		setLayout(new FlowLayout());
		btn1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 new Frame1();
			 }
		 });
	}

}
