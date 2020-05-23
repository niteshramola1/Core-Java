import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

	
		Mainframe frm;
		public ButtonHandler(Mainframe mainframe) {
			frm=mainframe;
		}
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("btn clicked");
			BouncingRect objThread=new BouncingRect(frm);
			objThread.start();
		}
	}

class BouncingRect extends Thread{
	
	Mainframe x;
	public BouncingRect(Mainframe frm) {
		x=frm;
	}
	public void run()
	{
		System.out.println("run method called");
		Graphics grp=x.getGraphics();
		grp.setXORMode(Color.blue);
		int xpos=100,ypos=120;
		while(true) {
			grp.drawRect(xpos, ypos, 100, 20);
			xpos++;
			ypos++;
			try {
				Thread.sleep(50);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
