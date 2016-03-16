package homework1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork {

	public static void main(String[] args){
		
		try {
			calc();
		} catch (IOException e) {
			System.out.println("There is no file");
		}
		
	}

	static int Load() throws IOException {
	  // open file
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Asy/Desktop/number.txt"));
		
		int lastNumber = 0;
		String line = "0";
		
	  // read the last data
		while(true)
		{
			lastNumber = Integer.parseInt(line);
			
			line = br.readLine();
			
            if (line==null) 
            	break;
		}
		
	  // close file
		br.close();
		return lastNumber;
	}

	static void Store(int data) throws IOException {
	  // open file
		FileWriter bw = new FileWriter("C:/Users/Asy/Desktop/number.txt", true);
		
	  // append the data
		bw.write("\r\n");
		bw.write(String.valueOf(data));
		
	  // close file
		bw.close();
	}

	static int Add(int i, int j) {
	   return i+j;
	}
	
	static void calc() throws IOException{
		int x;
		
		for (int i = 0 ; i<1000 ; i++ ) 
		{
			   x=Load();
			   x=Add(x,1);
			   Store(x);
		}
	}
}