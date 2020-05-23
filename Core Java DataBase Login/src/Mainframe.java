import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTree;
public class Mainframe extends JFrame
{
 JTextField txtunm=new JTextField();
 JPasswordField txtpwd=new JPasswordField();
 
 public Mainframe()
 {
  setLayout(null);
  
  ImageIcon icnbg=new ImageIcon("s.jpg");
  JLabel lblbg=new JLabel(icnbg);
  lblbg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
  add(lblbg);
  
  JLabel lblunm=new JLabel("UserName");
  lblunm.setBounds(50,50,100,20);
  lblbg.add(lblunm);
  
  txtunm.setBounds(160,50,100,20);
  lblbg.add(txtunm);
  
  JLabel lblpwd=new JLabel("Password");
  lblpwd.setBounds(50,80,100,20);
  lblbg.add(lblpwd);
  
  txtpwd.setBounds(160,80,100,20);
  lblbg.add(txtpwd);
  
  ImageIcon icnbtn=new ImageIcon("button.png");
  JButton btnlogin=new JButton(icnbtn);
  btnlogin.setBounds(100,110,91,40);
  lblbg.add(btnlogin);
  
  btnlogin.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    
    String strUnm,strPwd;
    
    strUnm=txtunm.getText();
    strPwd=String.valueOf(txtpwd.getPassword());
    
    DBHandler objDH=new DBHandler();
    boolean res=objDH.isValidUser(strUnm,strPwd);
    
    if(res==true)
    {
     dispose();
     
     new WelcomeFrame();
    }
    
    else
    {
     JOptionPane.showMessageDialog(null, "invalid user");
    }

   }
   
  });
  
  setTitle("nitesh");
  setVisible(true);
  setSize(Toolkit.getDefaultToolkit().getScreenSize());
  
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 }
}
