import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.*;
import java.util.*;

public class mainScreen extends JPanel implements ActionListener {
	
	//assets
	static 
	private JPanel gui;
	private static int ydisplacement = 30;
	private JButton add = new JButton();
	private JButton addassess = new JButton("Add Assessment");
	public static ArrayList<JTextArea> textareas = new ArrayList<JTextArea>();
	public ArrayList<JTextArea> desiredmarks = new ArrayList<JTextArea>();
	public ArrayList<course> courses = new ArrayList<course>();
	public static ArrayList<JTextArea> progresses = new ArrayList<JTextArea>();
	public static Font f = new Font("Helvetica", Font.PLAIN, 18);
	public static JTextArea bar = new JTextArea();
	public static JTextArea temp = new JTextArea();
	
	public void addassessment(assessment a) {
		
		courses.get(0).addassessment(a);
		temp.setText("  Current mark: " +Double.toString(courses.get(courses.size()-1).currentMark) +"%" );
		bar.setSize((int)((((courses.get(courses.size()-1).percentagecomp)/100)*720)),30);
		
		temp.repaint();
		bar.repaint();
	}
	public void addcourse(course c) {
		courses.add(c);
		progresses.add(new JTextArea());
		
		textareas.add(new JTextArea());
		JTextArea temp = textareas.get(textareas.size()-1);
		temp.setText("  Current mark: " +Double.toString(courses.get(courses.size()-1).currentMark) +"%" );
		temp.setLocation(150,100+ydisplacement);
		temp.setMargin( new Insets(3,3,5,5));
		temp.setSize(300,30);
		temp.setEditable(false);
		temp.setFont(f);
		
		JTextArea barback = new JTextArea();
		barback.setEditable(false);
		barback.setFont(f);
		barback.setLocation(40,140+ydisplacement);
		barback.setSize(720,30);
		barback.setText(" ");
		
		JTextArea bar = progresses.get(progresses.size()-1);
		bar.setLocation(40,140+ydisplacement);
		bar.setBackground(Color.BLUE);
		System.out.println(courses.get(courses.size()-1).percentagecomp);
		bar.setSize((int)((((courses.get(courses.size()-1).percentagecomp)/100)*720)),30);
		
		desiredmarks.add(new JTextArea());
		JTextArea desmark = desiredmarks.get(desiredmarks.size()-1);
		desmark.setLocation(460,100+ydisplacement);
		desmark.setFont(f);
		desmark.setSize(300,30);
		desmark.setText("  Desired mark: " +(Double.toString(c.desiredMark)) +"%" );
		desmark.setMargin( new Insets(3,3,5,5));
		desmark.setEditable(false);
		
		JTextArea number = new JTextArea();
		number.setLocation(40,100+ydisplacement);
		number.setText(c.courseCode);
		number.setSize(100,30);
		number.setFont(f);
		number.setMargin( new Insets(3,3,5,5));
		number.setEditable(false);
		
		JTextArea name = new JTextArea();
		name.setLocation(40,60+ydisplacement);
		name.setText("  "+c.nameOfCourse);
		name.setSize(300,30);
		name.setFont(f);
		name.setMargin( new Insets(3,3,5,5));
		name.setEditable(false);
		
		bar.setVisible(true);
		barback.setVisible(true);
		name.setOpaque(true);
		bar.setOpaque(true);
		barback.setOpaque(true);
		desmark.setOpaque(true);
		number.setOpaque(true);
		temp.setOpaque(true);
		
		addassess.setLocation(520,90);
		addassess.setSize(240,30);
		addassess.setFont(f);
		addassess.setBackground(Color.orange);
		addassess.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame assessframe = new JFrame();
				new assessframe();
				
			}
			
		});
		gui.add(addassess);
		gui.add(bar);
		gui.add(barback);
		gui.add(name);
		gui.add(desmark);
		gui.add(number);
		gui.add(temp);
		gui.repaint();
		barback.repaint();
		bar.repaint();
		ydisplacement += 200;
	}
	
	public void Screen() {
		gui = new JPanel();
		gui.setLayout(null);
		
		//setting attributes
		
		add.setLocation(40,20);
		add.setSize(200,40);
		add.setText("Add Course");
		add.setFont(f);
		add.setBackground(Color.orange);
		add.addActionListener(addnewcourse);
		// adding items to frame
		
		gui.add(add);
	}
	ActionListener addnewcourse = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFrame coursefillout = new JFrame();
			new coursefillout();
			
		}
	};
	public JComponent getGUI() {
		
		
		
		return gui;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}