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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.UIManager;

import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StartFrame {

	private JFrame frmMovieMaster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame window = new StartFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMovieMaster = new JFrame();
		frmMovieMaster.setVisible(true);
		frmMovieMaster.setResizable(false);
		frmMovieMaster.setForeground(Color.WHITE);
//		frmMovieMaster.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\KVADPhoto+\\icon.jpg"));
		frmMovieMaster.setTitle("Movie Master!");
		frmMovieMaster.setBackground(Color.BLACK);
		frmMovieMaster.setBounds(400, 200, 496, 442);
		frmMovieMaster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMovieMaster.getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frmMovieMaster.setVisible(false);
					
					QuizFrame window = new QuizFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Ivan Kadery\\Desktop\\QuizPro\\Project\\StartScreen\\Start.jpg"));
		btnNewButton.setBounds(117, 278, 278, 63);
		frmMovieMaster.getContentPane().add(btnNewButton);
		
		JButton howToPlayBtn = new JButton("");
		howToPlayBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Player will have to answer 6 questions in one play time.\nFor each questions there will be four options to choose.\nOr there is a hints button, if the player needs some hints s/he can get it by clicking this button.\nBut using that button will cost the player 2 points."+
"\nAnd there is a time limitation of 20 seconds for each question."+ 
"\nAnd for every right answer the player will get 5 points!");
			}
		});
		howToPlayBtn.setIcon(new ImageIcon("C:\\Users\\Ivan Kadery\\Desktop\\QuizPro\\Project\\StartScreen\\Rules.jpg"));
		howToPlayBtn.setBounds(184, 365, 146, 34);
		frmMovieMaster.getContentPane().add(howToPlayBtn);
		
		JLabel lblMovieMaster = new JLabel("Movie Master!");
		lblMovieMaster.setForeground(Color.RED);
		lblMovieMaster.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
		lblMovieMaster.setBounds(117, 39, 278, 81);
		frmMovieMaster.getContentPane().add(lblMovieMaster);
		
		JLabel lblNewLabel = new JLabel("TEST YOURSELF !!!");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNewLabel.setBounds(306, 93, 174, 34);
		frmMovieMaster.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.BLUE);
		label.setBackground(Color.BLACK);
		label.setIcon(new ImageIcon("C:\\Users\\Ivan Kadery\\Desktop\\QuizPro\\Project\\StartScreen\\Background.jpg"));
		label.setBounds(0, 0, 490, 414);
		frmMovieMaster.getContentPane().add(label);
	}
}
