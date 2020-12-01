package rgitmp;

import taxCal.userTax;

import java.awt.EventQueue;

import prosql.TaxSql;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class RgitGui {
	private JFrame frame;
	private JTextField Age;
	private JTextField Netsalary;
	private JTextField Ded2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	//omkar edition
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_3;

	private static int age = 0;
	private static int netsalary = 0;
	private static int ded2 = 0;
	private static double[] op = {0,0,0};
	private static String loginId;
	/*
	 * Launch the application.
	 */
	
	//omkar edition
	public  void gui(String loginid) {
		loginId = loginid;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RgitGui window = new RgitGui();
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
	public RgitGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 425, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
//		int age = 0;
		Age = new JTextField();
//		try {
//			age = Integer.parseInt(Age.getText());
//			} catch (NumberFormatException nfe) {
//				nfe.printStackTrace();
//		}
		Age.setBounds(207, 46, 122, 20);
		frame.getContentPane().add(Age);
		Age.setColumns(10);
		
		JLabel tf1 = new JLabel("Enter Age");
		tf1.setForeground(Color.WHITE);
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tf1.setBounds(37, 49, 122, 14);
		frame.getContentPane().add(tf1);
		
		JLabel tf2 = new JLabel("Income");
		tf2.setForeground(Color.WHITE);
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tf2.setBounds(37, 89, 66, 14);
		frame.getContentPane().add(tf2);
		
		
//		int netsalary = 0;
		Netsalary = new JTextField();
//		try {
//			netsalary = Integer.parseInt(Netsalary.getText());
//			} catch (NumberFormatException nfe) {
//				nfe.printStackTrace();
//		}
		Netsalary.setBounds(207, 86, 122, 20);
		frame.getContentPane().add(Netsalary);
		Netsalary.setColumns(10);
		
		JLabel tf3 = new JLabel("Deductions");
		tf3.setForeground(Color.WHITE);
		tf3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tf3.setBounds(37, 135, 109, 14);
		frame.getContentPane().add(tf3);
		
//		int ded2 = 0;
		Ded2 = new JTextField();
//		try {
//			ded2 = Integer.parseInt(Ded2.getText());
//			} catch (NumberFormatException nfe) {
//				nfe.printStackTrace();
//		}
		Ded2.setBounds(207, 132, 122, 20);
		frame.getContentPane().add(Ded2);
		Ded2.setColumns(10);
	
		
		JLabel taxable_output = new JLabel("");
		taxable_output.setForeground(Color.WHITE);
		taxable_output.setBounds(243, 247, 86, 36);
		frame.getContentPane().add(taxable_output);
		
		JLabel cess_output = new JLabel("");
		cess_output.setForeground(Color.WHITE);
		cess_output.setBounds(243, 336, 86, 36);
		frame.getContentPane().add(cess_output);
		
		JLabel tax_output = new JLabel("");
		tax_output.setForeground(Color.WHITE);
		tax_output.setBounds(243, 289, 86, 36);
		frame.getContentPane().add(tax_output);
		
		
//		String stringop = "nothing";
//		double op[] = {0,0,0};
//		Boolean[] arr = {false};
		
		
		
		
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				age = Integer.parseInt(Age.getText());
				netsalary = Integer.parseInt(Netsalary.getText());
				ded2 = Integer.parseInt(Ded2.getText());
				userTax tax = new userTax();
				op = tax.tax(age,netsalary,ded2);

				taxable_output.setText(" "+op[0]);
				tax_output.setText(" "+op[1]);
				cess_output.setText(" "+op[2]);

				
			}
		});
		btnNewButton.setBounds(141, 185, 130, 36);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("Taxable income");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(37, 244, 139, 36);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Tax");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(37, 291, 109, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Educational CESS");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(37, 336, 159, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		//store button
		btnNewButton_1 = new JButton("Store\r\n");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TaxSql storing = new TaxSql();
				storing.store(age, netsalary, loginId, ded2, op[1], op[2]);
			}
		});
		btnNewButton_1.setBounds(47, 378, 139, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_4 = new JLabel("Tax Calculator and Management System\r\n");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 13));
		lblNewLabel_4.setBounds(37, 11, 319, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnNewButton_2 = new JButton("Menu\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu me = new Menu();
				me.menuf(loginId);
				
			}
		});
		btnNewButton_2.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(207, 377, 130, 36);
		frame.getContentPane().add(btnNewButton_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\omkar.omkar-PC\\Desktop\\bg.jpg"));
		lblNewLabel_3.setBounds(-1689, -25, 2174, 745);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
	}
}



	




