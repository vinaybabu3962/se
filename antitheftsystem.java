package hello;
import java.util.*;
import java.awt.*;
import java.awt.GridLayour
import javax.swing.*
public class SimpleEmail extends JFrame{
  private JTextField txtVeh,txtNum;
	 private JTextField txtName;
	 private JLabel lblVeh,lblNum;
	 private JLabel lblName;
	 private JButton btn;
	 String veh,phno,name;
	 SimpleEmail(){
		 txtVeh=new JTextField(15);
		 txtNum=new JTextField(15);
		 txtName=new JTextField(15);
		 lblVeh=new JLabel("Vehicle number:");
		 lblNum=new JLabel("Number");
		 lblName=new JLabel("Name:");
		 btn=new JButton("Sign in");
		 add(lblVeh);add(txtVeh);add(lblNum);add(txtNum);add(lblName);add(txtName);
		 setLayout(new GridLayout(4,2));
		 setSize(500,200);
		 setVisible(true);
		 pack();
		 setTitle("ANTI THEFT SYSYTEM FOR INTRA CITY TRAVELS");
		 btn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 new Frame1();
			 }
		 });
		 txtVeh.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 veh=SimpleEmail.this.txtVeh.getText();
			 }
		 });
		 txtNum.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 phno=SimpleEmail.this.txtNum.getText();
			 }
		 });
		 txtName.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 name=SimpleEmail.this.txtName.getText();
			 }
		 });
	
	}
	 public static void main(String [] args) {
		 new SimpleEmail();
	 }
}
