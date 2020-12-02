package rgitmp;

import prosql.TaxSql;
import java.awt.EventQueue;
//import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class signup {
	private JFrame frame;
	private JTextField firstname;
	private JTextField occupation;
	private JTextField loginid;
	private JPasswordField password1;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public  void signuppage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 415, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 55, 86, 33);
		frame.getContentPane().add(lblNewLabel);
		
		firstname = new JTextField();
		firstname.setBounds(131, 56, 222, 33);
		frame.getContentPane().add(firstname);
		firstname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sign Up!");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 17));
		lblNewLabel_1.setBounds(148, 11, 92, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Occupation");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 99, 86, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		occupation = new JTextField();
		occupation.setBounds(130, 100, 223, 33);
		frame.getContentPane().add(occupation);
		occupation.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Login Id");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 196, 86, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		loginid = new JTextField();
		loginid.setBounds(131, 194, 222, 33);
		frame.getContentPane().add(loginid);
		loginid.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 239, 72, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		password1 = new JPasswordField();
		password1.setBounds(131, 240, 222, 33);
		frame.getContentPane().add(password1);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 149, 72, 36);
		frame.getContentPane().add(lblNewLabel_6);
		
		email = new JTextField();
		email.setBounds(131, 144, 222, 33);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TaxSql new_user = new TaxSql();
				new_user.newuser(firstname.getText(), loginid.getText(), password1.getText(), occupation.getText(), email.getText());
				login back = new login();
				back.main(null);
				
			}
		});
		btnNewButton.setBounds(148, 309, 136, 39);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Rushabh\\git\\Tax_calculator\\project_tax\\Images\\imgfirst.jpg"));
		lblNewLabel_5.setBounds(-174, -22, 643, 425);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		
		
		
	}
}
