package com.practicals;

import java.sql.*;

public class User {
	private String url;
	private String user;
	private String pwd;
	private Connection conn;
	PreparedStatement pstmt;
	
	User(){
	    this.url="jdbc:mysql://localhost:3306/test2";
	    this.user = "yogesh";
	    this.pwd = "yogesh123";
	 }
	
	public boolean auth(String user,String pwd){
		   String sql = "SELECT * FROM login WHERE username=? AND pwd=?;";

		   try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        conn = DriverManager.getConnection(this.url,this.user,this.pwd);

		        pstmt = conn.prepareCall(sql);
		        pstmt.setString(1,user);
		        pstmt.setString(2,pwd);
		        ResultSet rs = pstmt.executeQuery();

		        if(rs.next())
		          return true;
		        else
		         return false;
		       }catch(Exception e){
		         e.printStackTrace();
		   }
		   finally{
		     //this.close();
		   }
		  return false;
		}

		 public boolean add(String user,String pwd,String email,String contact){

		   String sql = "INSERT INTO login(username, pwd, email, contact) VALUES (?,?,?,?)";
		   try{

		     Class.forName("com.mysql.cj.jdbc.Driver");
		     conn = DriverManager.getConnection(this.url,this.user,this.pwd);

		     pstmt = conn.prepareCall(sql);
		     pstmt.setString(1,user);
		     pstmt.setString(2,pwd);
		     pstmt.setString(3,email);
		     pstmt.setString(4,contact);
		     boolean result = pstmt.execute();
		     System.out.println("Result " + result);

		     if(!result)
		        return true;
		     else
		       return false;

		   }catch(Exception e){
		     e.printStackTrace();
		   }
		   finally{
		     //this.close();
		   }
		   return false;
		 }

		 public boolean addExam(String enroll,int subject1,int subject2,int subject3){

		   String sql = "INSERT INTO exam(enroll, subject1, subject2, subject3) VALUES (?,?,?,?)";

		   try {
		     Class.forName("com.mysql.cj.jdbc.Driver");
		     conn = DriverManager.getConnection(this.url,this.user,this.pwd);

		     pstmt = conn.prepareCall(sql);
		     pstmt.setString(1,enroll);
		     pstmt.setInt(2,subject1);
		     pstmt.setInt(3,subject2);
		     pstmt.setInt(4,subject3);
		     boolean result = pstmt.execute();

		     if(!result)
		       return true;
		     else
		       return false;

		   } catch(Exception e) {
		     e.printStackTrace();
		   }
		   finally{
		    // this.close();
		   }
		   return false;
		 }

		 private void close(){
		   try {
		     pstmt.close();
		     conn.close();
		   } catch(Exception e) {
		     e.printStackTrace();
		   }
		 }
}
