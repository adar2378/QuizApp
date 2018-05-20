/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EndFrame2 {

	private JFrame frame;
	QuizFrame n;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EndFrame2 window = new EndFrame2();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public EndFrame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(400, 200, 659, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYouDid = new JLabel("YOU did "+HowGood());
		lblYouDid.setFont(new Font("MV Boli", Font.PLAIN, 16));
		lblYouDid.setBounds(10, 86, 149, 41);
		frame.getContentPane().add(lblYouDid);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(setEmo());
		label_1.setBounds(157, 86, 36, 32);
		frame.getContentPane().add(label_1);
		
		JLabel lblSeeYouNext = new JLabel("See you next time..");
		lblSeeYouNext.setFont(new Font("Segoe WP Black", Font.PLAIN, 17));
		lblSeeYouNext.setBounds(10, 196, 177, 72);
		frame.getContentPane().add(lblSeeYouNext);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnExit.setIcon(null);
		btnExit.setBounds(10, 279, 72, 32);
		frame.getContentPane().add(btnExit);
		
		JLabel lblPoints = new JLabel(""+QuizFrame.points+" Points");
		lblPoints.setFont(new Font("Script MT Bold", Font.PLAIN, 30));
		lblPoints.setBounds(27, 30, 132, 57);
		frame.getContentPane().add(lblPoints);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Ivan Kadery\\Desktop\\QuizPro\\Project\\EndScreen\\last.jpg"));
		label.setBounds(0, 0, 640, 360);
		frame.getContentPane().add(label);
	}
	private String HowGood(){
		if(QuizFrame.points < 10){
			return "Poor";
		}
		else if(QuizFrame.points >=10 && QuizFrame.points < 20 ){
			return "Good";
		}
		else{
			return "Excellent";
		}
	}
	
	private Icon setEmo(){
		
		if(QuizFrame.points < 10){
			return new ImageIcon("C:\\Users\\Ivan Kadery\\Desktop\\QuizPro\\Project\\EndScreen\\down.png");
		}
		else if(QuizFrame.points >=10 && QuizFrame.points < 20 ){
			return new ImageIcon("C:\\Users\\Ivan Kadery\\Desktop\\QuizPro\\Project\\EndScreen\\good.jpg");
		}
		else{
			return new ImageIcon("C:\\Users\\Ivan Kadery\\Desktop\\QuizPro\\Project\\EndScreen\\awesome.png");
		}
		
	}
}
