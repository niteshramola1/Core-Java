import java.io.Serializable;

public class Emp implements Serializable
{
String Ename;
int age;
float wt;
public void setEmp(String s,int a ,float w) {
	Ename=s;
	age=a;
	wt=w;
}
public void dispEmp()
{
	System.out.println(Ename+" " +age+" "+wt);
}
}
