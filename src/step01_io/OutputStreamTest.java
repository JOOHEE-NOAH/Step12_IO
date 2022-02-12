package step01_io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(System.out); //System.out �ַܼ� ��� //�ӵ� ����
		BufferedWriter bw=new BufferedWriter(osw);
		
		String str="�ڹ� IO �н���...";
		bw.write(str); //�ͼ��� �߻��Ҽ��� ������ ������ ó��
		bw.flush();//��Ʈ���� ���� �о�� �۾�
		
		bw.close();// ���ۺ���
		osw.close();
	}

}
