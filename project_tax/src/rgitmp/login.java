package rgitmp;

import prosql.TaxSql;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;




import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class login {
	private JFrame frame;
	private JTextField loginid;
	private JPasswordField password;
	private JButton loginbutton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 401, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TAX CALACULATOR AND MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(10, 11, 423, 37);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 13));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel idinput = new JLabel("Login Id");
		idinput.setForeground(Color.WHITE);
		idinput.setBounds(29, 94, 113, 37);
		idinput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.getContentPane().add(idinput);
		
		loginid = new JTextField();
		loginid.setBounds(108, 95, 171, 37);
		frame.getContentPane().add(loginid);
		loginid.setColumns(10);
		
		JLabel passinput = new JLabel("Password");
		passinput.setForeground(Color.WHITE);
		passinput.setBounds(29, 154, 113, 37);
		passinput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.getContentPane().add(passinput);
		
		password = new JPasswordField();
		password.setBounds(108, 155, 171, 37);
		frame.getContentPane().add(password);
		
		loginbutton = new JButton("Login");
		loginbutton.setBackground(new Color(0, 0, 255));
		loginbutton.setBounds(29, 239, 81, 34);
		loginbutton.setForeground(new Color(253, 245, 230));
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//			
				TaxSql vali = new TaxSql();
				String result = vali.validate(loginid.getText(), password.getText() );
				System.out.println(result);
				if (result == "Allowed") {
					Menu m = new Menu();
					m.menuf(loginid.getText());
				}
//				else {
//					loginfail lf = new loginfail();
//					lf.fail();
//				}
				
			}
			
			
			
			
		});
		frame.getContentPane().add(loginbutton);
		
		JButton resetbutton = new JButton("Reset");
		resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginid.setText("");
				password.setText("");
				
				
			}
		});
		resetbutton.setForeground(new Color(245, 255, 250));
		resetbutton.setBackground(new Color(0, 0, 255));
		resetbutton.setBounds(131, 239, 87, 34);
		frame.getContentPane().add(resetbutton);
		
		JButton signupbutton = new JButton("Sign up");
		signupbutton.setForeground(new Color(240, 248, 255));
		signupbutton.setBackground(new Color(0, 0, 255));
		signupbutton.setBounds(242, 239, 81, 34);
		signupbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup nw = new signup();
			    nw.signuppage();
				
			}
		});
		frame.getContentPane().add(signupbutton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/imgfirst.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rushabh\\git\\Tax_calculator\\project_tax\\Images\\imgfirst.jpg"));
		lblNewLabel_1.setBounds(-1553, -499, 1942, 1015);
		frame.getContentPane().add(lblNewLabel_1);
	}
	public Color getLoginbuttonBackground() {
		return loginbutton.getBackground();
	}
	public void setLoginbuttonBackground(Color background) {
		loginbutton.setBackground(background);
	}
}
