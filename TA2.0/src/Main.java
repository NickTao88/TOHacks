import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Main extends JPanel{

	static JFrame frame = new JFrame();
	
	static mainScreen mainScreen = new mainScreen();
	static Login login = new Login();
	
	public static void main(String[] args) {
		
		mainScreen.Screen();
		login.Screen(); 
		
		
		frame.setTitle("learning asistant");
		frame.setSize(800, 1000);
		frame.setLocationRelativeTo(null); // Center frame
		frame.setVisible(true); // Show frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // End program when JFrame is close
		frame.setResizable(false); // Don't allow user to resize frame
		frame.add(login.getGUI()); // Show nameScreen
	}
	
	public void loadscreen(String name) {	//for loading different frames
		if(name.equals("mainScreen")) {
			frame.add(mainScreen.getGUI());
		}
		frame.revalidate();
		
	}
}
