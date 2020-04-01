package es.palma.demodesktopapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormularioLogin extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton boton1;
	public FormularioLogin() {
		super("Titol");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		add(panel);
		placeComponents(panel);
	}
	
	private void placeComponents(JPanel panel) {
		panel.setLayout(null);
		
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);
		
		
		boton1 = new JButton("Login");
		boton1.setBounds(10,80,80,25);
		panel.add(boton1);
		boton1.addActionListener(this);
		
		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 80, 80, 25);
		panel.add(registerButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			System.exit(0);
		}
	}

}
