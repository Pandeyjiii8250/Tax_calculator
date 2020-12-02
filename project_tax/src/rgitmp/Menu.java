package rgitmp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
import prosql.TaxSql;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Menu {
	private JFrame frame;
	private static String loginId;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public  void menuf(String loginid) {
		loginId = loginid;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 401, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Calculate\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RgitGui g = new RgitGui();
				g.gui(loginId);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(120, 98, 120, 30);
		frame.getContentPane().add(btnNewButton);
		

		
		JButton btnNewButton_1 = new JButton("Retrive ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg5) {
				
				display disp = new display();
				disp.disp(loginId);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setBounds(120, 159, 120, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg4) {
				
				System.out.println("Hellow");
				TaxSql g = new TaxSql();
				g.drop(loginId);
				System.out.println("Hellow");
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(120, 221, 120, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Tax Calculator and Management System\r\n");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 15));
		lblNewLabel.setBounds(38, 11, 304, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Log Out\r\n\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login l = new login();
				l.main(null);
				
				
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.BLUE);
		btnNewButton_3.setBounds(120, 276, 120, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rushabh\\git\\Tax_calculator\\project_tax\\Images\\imgfirst.jpg"));
		lblNewLabel_1.setBounds(-894, -288, 1490, 696);
		frame.getContentPane().add(lblNewLabel_1);
	}


}
