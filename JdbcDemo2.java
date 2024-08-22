import java.sql.*;
class JdbcDemo2
{
public static void main(String args[])throws Exception
{
//Loading Driver
Class.forName("com.mysql.jdbc.Driver");

//Providing Connection 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","P@ssw0rd");

//Using Statement Interface
Statement st=con.createStatement();

//processing query using statement method
st.execute("create table demo1(id int primary key,name varchar(20));");
System.out.println("Table created");

//closing objects
st.close();
con.close();
}
}