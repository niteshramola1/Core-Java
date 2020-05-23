import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Entry {
public static void main(String[] args) {
	FileHandler objFH=new FileHandler();
	switch(8)
	{
	case 1: objFH.dispAllFilesFromD();
	break;
	case 2: objFH.deleteFileByFileName("j");
	break;
	case 3: objFH.writeBytesofFile();
	break;
	case 4: objFH.readBytesFromFile();
	break;
	case 5: objFH.writeIntStringToFile();
	break;
	case 6: objFH.readIntStringFrom();
	break;
	case 7: objFH.writeObjToFileJ();
	break;
	case 8: objFH.readObjFromFile();
	break;
	
	}
}
}

class FileHandler
{
	public void readObjFromFile()
	{
		File objFile=new File("d://zara.txt");
		try {
			FileInputStream fis=new FileInputStream(objFile);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Emp e1=(Emp)ois.readObject();
			e1.dispEmp();
			fis.close();ois.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
	}
	public void writeObjToFileJ()
	{
		File objFile=new File("d://zara.txt");
		try {
			FileOutputStream fos=new FileOutputStream(objFile);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Emp e1=new Emp();
			e1.setEmp("nitesh", 18, 50);
			oos.writeObject(e1);
			System.out.println("object written");
			fos.close();oos.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readIntStringFrom()
	{
		File objFile=new File("d://zara.txt");
		try {
			FileInputStream fis= new FileInputStream(objFile);
			DataInputStream dis= new DataInputStream(fis);
			int a=dis.readInt();
			String str=dis.readUTF();
			System.out.println(a+" "+str);
			fis.close();dis.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void writeIntStringToFile()
	{
		File objFile=new File("d://zara.txt");
		try {
			FileOutputStream fos=new FileOutputStream(objFile);
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeInt(123);
			dos.writeUTF("nitesh");
			System.out.println("data written ");
			fos.close();dos.close();		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void readBytesFromFile()
	{
		File objFile=new File("d://f.txt");
		try {
			FileInputStream fis=new FileInputStream(objFile);
			byte arrBytes[]=new byte[(int)objFile.length()];
			fis.read(arrBytes);
			String str=new String(arrBytes);
			System.out.println(str);
			fis.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
				
		}
	}
	public void writeBytesofFile()
	{
		File objFile=new File("d://f.txt");
		try {
			if(!objFile.exists()) {
				objFile.createNewFile();
			}
			FileOutputStream fos=new FileOutputStream(objFile);
			fos.write("hello icsd".getBytes());
			System.out.println("bytes written to file");
			fos.close();
		}
		catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
	public void deleteFileByFileName(String strFilenm) {
		File objFile=new File("d://");
		File arrFile[]=objFile.listFiles();
		for(File file:arrFile)
		{
			if(file.getName().equals(strFilenm)) {
				file.delete();
				System.out.println("file deleted");
				break;
			}
		}
	}
	public void dispAllFilesFromD()
	{
		File objFile=new File("d:");
		String FileNames[]=objFile.list();
		for(String FileName:FileNames)
		{
			System.out.println(FileName);
		}
	}
}