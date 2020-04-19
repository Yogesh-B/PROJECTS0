using System;
using System.Data;
using System.Data.SqlClient;

namespace ADOapp1
{
    class Program
    {
        public static void Main(string[] args) 
        {
            String cs = @"Data Source=DESKTOP-BP3CEIO\SQLEXPRESS;Initial Catalog=ADO;Integrated Security=True";
            SqlConnection cn = new SqlConnection(cs);
            cn.Open();
            String cq = "select * from student";
            SqlCommand cmd = new SqlCommand(cq, cn);
            SqlDataReader dr = cmd.ExecuteReader();

            Console.WriteLine("{0,4} \t {1,4} \t {2,4} ", "Enrollment", "Name", "Sem");
            while (dr.Read())
            {
                Console.WriteLine("{0,4} \t {1,4} \t {2,4} ", dr[0].ToString(),dr[1].ToString(),dr[2].ToString());
            }
            dr.Close();

            String cq1 = "insert into student values (1209,'Yogesh',5)";
            SqlCommand cmd1 = new SqlCommand(cq1,cn);
            int status = (int)cmd1.ExecuteNonQuery();
            Console.WriteLine("Status = "+ status);




            cn.Close();
            Console.Read();
        }
    }
}
