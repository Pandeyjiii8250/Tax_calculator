package rgitmp;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

import net.proteanit.sql.DbUtils;

import java.awt.SystemColor;

public class display {
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					display window = new display();
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
	public display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @return 
	 */
	
	
		
	
	
		private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 587, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 35, 571, 312);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Retrieve");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login le = new login();
				try {
		            Class.forName("com.mysql.jdbc.Driver");
						
						Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Rishabh");
						Statement se= conn1.createStatement();
						String s="Select * from income;"; 
						
						ResultSet rs =  se.executeQuery(s);
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
						
					}catch(Exception e2) {
						System.out.println(e2);
					}
			}
		});
		btnNewButton.setBounds(198, 379, 167, 49);
		frame.getContentPane().add(btnNewButton);
	}


}