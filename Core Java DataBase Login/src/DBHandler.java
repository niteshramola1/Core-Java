import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import oracle.jdbc.pool.OracleDataSource;
public class DBHandler
{
 
  public Connection getDBCon()
  {
   
   Connection con=null;
   OracleDataSource ods;
   
   try {
    ods=new OracleDataSource();
    ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
    con=ods.getConnection("nitesh","nitesh");
    System.out.println("connection established successfully");
   }
   
   catch(SQLException e)
   {
    e.printStackTrace();
   }
   return con;
  }
  
  
  public Emp getOneRecordFromTblempByEmpno(String strEmpno)
  {
   Emp e1=null;
   
   Connection con=getDBCon();
      
   try {
    PreparedStatement stmt=con.prepareStatement("select * from tblemp where empno=?");
    
    stmt.setString(1, strEmpno);
    
    ResultSet rset=stmt.executeQuery();
    
    if(rset.next())
    {
                 String strEname,strEage,strEadd,strEsal;
       
     strEname=rset.getString("ename");
     strEage=rset.getString("eage");
     strEadd=rset.getString("eadd");
     strEsal=rset.getString("esal");
     
      e1=new Emp(strEname,strEmpno,strEage,strEadd,strEsal);
     e1.dispEmp();
    }
   } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    
    
   }
   return e1;
  }
  
  public LinkedList<Emp> getAllRecordsFromTblEmp()
  {
   LinkedList<Emp> lst=new LinkedList<Emp>();
   Connection con=getDBCon();
   
   try {
    PreparedStatement stmt=con.prepareStatement("select * from tblemp");
    ResultSet rset=stmt.executeQuery();
    
    while(rset.next())
    {
     String strEmpno,strEname,strEage,strEadd,strEsal;
     
     strEmpno=rset.getString("empno");
     strEname=rset.getString("ename");
     strEage=rset.getString("eage");
     strEadd=rset.getString("eadd");
     strEsal=rset.getString("esal");
     
     Emp e1=new Emp(strEname,strEmpno,strEage,strEadd,strEsal);
     e1.dispEmp();
     lst.add(e1);
    }
   } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   
   return lst;
   
  }
  
  public void deletefromtblemp(String strEmpno)
  {
    Connection con=getDBCon();
   
   try {
    PreparedStatement stmt=con.prepareStatement("delete from tblemp where empno=?");
    
    stmt.setString(1,strEmpno);
   
    stmt.executeUpdate();
    con.close();
    
   System.out.println("data deleted"); 
    
   }
   catch(SQLException e) {
    
    e.printStackTrace();
   }
  }
  
  public void updatefromtblemp(String strEmpno,String strEname,String strEage,String strEadd,String strEsal)
  {
    Connection con=getDBCon();
   
   try {
    PreparedStatement stmt=con.prepareStatement("update tblemp set ename=?,eage=?,eadd=?,esal=? where empno=?");
    
    
    stmt.setString(1,strEname);
    stmt.setString(2,strEage);
    stmt.setString(3,strEadd);
    stmt.setString(4,strEsal);
    stmt.setString(5,strEmpno);
    
    stmt.executeUpdate();
    
    System.out.println("updated");
    
    con.close();
     
   }
   catch(SQLException e) {
    
    e.printStackTrace();
   }
  }
 
  public void insertintotblemp(String strEmpno,String strEname,String strEage,String strEadd,String strEsal)
  {
    Connection con=getDBCon();
   
   try {
    PreparedStatement stmt=con.prepareStatement("insert into tblemp values(?,?,?,?,?)");
    
    stmt.setString(1,strEmpno);
    stmt.setString(2,strEname);
    stmt.setString(3,strEage);
    stmt.setString(4,strEadd);
    stmt.setString(5,strEsal);   
    stmt.executeUpdate();
    System.out.println("data inserted");
    
    con.close();
   
   }
   catch(SQLException e) {
    
    e.printStackTrace();
   }
  }
  
  public boolean isValidUser(String strUnm,String strPwd)
  {
   
   boolean res=false; // invalid user
     
     Connection con=getDBCon();
   
   try
   {
    PreparedStatement stmt=con.prepareStatement("select * from tbluser where unm=? and pwd=?");
    stmt.setString(1,strUnm);
    stmt.setString(2,strPwd);
      
    ResultSet rset=stmt.executeQuery();
    if(rset.next())
    {
     System.out.println("valid user");
     res=true;
    }
    else
    {
     System.out.println("invlid user");
     res=false;
    }
    con.close();
   }
   catch(SQLException e)
   {
    e.printStackTrace();
   }
   
   return res;
  }
 }


