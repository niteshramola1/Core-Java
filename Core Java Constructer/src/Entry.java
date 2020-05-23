
public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch(2)
		{
		case 1:
			Person p1=new Person();
			Person p2=new Person("nitesh",18,50);
			Person p3=new Person(p2);
			p1.dispPerson();
			p2.dispPerson();
			p3.dispPerson();
			break;
		case 2:
			Emp e1=new Emp();
			Emp e2=new Emp("ramola",19,55,99787);
			Emp e3=new Emp(e2);
			e1.dispEmp();e2.dispEmp();e3.dispEmp();
			break;
			
		}
	}
}
class Person{
	String Ename;
	int age;
	float wt;
	public Person() {
		System.out.println("Person default cons. called");
		age=0;
		wt=0;
		Ename="abcd";
	}
	public Person(String s,int a,float w) {
		System.out.println("Person parametrize cons. called");
		age=a;
		wt=w;
		Ename=s;
	}
	public Person(Person p) {
		age=p.age;
		wt=p.wt;
		Ename=p.Ename;
		System.out.println("Person copy cons. called");
	}
	public void dispPerson() {
		System.out.println(Ename+" "+age+" "+wt);
	}
}
class Emp extends Person{
	int sal;
	public Emp() {
		super();
		sal=0;
		System.out.println("Emp default cons. called");
	}
	public Emp(String s,int a,float wt,int sl) {
		super(s,a,wt);
		sal=sl;
		System.out.println("Emp parametrize cons. called");
	}
	public Emp(Emp e) {
		super(e);
		sal=e.sal;
		System.out.println("Emp copy cons. called");
	}
	public void dispEmp() {
		super.dispPerson();
		System.out.println(sal);
	}
}