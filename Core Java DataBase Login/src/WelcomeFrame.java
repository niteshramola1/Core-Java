import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class WelcomeFrame extends JFrame
{
 
 DBHandler objDH=new DBHandler();
 
 JTextField txtEmpno=new JTextField();
 JTextField txtEname=new JTextField();
 JTextField txtEage=new JTextField();
 JTextField txtEadd=new JTextField();
 JTextField txtEsal=new JTextField();
 
 JComboBox<String> cboEmpnos=new JComboBox<String>();
 
 public WelcomeFrame()
 {
  setLayout(null);
  
  ImageIcon icnbg=new ImageIcon("s.jpg");
  JLabel lblbg=new JLabel(icnbg);
  lblbg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
  add(lblbg); 
 
  cboEmpnos.setBounds(260, 50, 100, 20);
  lblbg.add(cboEmpnos);
  
  
  LinkedList<Emp> lst= objDH.getAllRecordsFromTblEmp();
  
  for (Emp emp : lst) {
   
   String strEmpno=emp.getStrEmpno();
   cboEmpnos.addItem(strEmpno);
   
  }
  
  cboEmpnos.addItemListener(new ItemListener() {
   
   
   @Override
   public void itemStateChanged(ItemEvent arg0) {
    // TODO Auto-generated method stub
   
    String strEmpno=(String) cboEmpnos.getSelectedItem();
    
    setTitle("strEmpno");
    
    txtEmpno.setText(strEmpno);
    
    Emp e1=objDH.getOneRecordFromTblempByEmpno(strEmpno);
    
    txtEname.setText(e1.getStrEname());
    txtEage.setText(e1.getStrEage());
    txtEadd.setText(e1.getStrEadd());
    txtEsal.setText(e1.getStrEsal());
    
    
    
   }
  });
  
  
  JLabel lblEmpno,lblEname,lblEage,lblEadd,lblEsal;
  
  lblEmpno=new JLabel("Empno");
  lblEmpno.setBounds(50,50,100,20);
  lblbg.add(lblEmpno);
  txtEmpno.setBounds(160,50,100,20);
  lblbg.add(txtEmpno);
  
  
  lblEname=new JLabel("Ename");
  lblEname.setBounds(50,80,100,20);
  lblbg.add(lblEname);
  
  
  txtEname.setBounds(160,80,100,20);
  lblbg.add(txtEname);
  
  lblEage=new JLabel("Eage");
  lblEage.setBounds(50, 110, 100, 20);
  lblbg.add(lblEage);
  
  
  txtEage.setBounds(160,110,100,20);
  lblbg.add(txtEage);
  
  
  
  lblEadd=new JLabel("Eadd");
  lblEadd.setBounds(50,140,100,20);
  lblbg.add(lblEadd);
  
  
  
  txtEadd.setBounds(160,140,100,20);
  lblbg.add(txtEadd);
  
  
  
  lblEsal=new JLabel("Esal");
  lblEsal.setBounds(50,170,100,20);
  lblbg.add(lblEsal);
  
  
  txtEsal.setBounds(160,170,100,20);
  lblbg.add(txtEsal);
  
  
  JButton btninsert=new JButton("insert");
  btninsert.setBounds(50,200,100,20);
  lblbg.add(btninsert);
  
  btninsert.addActionListener(new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    
    String strEmpno,strEname,strEage,strEadd,strEsal;
    
    strEmpno=txtEmpno.getText();
    strEname=txtEname.getText();
    strEage=txtEage.getText();
    strEadd=txtEadd.getText();
    strEsal=txtEsal.getText();
    
    
    objDH.insertintotblemp(strEmpno,strEname,strEage,strEadd,strEsal);
    
    JOptionPane.showMessageDialog(null,"data inseted");
    
    
   }
  });
  
  
  JButton btnUpdate=new JButton("update");
  btnUpdate.setBounds(160,200,100,20);
  lblbg.add(btnUpdate);
  
  btnUpdate.addActionListener(new ActionListener(
    ) {
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    
               String strEmpno,strEname,strEage,strEadd,strEsal;
    
    strEmpno=txtEmpno.getText();
    strEname=txtEname.getText();
    strEage=txtEage.getText();
    strEadd=txtEadd.getText();
    strEsal=txtEsal.getText();
    
    objDH.updatefromtblemp(strEmpno,strEname,strEage,strEadd,strEsal);
    JOptionPane.showMessageDialog(null, "data updated");
    
   }
  });
  
  
  JButton btndelete=new JButton("delete");
  btndelete.setBounds(270,200,100,20);
  lblbg. add(btndelete);
  
  btndelete.addActionListener(new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    
    
    
    String strEmpno=txtEmpno.getText();
    
    objDH.deletefromtblemp(strEmpno);
    
    JOptionPane.showMessageDialog(null, "data deleted");
    
   }
  });
  
  
  setTitle("welcome");
  setVisible(true);
  setSize(Toolkit.getDefaultToolkit().getScreenSize());
  
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 }
 
}