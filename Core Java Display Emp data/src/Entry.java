
public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.setEmp("deepak", 20, 83734);
		e2.setEmp("rohan", 32, 383893);
		e1.disEmp();
		e2.disEmp();
		
	}

}
class Emp{
	String Ename;
	int age;
	float sal;
	public void setEmp(String s,int a,float sl) {
		Ename=s;
		age=a;
		sal=sl;
	}
	public void disEmp() {
		System.out.println(Ename+" "+age+" "+sal);
	}
}