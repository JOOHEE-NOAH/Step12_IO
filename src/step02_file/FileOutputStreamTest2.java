package step02_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("src/step02_file/data2.txt");
		
		int readData;
		System.out.println("���ڿ��� �Է��ϰ� ������ �ٿ��� Ctrl+Z�� �����ϼ��� "); //->�ѹ��� ����
	//	System.out.println(readData);
		// a�� �Է��ϸ� 97�̶�� ���� ��.
		
		while((readData=System.in.read())!=-1){//Ű���忡 �Է��� ���� �о�鿩�� ������ ������ ��ȯ.
			out.write(readData);
			}
		 System.out.println();
		System.out.println("data2.txt�� ���� �Ǿ����ϴ�");
	//	System.out.println((char)readData); //->���ڸ� ���ڷ� ����
		
		out.flush(); //���� ����
		out.close();
	}

}
