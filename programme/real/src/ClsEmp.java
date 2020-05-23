public class ClsEmp {
	String Empid,Ename,Eadd,Edesignation;
	int Eage,Eall,Ehoc,Esal;
	boolean Gender;
	
	public void dispEmp()
	{
		System.out.println(Empid+""+Ename+""+Eadd+""+Edesignation+""+Eage+""+Esal+""+Eall+""+Ehoc+""+Gender);
	}

	public ClsEmp()
	{
		
	}
	public ClsEmp(String Empid,String Ename,String Eadd,String Edesignation,int Eage,int Esal,int Eall,int Ehoc,boolean Gender)
	{
		super();
		this.Empid=Empid;
		this.Ename=Ename;
		this.Eadd=Eadd;
		this.Edesignation=Edesignation;
		this.Eage=Eage;
		this.Esal=Esal;
		this.Eall=Eall;
		this.Ehoc=Ehoc;
		this.Gender=Gender;
	}
	public String getEmpid() {
		return Empid;
	}

	public void setEmpid(String empid) {
		Empid = empid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getEadd() {
		return Eadd;
	}

	public void setEadd(String eadd) {
		Eadd = eadd;
	}

	public String getEdesignation() {
		return Edesignation;
	}

	public void setEdesignation(String edesignation) {
		Edesignation = edesignation;
	}

	public int getEage() {
		return Eage;
	}

	public void setEage(int eage) {
		Eage = eage;
	}

	public int getEall() {
		return Eall;
	}

	public void setEall(int eall) {
		Eall = eall;
	}

	public int getEhoc() {
		return Ehoc;
	}

	public void setEhoc(int ehoc) {
		Ehoc = ehoc;
	}

	public int getEsal() {
		return Esal;
	}

	public void setEsal(int esal) {
		Esal = esal;
	}

	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}
	

	
}
