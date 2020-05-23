
public class IncThread extends Thread{
	public void run() {
		while(true) {
			Entry.count++;
			System.out.println("Inc thread"+Entry.count);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
