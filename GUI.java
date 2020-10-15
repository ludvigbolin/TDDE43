package lab1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JFrame {

	
	static JTextField namn;
	static JTextField email;
	static JTextField lasen;
	static JLabel namnLabel;
	static JLabel emailLabel;
	static JLabel lasenLabel;
	static JLabel alderLabel;
	static JFrame j = new JFrame("lab 1");
	static JSlider alder;
	static int startAlder = 0;
	static int slutAlder = 100;
	static JPanel header;
	static JLabel headerNamn;

	GUI() {
		j.getContentPane().setLayout(new FlowLayout());
		j.setSize(400, 800);
		j.setLayout(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setJMenuBar(header);	
	}

	public static void main(String[] args) {
		new GUI();
		textLabel();
		textField();
		menu();
		
		j.setVisible(true);
		
	}
	
	public static void textLabel() {
		namnLabel = new JLabel();
		namnLabel.setText("Namn: ");
		namnLabel.setBounds(10, 70, 100, 50);
		j.add(namnLabel);
		
		emailLabel = new JLabel();
		emailLabel.setText("Email: ");
		emailLabel.setBounds(10, 110, 100, 90);
		j.add(emailLabel);
		
		lasenLabel = new JLabel();
		lasenLabel.setText("Lösenord: ");
		lasenLabel.setBounds(10,150,100,130);
		j.add(lasenLabel);
		
		alderLabel  =  new JLabel();
		alderLabel.setText("Ålder: ");
		alderLabel.setBounds(10,230,100,50);
		j.add(alderLabel);
	}
	
	public static void textField() {
		namn = new JTextField("", 15);
		namn.setBounds(101,70,200,50); //x,y,(x+s),(y+t)
		j.getContentPane().add(namn);
		
		email = new JTextField("", 15);
		email.setBounds(101,130,200,50);
		j.getContentPane().add(email);
		
		lasen = new JPasswordField("", 15);
		lasen.setBounds(101,190,200,50); 
		j.getContentPane().add(lasen);
		
		alder = new JSlider(JSlider.HORIZONTAL, startAlder, slutAlder, startAlder);
		alder.setBounds(101,230, 200, 50);
		j.getContentPane().add(alder);
	}
	
	public static void menu() {	
		headerNamn = new JLabel("Laboration 1.2");
		headerNamn.setBounds(25, 10, 200, 50);
		headerNamn.setFont(new Font("monospaced", Font.BOLD, 20));
		j.add(headerNamn);
		
		header = new JPanel();
		header.setSize(500,60);
		header.setBackground(Color.decode("#72898C"));
		j.add(header);
		
		
		
	}
}
