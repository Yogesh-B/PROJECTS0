/*
Manipulating employee table
*/
import java.sql.*;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Third
{
    public static void main(String args[]) throws Exception
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter database name:");
        String url="jdbc:mysql://localhost:3306/"+sc.nextLine();
        System.out.println("Enter Username:");
        String usr=sc.nextLine();
        System.out.println("Enter Password:");
        String passwd=sc.nextLine();
                         //Enter query
        System.out.println("Enter your query:");
        String qry=sc.nextLine();
        System.out.println("Enter column to show:");
        String col=sc.nextLine();
                         //connect driver
        Class.forName("com.mysql.jdbc.Driver");
                         //connect to database
        Connection con=DriverManager.getConnection(url,usr,passwd);
        Statement st=con.createStatement(); 
        ResultSet rs=st.executeQuery(qry);

        while(rs.next())
        {
            System.out.println(rs.getString(col));    
        }
        st.close();
        con.close();
    }
}

