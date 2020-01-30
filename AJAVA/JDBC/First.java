//This is First JDBC example
//fetching data from server
import java.sql.*;//this is just a library ,,driver load is done 
import java.util.Scanner;
public class First
{
    
    public static void main(String args[]) throws Exception
    {Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/test2";
        String usr="yogesh";    
        String passwd="yogesh123";
        String query="select * from first";
        System.out.println("Enter 1 & Press Enter to get results.....");
        // int n=sc.nextInt();
        System.in.read();
        Class.forName("com.mysql.jdbc.Driver");//Registering driver......
        Connection con=DriverManager.getConnection(url,usr,passwd);//connection made......
        
        Statement st=con.createStatement();//Statement created......
        ResultSet rslt=st.executeQuery(query);//Result is out.......
        
        System.out.println("Enroll        Name");
        while(rslt.next())
        {
        String name=rslt.getString("Enroll")+"  "+rslt.getString("Name");
        System.out.println(name);
        }
        con.close();
        st.close();
        
    }
}