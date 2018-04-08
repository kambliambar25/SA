import java.sql.*;
public class simpledatabaseconnection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivananda","12345678");
	Statement st=conn.createStatement();
String sql="select * from Sample";	
ResultSet rs=st.executeQuery(sql);
while(rs.next())
{
	System.out.println(rs.getInt(1)+" " +rs.getString(2));

}	
conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}
