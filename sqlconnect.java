package sample;
import java.sql.*;
public class sqlconnect {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","root");
			if(con!=null) {
				System.out.println("conn established");
			}
			stmt=con.createStatement();
			//stmt.execute("create table frnd(id number(4) primary key,name varchar(12),age number(4))");
			//stmt.executeUpdate("insert into frnd values(1,'nn',21)");
			//stmt.executeUpdate("insert into frnd values(2,'tt',22)");
			//stmt.executeUpdate("insert into frnd values(3,'rr',25)");
			//stmt.executeUpdate("update frnd set age=26 where id=3");
			//stmt.executeUpdate("delete from frnd where id=3");
			ResultSet rs=stmt.executeQuery("select * from frnd");
			while(rs.next()) {
				Integer id=rs.getInt(1);
				String name=rs.getString(2);
				Integer age=rs.getInt(3);
				System.out.println(id+"\t"+name+"\t"+age+"\t");
		
				
				
			}
			rs.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
		try {
			con.close();
			stmt.close();
		}catch(Exception e) {}

	}
}
}

	