
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Login extends JPanel implements ActionListener {

	// assets

	private JPanel gui;
	public static JTextField txtarea = new JTextField();
	public static JPasswordField txtin = new JPasswordField();
	private JScrollPane scrollpane = new JScrollPane(txtarea);
	static JLabel nameLabel = new JLabel("Username: ", JLabel.RIGHT);
	static JLabel nameLabel2 = new JLabel("Password: ", JLabel.RIGHT);
	static JButton loginButton = new JButton("Login");
	Main main = new Main();

	public static void remove() {
		loginButton.setVisible(false);
		nameLabel.setVisible(false);
		nameLabel2.setVisible(false);
		txtin.setVisible(false);
		txtarea.setVisible(false);
	}
	// constructor
	public void Screen() {

		gui = new JPanel();
		gui.setLayout(null);
		nameLabel.setLocation(140, 85);
		nameLabel.setSize(80, 60);
		nameLabel2.setSize(80, 60);
		nameLabel2.setLocation(140, 135);
		loginButton.setLocation(130, 350);
		loginButton.setSize(200, 40);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				remove();
				main.loadscreen("mainScreen");
			}
		});
		txtarea.setLocation(300, 100);
		txtarea.setSize(200, 30);
		txtin.setLocation(300, 150);
		txtin.setSize(200, 30);

		gui.add(loginButton);
		gui.add(nameLabel);
		gui.add(nameLabel2);
		gui.add(txtarea);
		gui.add(txtin);

	}

	public JComponent getGUI() {
		return gui;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
