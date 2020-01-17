/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yogesh
 */
import java.sql.*;

public class Second 
{
    public static void main(String args[]) throws Exception
    {
         String url="jdbc:mysql://localhost:3306/test2";
        String usr="yogesh";
        String passwd="yogesh123";
        String query="select * from first";
        String insq="insert into first values(123123123123,'Ramesh','Comp',1231233211)";
        
        Class.forName("com.mysql.jdbc.Driver");//Registering driver......
        Connection con=DriverManager.getConnection(url,usr,passwd);//connection made......
        
        PreparedStatement st=con.prepareStatement(insq);//Statement created......
        st.setString(1,"170200107021");
        st.setString(2,"Ravi");
        st.setString(3,"Comp");
        st.setString(4,"3211239999");
        int n=st.executeUpdate();
       
        
        
        ResultSet rslt=st.executeQuery(query);//Result is out.......
             
        System.out.println("After Modification "+n+" Rows updated");
        
        con.close();
        st.close();
    }
}
