/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

/**
 *
 * @author Ivan Kadery
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;


public class EndFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndFrame window = new EndFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EndFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 448);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPlayAgain = new JButton("PLAY AGAIN");
		btnPlayAgain.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnPlayAgain.setBackground(new Color(102, 51, 204));
		btnPlayAgain.setForeground(Color.WHITE);
		btnPlayAgain.setBounds(124, 375, 154, 23);
		frame.getContentPane().add(btnPlayAgain);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon("C:\\Users\\Eight Eyed\\Pictures\\KVADPhoto+\\adadadar.jpg"));
		label.setBounds(0, 0, 403, 416);
		frame.getContentPane().add(label);
	}
}

