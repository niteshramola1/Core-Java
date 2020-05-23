import java.util.Scanner;

public class Entry {
	public static void main(String[] args) {
		int a,b,c;
		Scanner objScanner=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=objScanner.nextInt();
		System.out.println("enter the value of b");
		b=objScanner.nextInt();
		c=a+b;
		System.out.println("result is="+c);
		
	}

}
