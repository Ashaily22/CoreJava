package Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Path filePath = Paths.get("C:\\yumna\\Azmiri ShailyResume");
int FileContents=filePath.getNameCount();
System.out.println("Path is: " + filePath.toString());
System.out.println("There are" + FileContents + " elements in the file");
for(int i =0; i<FileContents;i++)
{
	System.out.println("Element" + i + "is" + filePath.getName(i));
	}
	
	}
}
