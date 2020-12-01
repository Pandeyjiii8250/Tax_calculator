package prosql;

import java.util.*;


import java.sql.*;
public class TaxSql {
	
	public void newuser(String username, String creatlog, String creatpass, String occup, String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Rishabh");
			PreparedStatement psf = conn.prepareStatement("insert into login values(?,?);");
			psf.setString(1, creatlog);
			psf.setString(2, creatpass);
			int y = psf.executeUpdate();
			PreparedStatement ps = conn.prepareStatement("insert into userinfo values(?,?,?,?);");
			ps.setString(1,username);
			ps.setString(2, occup);
			ps.setString(3, creatlog);
			ps.setString(4, email);
			int x = ps.executeUpdate();
			if ((x > 0) & (y>0)) {
				System.out.println("Values stored!!");
			}
			else {
				System.out.println("Values  not entered!!");
			}
		}catch(Exception e1) {System.out.println(e1);}
	}
	
	public String validate(String loginId, String pass) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection validate = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Rishabh");
			PreparedStatement confirm = validate.prepareStatement("select * from login where logid = ? and pass=?;" );
			confirm.setString(1, loginId);
			confirm.setString(2, pass);
//			System.out.println(confirm);
			ResultSet exe = confirm.executeQuery();
//			System.out.println(exe.next());
			if(exe.next()) {
				return "Allowed";
			}
			else {
				return "Denied";
			}
			
		}
		catch(Exception e2) {System.out.println(e2);
			return "";
		}
	}
	
	public void store(int age, float income, String logid, float deduction, double tax, double educess) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Rishabh");
			PreparedStatement psf = conn.prepareStatement("insert into income values(?,?,?,?,CURRENT_TIMESTAMP,?,?);");
			psf.setInt(1, age);
			psf.setFloat(2, income);
			psf.setString(3, logid);
			psf.setFloat(4, deduction);
			psf.setDouble(5, educess);
			psf.setDouble(6, tax);
			
			int y = psf.executeUpdate();
			if ((y>0)) {
				System.out.println("Values stored!!");
			}
			else {
				System.out.println("Values  not entered!!");
			}
		}catch(Exception e3) {System.out.println(e3);}
		
	}
	
	public void getData(String loginId) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection validate = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Rishabh");
			PreparedStatement confirm = validate.prepareStatement("select * from income where logid = ?" );
			confirm.setString(1, loginId);
			System.out.println(confirm);
			ResultSet rs = confirm.executeQuery();
//			String query = "select * from income where logid = ?;";
//			Statement smt = validate.createStatement();
			
//			ResultSet rs = smt.executeQuery(query);
			while(rs.next()) {
				int ageR = rs.getInt("age");
				float incomeR = rs.getFloat("income");
				String logid = rs.getString("logid");
				float dedu = rs.getFloat("deduction");
				double educessR = rs.getDouble("educess");
				double taxR = rs.getDouble("acttax");
				
				System.out.println(" "+ageR + incomeR + logid + dedu + educessR + taxR);
			}
			
			
		}
		catch(Exception e4) {System.out.println(e4);}
	}

	public void drop(String logid) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection validate = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Rishabh");
			PreparedStatement confirm = validate.prepareStatement("delete from income where logid = ?;" );
			confirm.setString(1, logid);
//			System.out.println(confirm);
			int rs = confirm.executeUpdate();
			if(rs>0) {System.out.println("Happened");}
//			String query = "select * from income where logid = ?;";
//			Statement smt = validate.createStatement();
			
			
		}
		catch(Exception e5) {System.out.println(e5);}
	}
//	public static void main(String args[]) {
//		//creating a login page
//		Scanner input = new Scanner(System.in);
//		TaxSql first = new TaxSql();
//		System.out.printf("******Login Page*********");
//		System.out.printf("\nEnter 1 for login and 2 for signup and 3 for income ");
//		int choice = input.nextInt();
//		
//		if (choice==1) {
//			first.validate("vish123", "985625");
//		}
//		else if (choice==2){
//			first.newuser("vishwas", "vish123", "985625", "freelancer", "vishwas2023@gmail.com" );
//			}
//		else if (choice == 3) {
//			first.store(19, 100000, "vish123", 2550, 560, 480);
//		}
//		else {
//			first.drop("vish123");
//		}
//	input.close();
//	}

}
