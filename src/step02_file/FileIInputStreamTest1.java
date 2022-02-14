package step02_file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIInputStreamTest1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		//----------3------------------BufferedReader 줄단위 읽기
		InputStreamReader isr = new FileReader("src/step02_file/data1.txt");
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		while ((str=br.readLine())!=null) {
			System.out.println(str); //엔터 만날때 까지 줄단위로 읽어들이기 때문에 BufferedReader가 더 빠름.
			Thread.sleep(100); // 100/1000초라는 의미
		}
		br.close();
		isr.close();
		
		
		
		//----------2------------------------InputStreamReader 문자단위로 읽기
//		InputStreamReader isr = new FileReader("src/step02_file/data1.txt");
//		//InputStreamReader: 문자 단위의 읽기
//		
//		int readData;
//		while(true) {
//			readData=isr.read(); // 바이트 단위의 읽기 수행, 한글이 깨지지 않고 잘 보임.
//			if(readData==-1)	// -1: 데이터의 끝을 의미
//				break;
//			System.out.print((char)readData); //정수로 저장해 두었다가 문자로 처리하기 때문에 앞에 (char). String 이 아니다.
//		Thread.sleep(100);
//		 }
//		
//			isr.close();
		
		
//-----------------------1----------------------------InputStream  바이트 단위 읽기
//		InputStream is = new FileInputStream("src/step02_file/data1.txt");
//		//InputStream: 바이트 단위의 읽기
//		
//		int readData;
//		while(true) {
//			readData=is.read(); // 바이트 단위의 읽기 수행, 한글이 깨져서 보일수 있음.(객체 is가 InputStream이기 때문)
//			if(readData==-1)	// -1: 데이터의 끝을 의미
//				break;
//			System.out.print((char)readData);
//			Thread.sleep(100);
//		 }
//		
//			is.close();
		}

}
