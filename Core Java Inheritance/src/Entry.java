
public class Entry {
public static void main(String[] args) {
	Person p1=new Person();
	Emp e1=new Emp();
	Salesmanager s1=new Salesmanager();
	
	p1.setPerson("nitesh",18,50);
	p1.dispPerson();
	
	e1.setEmp("rahul",19,55,2000);
	e1.dispEmp();
	
	s1.setSalesmanager("ramola", 18, 50, 99999, 9333);
	s1.dispSalesmanager();
}
}
class Person{
	String Ename;
	int age;
	float wt;
	public void setPerson(String s,int a,float w) {
		Ename=s;
		age=a;
		wt=w;
	}
		public void dispPerson() {
			System.out.println(Ename+" "+age+" "+wt);
		}
	}
class Emp extends Person {
	int sal;
	public void setEmp(String s,int a,float w,int sl) {
		setPerson(s,a,w);
		sal=sl;
	}
	public void dispEmp() {
		dispPerson();
		System.out.println(sal);
	}
}
class Salesmanager extends Emp{
	int comm;
	public void setSalesmanager(String s,int a,float w,int sl,int cm) {
	setEmp(s,a,w,sl);
	comm=cm;
	}
	public void dispSalesmanager() {
		dispEmp();
		System.out.println(comm);
	}
}