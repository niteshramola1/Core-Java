import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class DBHandler
{
public Connection getDBCon()
{
Connection con=null;
OracleDataSource ods;
try {
ods = new OracleDataSource();
ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
con= ods.getConnection("nitesh","nitesh");
System.out.println("connection established successfully");
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return con;

}public void dispTblEmp()
{
	//1- establish the connection
	Connection con=getDBCon();
	//2- specify your objective
	try {
	PreparedStatement stmt=con.prepareStatement("select * from tblemp");
	//3- pass the parameter if any
	//4- execute your query
	ResultSet rset=stmt.executeQuery();//i d u- executeupdate()...select - executequery
	//resultset is like pointer which points to the first row of the result of query.
	while(rset.next())
	{
	String strEmpno,strEname,strEage,strEadd,strEsal;
	strEmpno=rset.getString("empno");
	strEname=rset.getString("ename");
	strEage=rset.getString("eage");
	strEadd=rset.getString("eadd");
	strEsal=rset.getString("esal");
	System.out.println(strEmpno+ " "+ strEname+" "+strEage+" "+strEsal+" "+strEadd);
	}
	//5- close your connection
	con.close();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	 
	}

	public void updateFromTblEmpByEmpno(String strEmpno,String strEname,String strEage,String strEadd,String strEsal )
	{
	//1- establish the connection
	Connection con=getDBCon();
	//2- specify your objective
	try {
	PreparedStatement stmt=con.prepareStatement("update tblemp set ename=?,eage=?,eadd=?,esal=? where empno=?");

	//3- pass the parameter if any
	stmt.setString(1, strEname);stmt.setString(2, strEage);stmt.setString(3, strEadd);
	stmt.setString(4, strEsal);stmt.setString(5, strEmpno);
	//4 execute your query
	stmt.executeUpdate();
	System.out.println("data updated ");
	//5 close your connection
	con.close();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}

	public void deleteFromtblEmp(String strEmpno)
	{
	//1- establish the connection
	Connection con=getDBCon();
	//2- specify your objective
	try {
	PreparedStatement stmt=con.prepareStatement("delete from tblemp where empno=?");
	//3- pass the parameter if any
	stmt.setString(1, strEmpno);
	//4- execute your query
	stmt.executeUpdate();// i d update - executeUpdate();//Select - executeQuery();
	//5- close your connection
	con.close();
	System.out.println("Data deleted");

	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}
	//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
	public void insertIntoTblEmp(String strEmpno,String strEname,String strEage,String strEadd,String strEsal)
	{
	//1- establish the connection
	try {
	OracleDataSource ods=new OracleDataSource();
	ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
	Connection con= ods.getConnection("niteshramola","icsd");
	//2- specify your objective
	PreparedStatement stmt=con.prepareStatement("insert into tblemp values (?,?,?,?,?)");

	//3- pass the parameter if any
	stmt.setString(1, strEmpno);
	stmt.setString(2, strEname);
	stmt.setString(3, strEage);
	stmt.setString(4, strEadd);
	stmt.setString(5, strEsal);

	//4 execute your query
	stmt.executeUpdate();// i d u - executeUpdate()
	//Select - executeQuery();
	System.out.println("Data inserted ");
	con.close();
	//5 close your connection
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}


	}
	}
