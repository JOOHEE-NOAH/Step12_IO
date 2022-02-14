package step02_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("src/step02_file/data1.txt"); //out��ü ����
		
		String name="�Ƿη�";
		int age=25;
		double tall=183.4;
		
		out.write(name.getBytes()); //name ������ ���� byte ���·� ��ȯ�ؼ� ����
		out.write(Integer.toString(age).getBytes());// ����-> ���ڿ��� �ٲ㼭 ���� �������.
		out.write(Double.toString(tall).getBytes());// ����-> ���ڿ��� �ٲ㼭 ����
		
		//��� byte stream filtering
		PrintStream ps = new PrintStream(out); //��ü out�� ��. out:12�� ������ ���Ϸ� ����ϰڴٴ� �ǹ�
		//System.out : ����� ���
		ps.printf("\n\n\r�̸� : %s   ���� : %d   ���� : %.2f",name,age,tall);
		
		//��� character stream filtering
		PrintWriter pw=new PrintWriter(out);
		pw.printf("\n\n\r�̸� : %s   ���� : %d   ���� : %.2f",name,age,tall); //�̰� ������ �ϸ� ��¾ȵ�
		pw.flush(); // ->PrintWriter�� �̰ű��� �ؾ� ��µ�./ ���� ����, �ü���� ��û, �ݵ�� ��ϵȴٰ� ���������� ����
		
		//close() �۾��� ���� ���ۺ��Ⱑ ����
		pw.close();
		ps.close();
		out.close();
		
		
		System.out.println("data1.txt�� ����Ǿ����ϴ�");
	}

}
