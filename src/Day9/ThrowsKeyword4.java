package Day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileReader fr=null;
		fr = new FileReader("C:\\Users\\sangamesh\\JavaSelenium\\example.txt");
		
		
		BufferedReader	bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);
		
	}

}
