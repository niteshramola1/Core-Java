import java.util.Scanner;

public class Entry {
public static void main(String[] args) {
	int a,b,c = 0;
	while(true) {
	Scanner objScanner=new Scanner(System.in);
	System.out.println("Enter the value of a & b" );
	a=objScanner.nextInt();
	b=objScanner.nextInt();
	System.out.println("Enter 1 for add");
	System.out.println("Enter 2 for sub");
	System.out.println("Enter 3 for mul");
	System.out.println("Enter 4 for div");
	System.out.println("Enter your choice");
	int ch=objScanner.nextInt();
	switch(ch) {
	case 1: c=a+b;
	break;
	case 2: c=a-b;
	break;
	case 3: c=a*b;
	break;
	case 4: c=a/b;
	break;
	default: System.out.println("Enter the correct choice");
	break;
	}
	System.out.println("result is="+c);
	}
}
}
