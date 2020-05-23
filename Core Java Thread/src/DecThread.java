
public class DecThread implements Runnable{
	public void run()
	{
		while(true) {
			Entry.count--;
			System.out.println("Dec thread"+Entry.count);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
