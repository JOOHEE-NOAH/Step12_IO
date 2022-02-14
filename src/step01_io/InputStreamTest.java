package step01_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("Input String : ");
		String str=br.readLine();
		System.out.println(str);
		
		br.close();
		isr.close();// io프로그램에서는 닫아주는 과정 필요 -경우에 따라 다름. 채팅같은경우는 클로즈 하지 않음. 
	}

}
