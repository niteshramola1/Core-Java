
public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person("nitesh",18,50);
		Person p3=new Person(p2);
		p1.dispPerson();
    	p2.dispPerson();
		p3.dispPerson();
	}

}
class Person{
	String Ename;
	int age;
	float wt;
	public Person() {
		age=0;
		wt=0;
		Ename="nitesh";
		System.out.println("default constructer or zero arg cons. called");
}
	public Person(String s,int a,float w) {
		Ename=s;
		age=a;
		wt=w;
		System.out.println("parametrise constructer  called");
	}
	public Person(Person p) {
		age=p.age;
		wt=p.wt;
		Ename=p.Ename;
		System.out.println("copy constructer called");
	}
	public void dispPerson() {
		System.out.println(Ename+" "+age+" "+wt);
	}
}