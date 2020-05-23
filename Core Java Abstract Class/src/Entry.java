
public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch(2) {
		case 1:
			Derive d1=new Derive2();
		d1.fun1();d1.fun2();d1.fun3();
		break;
		
		case 2:
			Base b1=new Derive2();
			b1.fun1();b1.fun2();b1.fun4();
			break;
		}
	}

}
abstract class Base{
	abstract public void fun4();
	abstract public void fun1();
	public void fun2() {
		System.out.println("fun 2 called inside base");
	}
}
abstract class Derive extends Base{
	public void fun1()
	{
		System.out.println("fun 1 called");
	}
		public void fun3() {
			System.out.println("fun3 called");
	}
}
class Derive2 extends Derive{
	public void fun4() {
		System.out.println("fun4 called");
	}
	public void fun5() {
		System.out.println("fun5 called");
	}
}