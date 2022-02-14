package step02_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("src/step02_file/data2.txt");
		
		int readData;
		System.out.println("문자열을 입력하고 마지막 줄에서 Ctrl+Z로 종료하세요 "); //->한번만 동작
	//	System.out.println(readData);
		// a를 입력하면 97이라는 수가 뜸.
		
		while((readData=System.in.read())!=-1){//키보드에 입력한 값을 읽어들여서 숫자형 변수로 변환.
			out.write(readData);
			}
		 System.out.println();
		System.out.println("data2.txt로 저장 되었습니다");
	//	System.out.println((char)readData); //->숫자를 문자로 변형
		
		out.flush(); //버퍼 비우기
		out.close();
	}

}
