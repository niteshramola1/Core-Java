
public class Emp
{
 String strEname,strEmpno,strEage,strEadd,strEsal;
 public Emp(String strEname, String strEmpno, String strEage, String strEadd, String strEsal) {
  super();
  this.strEname = strEname;
  this.strEmpno = strEmpno;
  this.strEage = strEage;
  this.strEadd = strEadd;
  this.strEsal = strEsal;
 }
 
 public void dispEmp()
 {
  System.out.println(strEmpno+" "+strEname+" "+strEadd+" "+strEage+" "+strEsal);
 }
 public Emp() {
  super();
 }
 public String getStrEname() {
  return strEname;
 }
 public void setStrEname(String strEname) {
  this.strEname = strEname;
 }
 public String getStrEmpno() {
  return strEmpno;
 }
 public void setStrEmpno(String strEmpno) {
  this.strEmpno = strEmpno;
 }
 public String getStrEage() {
  return strEage;
 }
 public void setStrEage(String strEage) {
  this.strEage = strEage;
 }
 public String getStrEadd() {
  return strEadd;
 }
 public void setStrEadd(String strEadd) {
  this.strEadd = strEadd;
 }
 
 public String getStrEsal() {
  return strEsal;
 }
 public void setStrEsal(String strEsal) {
  this.strEsal = strEsal;
 }
 
}