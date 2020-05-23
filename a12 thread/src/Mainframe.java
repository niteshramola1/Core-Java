import javax.swing.JButton;
import javax.swing.JFrame;

public class Mainframe extends JFrame {
	public Mainframe() {
		setLayout(null);
		JButton btn=new JButton("Start");
		btn.setBounds(50, 50, 100, 20);
		add(btn);
		
		btn.addActionListener(new ButtonHandler(this));
		setTitle("Nitesh");
		setVisible(true);
		setBounds(0,0,500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
