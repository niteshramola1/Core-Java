import java.util.LinkedList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mainframe extends JFrame {

	int index=0,count=0;
	LinkedList<ClsEmp> lst=new LinkedList<ClsEmp>();
	JTextField arrTxt[]=new JTextField[5];
	JTextArea txtAdd=new JTextArea();
	JComboBox<String> cboDesignation=new JComboBox<String>();
	JCheckBox chbFood=new JCheckBox("food");
	JCheckBox chbTravel=new JCheckBox("travel");
	JRadioButton rdbMale=new JRadioButton("male");
	JRadioButton rdbFemale=new JRadioButton("Female");
	
	public Mainframe()
	{
		setLayout(null);
		chbFood.setBounds(160,290,100,20);
		add(chbFood);
		
		chbTravel.setBounds(260,290,100,20);
		add(chbTravel);
		
		rdbMale.setBounds(160,140,100,20);
		add(rdbMale);
		
		rdbFemale.setBounds(260,140,100,20);
		add(rdbFemale);
		
		ButtonGroup grp=new ButtonGroup();
		grp.add(rdbMale);grp.add(rdbFemale);
		
		cboDesignation.setBounds(160, 170, 100, 20);
		add(cboDesignation);

		cboDesignation.addItem("Emp");
		cboDesignation.addItem("Manager");
		cboDesignation.addItem("SalesManager");
		
		JScrollPane jspAdd=new JScrollPane(txtAdd);
		jspAdd.setBounds(160,200,100,50);
		add(jspAdd);
		
		int yposTxt[]= {50,80,110,260,320};
		for(int i=0;i<5;i++)
		{
			arrTxt[i]=new JTextField();
			arrTxt[i].setBounds(160,yposTxt[i],100,20);
			add(arrTxt[i]);
		}
		JButton arrBtn[]=new JButton[11];
		String strBtnNames[]= {"First","Next","Previous","Last","Add","Delete","Update","Sort","Load","Transfer","Save"};
		int yposBtn=350;
		int xposBtn=50;
		for(int i=0;i<11;i++)
		{ 
			arrBtn[i]=new JButton(strBtnNames[i]);
			arrBtn[i].setBounds(xposBtn,yposBtn,70,20);
			add(arrBtn[i]);
			xposBtn+=80;
			if(i==3 || i==7)
			{
				yposBtn+=30;
				xposBtn=50;
			}
			arrBtn[i].addActionListener(new ButtonHandler(this));
		}
		String strENames[]= {"Empid" , "Ename" , "Eage" , "Egender","Edesignation","Eadd","Esal","EHOC","EAllowance"};
		JLabel arrLbl[]=new JLabel[9];
		int yposLbl[]= {50,80,110,140,170,200,260,290,320};
		for(int i=0;i<9;i++)
		{
			arrLbl[i]=new JLabel(strENames[i]);
			arrLbl[i].setBounds(50,yposLbl[i],200,20);
			add(arrLbl[i]);
			}
			
			setTitle("Nitesh");
			setVisible(true);
			setBounds(0,0,500,500);
		}
	}

