package FileHandling;
import java.io.File;
public class Test {
public static void main(String[] args) throws Exception{
	File f=new File("abcd.txt");
	boolean b=f.createNewFile();
	if((b==true)) {
		System.out.println("file created successfully!!!"+f.getName());
	}
	else {
		System.out.println("Not Created");
	}
}
}
