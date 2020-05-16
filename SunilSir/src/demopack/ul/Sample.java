package demopack.ul;
import java.io.*;
public class Sample {
public static void main(String[] args) {
	demopack.bl Emp1 e1=new demopack.bl Emp1(32,"chakri",4567.45);
	File f1=new File("D:/filestorage/Employee.sre");
	f1.createNewFile();
	FileOutputStream fos=new FileOutputStream(f1);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.public WriteObject(e1);
	oos.flush();
	oos.close();
	fos.close();
}
}
