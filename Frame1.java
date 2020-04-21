package hello;
import java.awt.FlowLayout;
import java.awt.event.*
import javax.swing.*;
public class Frame1 extends JFrame {
	private JLabel lbltxt;
	private JButton btn1;
	static String filePath; 
	Clip clip;
	Long currentFrame;
	Frame1(){
		setSize(500,500);
		btn1=new JButton("alrm");
		add(btn1);
		setVisible(true);
		setLayout(new FlowLayout());
		btn1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 try {
				        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\vinay\\Music\\cello.wav").getAbsoluteFile());
				        Clip clip = AudioSystem.getClip();
				        clip.open(audioInputStream);
				        clip.start();
				    } catch(Exception ex) {
				        System.out.println("Error with playing sound.");
				        ex.printStackTrace();
				    }
			 }
		 });
	}

}
