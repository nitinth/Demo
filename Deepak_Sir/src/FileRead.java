import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FileRead 

{
	public static void main(String[] args) throws Exception
	{
		File f = new File("C:\\Users\\nitin\\Desktop\\data.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int i =0;
	    while((i=br.read())!= -1)  
	    {
	    	System.out.print((char)i);
	    }
	    fr.close();
	}

}
