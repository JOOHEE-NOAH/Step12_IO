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
		//----------3------------------BufferedReader �ٴ��� �б�
		InputStreamReader isr = new FileReader("src/step02_file/data1.txt");
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		while ((str=br.readLine())!=null) {
			System.out.println(str); //���� ������ ���� �ٴ����� �о���̱� ������ BufferedReader�� �� ����.
			Thread.sleep(100); // 100/1000�ʶ�� �ǹ�
		}
		br.close();
		isr.close();
		
		
		
		//----------2------------------------InputStreamReader ���ڴ����� �б�
//		InputStreamReader isr = new FileReader("src/step02_file/data1.txt");
//		//InputStreamReader: ���� ������ �б�
//		
//		int readData;
//		while(true) {
//			readData=isr.read(); // ����Ʈ ������ �б� ����, �ѱ��� ������ �ʰ� �� ����.
//			if(readData==-1)	// -1: �������� ���� �ǹ�
//				break;
//			System.out.print((char)readData); //������ ������ �ξ��ٰ� ���ڷ� ó���ϱ� ������ �տ� (char). String �� �ƴϴ�.
//		Thread.sleep(100);
//		 }
//		
//			isr.close();
		
		
//-----------------------1----------------------------InputStream  ����Ʈ ���� �б�
//		InputStream is = new FileInputStream("src/step02_file/data1.txt");
//		//InputStream: ����Ʈ ������ �б�
//		
//		int readData;
//		while(true) {
//			readData=is.read(); // ����Ʈ ������ �б� ����, �ѱ��� ������ ���ϼ� ����.(��ü is�� InputStream�̱� ����)
//			if(readData==-1)	// -1: �������� ���� �ǹ�
//				break;
//			System.out.print((char)readData);
//			Thread.sleep(100);
//		 }
//		
//			is.close();
		}

}
