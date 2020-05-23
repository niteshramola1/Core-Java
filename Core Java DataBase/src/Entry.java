
public class Entry
{
public static void main(String[] args) {

DBHandler objDH=new DBHandler();
switch(4)
{
case 1:
objDH.insertIntoTblEmp("10", "sumit", "21", "delhi", "852100");
break;
case 2:
	objDH.deleteFromtblEmp("1");
	break;
case 3:
	objDH.updateFromTblEmpByEmpno("2", "ramola", "20", "mumbai", "98979");
	break;
case 4:
	objDH.dispTblEmp();
	break;
}
}
}
