
public class Entry {
	static int count;
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("nitesh");
		System.out.println(t);
		DecThread objJOB=new DecThread();
		Thread objThread=new Thread(objJOB);
		objThread.start();
		IncThread objIncThread=new IncThread();
		objIncThread.start();
		int i=0;
		while(i<=10000000) {
			System.out.println("Main thread"+i);
			i++;
			try {
				Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
}
