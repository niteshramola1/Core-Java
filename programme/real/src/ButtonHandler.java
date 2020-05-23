import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

		Mainframe f;
		public ButtonHandler(Mainframe mainframe)
		{
			f=mainframe;
		}
		
			public void showEmpObjonFrame(ClsEmp e1)
			{
				String Empid=e1.getEmpid(), Ename=e1.getEname(),Eadd=e1.getEadd(),Edesignation=e1.getEdesignation();
				int Eage=e1.getEage(),Esal=e1.getEsal(),Eall=e1.getEall(),Ehoc=e1.getEhoc();
				boolean Gender=e1.isGender();
				
				f.arrTxt[0].setText(Empid);
				f.arrTxt[1].setText(Ename);
				f.arrTxt[2].setText(String.valueOf(Eage));
				f.arrTxt[3].setText(String.valueOf(Esal));
				f.arrTxt[4].setText(String.valueOf(Ehoc));
				f.txtAdd.setText(Eadd);
				
				if(Gender==true)
				{
					f.rhbMale.setSelected(true);f.rhbFemale.setSelected(false);
				}
				else {
					f.rhbMale.setSelected(false);f.rhbFemale.setSelected(true);
				}
			
			if(Eall==750) {
				f.chbFood.setSelected(true);f.chbTravel.setSelected(true);}
				
				else if(Eall==500) {
					f.chbFood.setSelected(true);f.chbTravel.setSelected(false);
				}
			
				else if(Eall==250) {
					f.chbFood.setSelected(false);f.chbTravel.setSelected(true);
				}
				else if(Eall==0) {
					f.chbFood.setSelected(false);f.chbTravel.setSelected(false);
				}
			}
			public void actionPerformed(ActionEvent arg0) {
				String Acmd=arg0.getActionCommand();
				if(Acmd.equals("Add"))
				{
					String Empid,Ename,Eadd,Edesignation="Emp";
					int Eage,Esal,Eall=0,hoc;
					boolean Gender=true;
					Empid=f.arrTxt[0].getText();
					Ename=f.arrTxt[1].getText();
					Esal=Integer.parseInt(f.arrTxt[3].getText());
					Eage=Integer.parseInt(f.arrTxt[2].getText());
					Ehoc=Integer.parseInt(f.arrTxt[4].getText());
					Eadd=f.txtAdd.getText();
					if(f.rhbMale.isSelected())
					{
					Gender=true;
					}
					else if(f.rhbFemale.isSelected())
					{
					Gender=false;
					}
					//food= 500 travel=250
					if(f.chbFood.isSelected() && f.chbTravel.isSelected())
					{
					Eall=750;
					}
					else if(!f.chbFood.isSelected() && f.chbTravel.isSelected())
					{
					Eall=250;
					}
					else if(f.chbFood.isSelected() && !f.chbTravel.isSelected())
					{
					Eall=500;
					}
					else if(!f.chbFood.isSelected() && !f.chbTravel.isSelected())
					{
					Eall=0;
					}

					ClsEmp objEmp=new ClsEmp(Empid, Ename, Eadd, Edesgination, Eage, Esal, Eall, hoc,Gender);
					objEmp.dispEmp();

					f.lst.add(objEmp);
					f.count++;


					System.out.println("btn clicked "+ Acmd);
					}
					else if(Acmd.equals("First"))
					{
					f.index=0;
					ClsEmp e1=f.lst.getFirst();
					e1.dispEmp();
					showEmpObjonFrame(e1);
					System.out.println("btn clicked "+ Acmd);
					}
					else if(Acmd.equals("Next"))
					{

					f.index++;
					ClsEmp e1=f.lst.get(f.index);
					e1.dispEmp();
					showEmpObjonFrame(e1);
					System.out.println("btn clicked "+ Acmd);
					}
					else if(Acmd.equals("Prev"))
					{
					f.index--;
					ClsEmp e1=f.lst.get(f.index);
					e1.dispEmp();
					showEmpObjonFrame(e1);
					System.out.println("btn clicked "+ Acmd);
					}
					else if(Acmd.equals("Last"))
					{
					f.index=f.count-1;
					ClsEmp e1=f.lst.getLast();
					e1.dispEmp();
					showEmpObjonFrame(e1);
					System.out.println("btn clicked "+ Acmd);
					}

					
				}
			}
		
		
	



