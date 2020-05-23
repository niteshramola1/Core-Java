import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mainframe extends JFrame
{
	public Mainframe()
	{
		setLayout(null);
		 
	JLabel lblunm=new JLabel("Empid");
		lblunm.setBounds(30,30,100,50);
		add(lblunm);
		
		JTextField txtunm=new JTextField();
		txtunm.setBounds(150, 50, 100, 20);
		add(txtunm);

		JLabel lblage=new JLabel("Emale");
		lblage.setBounds(30,60,100,50);
		add(lblage);
		
		JTextField txtage=new JTextField();
		txtage.setBounds(150, 75, 100, 20);
		add(txtage);
		
		JLabel lblsal=new JLabel("Eage");
		lblsal.setBounds(30,90,100,50);
		add(lblsal);
		
	    JTextField txtsal=new JTextField();
		txtsal.setBounds(150, 100, 100, 20);
		add(txtsal);
		

		JLabel lblg=new JLabel("Egender");
		lblg.setBounds(30,120,100,50);
		add(lblg);
		
		JRadioButton rdbmale=new JRadioButton("Male");
		rdbmale.setBounds(145, 135, 100, 20);
		add(rdbmale);
		
		JRadioButton rdbf=new JRadioButton("Female");
		rdbf.setBounds(250, 135, 100, 20);
		add(rdbf);
		
		ButtonGroup grp=new ButtonGroup();
		grp.add(rdbmale);grp.add(rdbf);
		

		JLabel lbld=new JLabel("Edesignation");
		lbld.setBounds(30,150,100,50);
		add(lbld);
		
		JComboBox<String>cbodesignation=new JComboBox<String>();
		cbodesignation.setBounds(145,165,100,20);
		add(cbodesignation);
		cbodesignation.addItem("EMP");
		cbodesignation.addItem("Salesmanger");
		cbodesignation.addItem("Manager");
		
		JLabel lbladd=new JLabel("Eadd");
		lbladd.setBounds(30,180,100,50);
		add(lbladd);
		
		JTextArea txtadd=new JTextArea();
		JScrollPane jspadd=new JScrollPane(txtadd);
		jspadd.setBounds(150, 190, 200, 50);
		add(jspadd);
		
		JLabel lblQ=new JLabel("Esal");
		lblQ.setBounds(30,230,100,50);
		add(lblQ);
		
		JTextField txtQ=new JTextField();
		txtQ.setBounds(150, 245, 100, 20);
		add(txtQ);
		
		
		JLabel lbla=new JLabel("Allowance");
        lbla.setBounds(30,260,100,50);
		add(lbla);
		
		JCheckBox chbF=new JCheckBox("Food");
		chbF.setBounds(150, 275, 100, 20);
		add(chbF);
		
		JCheckBox chbT=new JCheckBox("Travel");
		chbT.setBounds(250, 275, 100, 20);
		add(chbT);
		

		JLabel lblh=new JLabel("HOC");
        lblh.setBounds(30,290,100,50);
		add(lblh);
		
		JTextField txth=new JTextField();
		txth.setBounds(150, 305, 100, 20);
		add(txth);

		JButton btn=new JButton("First");
		btn.setBounds(30, 335, 80, 20);
		add(btn);
		
		JButton btn1=new JButton("Next");
		btn1.setBounds(120, 335, 80, 20);
		add(btn1);
		
		JButton btn2=new JButton("Prev");
		btn2.setBounds(210, 335, 80, 20);
		add(btn2);
		
		JButton btn3=new JButton("Last");
		btn3.setBounds(300, 335, 80, 20);
		add(btn3);
		
		JButton btn4=new JButton("add");
		btn4.setBounds(30, 365, 80, 20);
		add(btn4);
		
		JButton btn5=new JButton("Delete");
		btn5.setBounds(120, 365, 80, 20);
		add(btn5);
		
		JButton btn6=new JButton("Update");
		btn6.setBounds(210, 365, 80, 20);
		add(btn6);
		
		JButton btn7=new JButton("Sort");
		btn7.setBounds(300, 365, 80, 20);
		add(btn7);
		
		JButton btn8=new JButton("Load");
		btn8.setBounds(30, 395, 80, 20);
		add(btn8);
		
		JButton btn9=new JButton("Transfer");
		btn9.setBounds(120, 395, 80, 20);
		add(btn9);
		
		JButton btn10=new JButton("Save");
		btn10.setBounds(210, 395, 80, 20);
		add(btn10);
		
		setTitle("Nitesh");
		setVisible(true);
		setBounds(0,0,500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	}

	
