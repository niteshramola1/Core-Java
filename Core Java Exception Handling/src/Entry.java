
import java.io.IOException;
import java.sql.SQLException;

public class Entry{
	public static void main(String[] args) {
		Sample s1=new Sample();
		try {
			s1.fun();
		}
		catch(IOException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
class Sample{
	public void fun() throws IOException{
		int age=9;
		if(age<18) {
			throw new IOException("age is too small");
		}
	}
}

//public class Entry{
//	public static void main(String[] args) {
//		int age=5;
//		try {
//			System.out.println("1");
//			if(age<18)
//			{
//				System.out.println("2");
//				throw new MyException("Age is too small ");
//			}
//			
//		}
//		
//		catch(MyException me) {
//			System.out.println("3 "+me.getMessage());
//		}
//	}
//}
//class MyException extends Exception{
//     public MyException()
//	{
//	super();
//}
//public MyException(String msg) {
//	super(msg+"plz contact admin");
//}
//}
//public class Entry{
//	public static void main(String[] args) {
//		int age=5;
//		try {
//			System.out.println("1");
//			if(age<18)
//			{
//				System.out.println("2");
//				throw new IOException("Age is too small");
//			}
//			if(age>100) {
//				System.out.println("3");
//				throw new NullPointerException("Age is too Large");
//			}
//			
//		}
//		catch(IOException ie) {
//			System.out.println("4"+ie.getMessage());
//		}
//		catch(NullPointerException npe) {
//			System.out.println("5"+npe.getMessage());
//		}
//		finally {
//			System.out.println("6");
//		}
//		System.out.println("************7******************");
//	}
//}

//public class Entry{
//	public static void main(String[] args) {
//		int age=5;
//		try {
//			System.out.println("1");
//			if(age<18)
//			{
//				System.out.println("2");
//				throw new IOException("Age is too small");
//			}
//			try {
//
//			if(age>100) {
//				System.out.println("3");
//				throw new Exception("Age is too Large");
//			}
//		}
//		catch(IOException ie) {
//			System.out.println("4"+ie.getMessage());
//		}
//		finally {
//			System.out.println("5 inner finally");
//		}
//	}
//		catch(Exception e) {
//			System.out.println("6"+e.getMessage());
//		}
//		finally {
//			System.out.println("7 outer finally");
//		}
//		System.out.println("************8******************");
//	}
//}

//public class Entry{
//	public static void main(String[] args) {
//		int age=5;
//		try {
//			System.out.println("1");
//			if(age<18)
//			{
//				System.out.println("2");
//				throw new IOException("Age is too small");
//			}
//			if(age>100) {
//				System.out.println("3");
//				throw new SQLException("Age is too Large");
//			}
//			
//		}
//		catch(IOException ie) {
//			System.out.println("4"+ie.getMessage());
//		}
//		catch(Exception e) {
//			System.out.println("5"+e.getMessage());
//		}
//		System.out.println("************6******************");
//	}
//}

//public class Entry{
//	public static void main(String[] args) {
//				int age=5;
//				try {
//					System.out.println("1");
//					if(age<18)
//					{
//						System.out.println("2");
//						throw new IOException("Age is too small");
//					}
//					if(age>100) {
//						System.out.println("3");
//						throw new SQLException("Age is too Large");
//					}
//					
//				}
//				catch(Exception ie) {
//					System.out.println("4"+ie.getMessage());
//				}
//				System.out.println("**************5***************");
//	}
//}

//public class Entry{
//	public static void main(String[] args) {
//		int age=555;
//		try {
//			System.out.println("1");
//			if(age<18)
//			{
//				System.out.println("2");
//				throw new IOException("Age is too small");
//			}
//			if(age>100) {
//				System.out.println("3");
//				throw new SQLException("Age is too Large");
//			}
//			
//		}
//		catch(IOException ie) {
//			System.out.println("4"+ie.getMessage());
//		}
//		catch(SQLException se) {
//			System.out.println("5"+se.getMessage());
//		}
//		System.out.println("************6******************");
//	}
//}
//public class Entry{
//	public static void main(String[] args) {
//		int age=9;
//		System.out.println("1");
//		try {
//			if(age<18)
//			{
//				System.out.println("2");
//				throw new IOException("age is too small");
//			}
//		}
//		catch(IOException ie)
//		{
//			System.out.println("3"+ie.getMessage());
//		
//		}
//		System.out.println("4*****************************************");
//		
//	}
//}

//public class Entry
//{
//	public static void main(String[] args) {
//		int age=9;
//		System.out.println("1");
//		try {
//			if(age<18)
//			{
//				System.out.println("2");
//				throw new NullPointerException("age is too small");
//			}
//		}
//		catch(NullPointerException npe)
//		{
//			System.out.println("3"+npe.getMessage());
//		
//		}
//		System.out.println("4*****************************************");
//		
//	}
//}

//public class Entry {
//
//	public static void main(String[] args) {
//		System.out.println("1");
//		Emp e1=null;
//		System.out.println("2");
//		try
//		{
//			e1.setEmp("nitesh",18,99999);
//           e1.dispEmp();
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("3 OOPS something went wrong"+e.getMessage());
//		
//		}
//		System.out.println("4***************************");
//		
//
//	}
//
//}
//class Emp{
//	String Ename;
//	int age;
//	float sal;
//	public void setEmp(String s,int a,float sl)
//	{
//		Ename=s;
//		age=a;
//		sal=sl;
//	}
//		public void dispEmp() {
//			System.out.println(Ename+""+age+""+sal);
//		}
//	
//	
//}
