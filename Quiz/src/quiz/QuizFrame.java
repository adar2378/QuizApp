/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.awt.EventQueue;

import javax.rmi.CORBA.Tie;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;


public class QuizFrame {

	private JFrame frame;
	 static int points = 0;
//	Random RnGen = new Random();
//	int random = RnGen.nextInt(10)+1;
	static int Qn = 0;
	public static int rightAnswer;
	/**
	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					QuizFrame window = new QuizFrame();
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public QuizFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// This is ajaira----------
		//final QuestionSets Que = new QuestionSets(Qn);
		
		
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(400, 200, 504, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setForeground(Color.WHITE);
		lblQuestion.setFont(new Font("Modern No. 20", Font.PLAIN, 17));
		lblQuestion.setBounds(10, 37, 89, 25);
		frame.getContentPane().add(lblQuestion);
		
		final JTextArea QuestionArea = new JTextArea();
		QuestionArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		QuestionArea.setLineWrap(true);
               // HintsArea.setLineWrap(true); 
                QuestionArea.setWrapStyleWord(true);
		QuestionArea.setBackground(new Color(102, 255, 153));
		QuestionArea.setEditable(false);
		QuestionArea.setBounds(10, 75, 478, 99);
		frame.getContentPane().add(QuestionArea);
		
		
		JLabel lblPoints = new JLabel("Points:");
		lblPoints.setForeground(Color.WHITE);
		lblPoints.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPoints.setBounds(384, 8, 56, 14);
		frame.getContentPane().add(lblPoints);
		
		final JTextArea PointsArea = new JTextArea();
		PointsArea.setWrapStyleWord(true);
		PointsArea.setFont(new Font("Tahoma", Font.BOLD, 15));
		PointsArea.setEditable(false);
		PointsArea.setBounds(450, 4, 38, 22);
		PointsArea.setText(""+"0"+points);
		frame.getContentPane().add(PointsArea);
		
		
		final JLabel timeCount = new JLabel("");
		timeCount.setForeground(Color.WHITE);
		timeCount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		timeCount.setBounds(53, 12, 46, 14);
		
		final JRadioButton Button1 = new JRadioButton("New radio button");
		Button1.setFont(new Font("Nyala", Font.PLAIN, 17));
		final JRadioButton Button2 = new JRadioButton("New radio button");
		Button2.setFont(new Font("Nyala", Font.PLAIN, 17));
		final JRadioButton Button3 = new JRadioButton("New radio button");
		Button3.setFont(new Font("Nyala", Font.PLAIN, 17));
		final JRadioButton Button4 = new JRadioButton("New radio button");
		Button4.setFont(new Font("Nyala", Font.PLAIN, 17));
		// Time CountDown-------------
    
		final TimeCounter t = new TimeCounter(timeCount);
//		t.setButtons_Stuffs(Que, Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea);
		frame.getContentPane().add(timeCount);
		//--------------------------------
		
		QuestionSets []Qs=new QuestionSets[7];
                Qs[Qn]=new QuestionSets(Qn);
		setEverything(Qs[0], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
//		if(t.getInterval() == 0){
//			JOptionPane.showMessageDialog(null, "Time up!");
//			TimeCounter.interval = 16;
//			Qn++;
//			setEverything(new QuestionSets(Qn), Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t);
//			JOptionPane.showMessageDialog(null, "QN:"+Qn);
//		}
		
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rightAnswer==1){
                                       // TimeCounter.timer.cancel();
                                        //TimeCounter.StopTime();
					JOptionPane.showMessageDialog(null, "Right Answer!!!");
					points=points+5;
					Qn++;
                                        if(Qn==6){
                                            frame.dispose();
                                            EndFrame2 end=new EndFrame2();}
                                        Qs[Qn]=new QuestionSets(Qn);
                                        
					setEverything(Qs[Qn], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
				}
				else{
                                    //TimeCounter.StopTime();
					JOptionPane.showMessageDialog(null, "Wrong Answer!\nRight Answer is:"+(Qs[Qn].getRightAns()));
				Qn++;
                                if(Qn==6){ frame.dispose();
                                            EndFrame2 end=new EndFrame2();}
                                Qs[Qn]=new QuestionSets(Qn);
				setEverything(Qs[Qn], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
				}
			}
		});
		Button1.setBackground(new Color(153, 153, 0));
		Button1.setBounds(60, 197, 380, 25);
		frame.getContentPane().add(Button1);
		
		
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rightAnswer==2){
					JOptionPane.showMessageDialog(null, "Right Answer!!!");
					points=points+5;
					Qn++;
                                        if(Qn==6){ frame.dispose();
                                            EndFrame2 end=new EndFrame2();}
                                        Qs[Qn]=new QuestionSets(Qn);
					setEverything(Qs[Qn], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong Answer!\nRight Answer is:"+(Qs[Qn].getRightAns()));
				Qn++;
                                if(Qn==6){ frame.dispose();
                                            EndFrame2 end=new EndFrame2();}
                                Qs[Qn]=new QuestionSets(Qn);
				setEverything(Qs[Qn], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
				}
				
			}
		});
		Button2.setBackground(new Color(51, 153, 204));
		Button2.setBounds(60, 237, 380, 25);
		frame.getContentPane().add(Button2);
		
		
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rightAnswer==3){
					JOptionPane.showMessageDialog(null, "Right Answer!!!");
					points=points+5;
					Qn++;
                                        if(Qn==6){ frame.dispose();
                                            EndFrame2 end=new EndFrame2();}
                                        Qs[Qn]=new QuestionSets(Qn);
					setEverything(Qs[Qn], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong Answer!\nRight Answer is:"+(Qs[Qn].getRightAns()));
				Qn++;
                                if(Qn==6){ frame.dispose();
                                            EndFrame2 end=new EndFrame2();}
                                Qs[Qn]=new QuestionSets(Qn);
				setEverything(Qs[Qn], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
				}
				
			}
		});
		Button3.setBackground(new Color(0, 255, 51));
		Button3.setBounds(60, 276, 380, 25);
		frame.getContentPane().add(Button3);
		
		
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rightAnswer==4){
					JOptionPane.showMessageDialog(null, "Right Answer!!!");
					points=points+5;
					Qn++;
                                        if(Qn==6){ frame.dispose();
                                            EndFrame2 end=new EndFrame2();}
                                        Qs[Qn]=new QuestionSets(Qn);
					setEverything(Qs[Qn], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong Answer!\nRight Answer is:"+(Qs[Qn].getRightAns()));
					Qn++;
                                        if(Qn==6){ frame.dispose();
                                            EndFrame2 end=new EndFrame2();}
                                        Qs[Qn]=new QuestionSets(Qn);
				setEverything(Qs[Qn], Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
				}
				
			}
		});
		
		Button4.setBounds(60, 315, 380, 25);
		Button4.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(Button4);
		
		JButton btnHints = new JButton("Hints?");
		btnHints.setBounds(10, 381, 89, 23);
		frame.getContentPane().add(btnHints);
		
		JTextArea HintsArea = new JTextArea();
                HintsArea.setLineWrap(true); 
                HintsArea.setWrapStyleWord(true);
		HintsArea.setBounds(109, 366, 379, 56);
		frame.getContentPane().add(HintsArea);
		
               btnHints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(rightAnswer==4){
					HintsArea.setText(Qs[Qn].getHint(QuestionSets.QuestionNo));
					points=points-2;
					//Qn++;
				//	setEverything(new QuestionSets(Qn), Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
					
				//}
				//else{
				//	JOptionPane.showMessageDialog(null, "Wrong Answer!"+(new QuestionSets(Qn).getRightAns()));
				//	Qn++;
				//setEverything(new QuestionSets(Qn), Button1, Button2, Button3, Button4, QuestionArea,points, PointsArea,t,rightAnswer);
				//}
				
			}
		});
                
		JLabel lblTime = new JLabel("Time:");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblTime);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ivan Kadery\\Desktop\\SD.jpg"));
		lblNewLabel.setBounds(0, 0, 498, 433);
		frame.getContentPane().add(lblNewLabel);
		
		
	
	}
	
	
	
	public static int getRightAnswer(QuestionSets q){
		return q.RightAns();
	}
	
	public static void setEverything(QuestionSets q, JRadioButton button1, JRadioButton button2, JRadioButton button3, JRadioButton button4, JTextArea questArea, int points ,JTextArea pointArea, TimeCounter t, int rO){
		questArea.setText(q.getQuestion());
               
		button1.setText(q.getOption1());
		button1.setSelected(false);
		button2.setText(q.getOption2());
		button2.setSelected(false);
		button3.setText(q.getOption3());
		button3.setSelected(false);
		button4.setText(q.getOption4());
		button4.setSelected(false);
		pointArea.setText(""+points);
		rightAnswer = getRightAnswer(q);
                
		t.setButtons_Stuffs(q, button1, button2, button3, button4, questArea,points, pointArea,getRightAnswer(q));
		
		}
        
}
