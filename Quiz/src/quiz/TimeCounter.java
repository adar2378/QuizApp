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
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class TimeCounter<Jlabel> {
	Timer timer = new Timer();
	int delay = 1000;
	int period = 1000;
	static int interval = 20;
	JRadioButton A,B,C,D;
	QuestionSets q;
	int p;
	JTextArea QA,PA;
	final JLabel timeLabel;
	static int Ra;
	
	TimeCounter(final JLabel lbl){
	timeLabel = lbl;
	timer.scheduleAtFixedRate(new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			timeLabel.setText(""+TextInterval());
		}
	}, delay, period);
	
	
	}
	
	public void setButtons_Stuffs(QuestionSets Q, JRadioButton a, JRadioButton b, JRadioButton c, JRadioButton d, JTextArea questArea, int points ,JTextArea pointArea, int rightA){
		q = Q;
		A = a;
		B = b;
		C = c;
		D = d;
		QA = questArea;
		p = points;
		PA = pointArea;
		interval = 20;
		Ra = rightA;
	}
	
	public int TextInterval(){
		if(interval == 0){
//			int n =(new Random(2)).nextInt()+1;
			//QuizFrame.hintClicked = 0;
			JOptionPane.showMessageDialog(null, "Time up!!!");
			QuizFrame.setEverything(new QuestionSets(2), A, B, C, D, QA,p, PA,new TimeCounter<Object>(timeLabel),Ra);
			timer.cancel();
			interval = 20;}
		return --interval;
		
	}
	
	public int getInterval(){
		return interval;
	}
}
