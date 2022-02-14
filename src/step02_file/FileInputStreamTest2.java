package step02_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Reader in = new FileReader("src/step02_file/data2.txt");
		
		int readData;
		while((readData=in.read())!=-1) { //-1: eoc(end of file)
			System.out.print((char)readData);
			Thread.sleep(100);
		}
		
		in.close();
		
//		readData=in.read();
//		System.out.println(readData);
	}

}
