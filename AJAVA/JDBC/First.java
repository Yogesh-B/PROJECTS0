//This is First JDBC example
//fetching data from server
import java.sql.*;//this is just a library ,,driver load is done by side menu

public class First
{
    public static void main(String args[]) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/test2";
        String usr="yogesh";
        String passwd="yogesh123";
        String query="select * from first";
        
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