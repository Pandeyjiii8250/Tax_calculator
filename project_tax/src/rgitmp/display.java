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
	private static String loginId;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public  void disp(String logid) {
		loginId = logid;
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
		table.setBackground(new Color(102, 205, 170));
		scrollPane.setViewportView(table);
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
				
				Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Rishabh");
//				Statement se= conn1.createStatement();
				PreparedStatement confirm = conn1.prepareStatement("select * from income where logid = ?" );
				confirm.setString(1, loginId);
//				System.out.println(confirm);
				ResultSet rs = confirm.executeQuery();
//				ResultSet rs =  se.executeQuery(s);
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rushabh\\git\\Tax_calculator\\project_tax\\Images\\imgfirst.jpg"));
				lblNewLabel.setBounds(0, 0, 588, 467);
				frame.getContentPane().add(lblNewLabel);
				
				
			}catch(Exception e2) {
				System.out.println(e2);
			}
		
		}


}
