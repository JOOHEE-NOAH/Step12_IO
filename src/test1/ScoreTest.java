package test1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ScoreTest {

	public static void main(String[] args) throws IOException {	
		//���ڴ����� ���� �� �ִ� ���۵� �������
		BufferedReader br = new BufferedReader(new FileReader("src/test1/score.txt")); //���� ����: ���� ��θ� ������ ã��
		
		//�ٹٲ��� �Ͼ�� ������
		String name;
		int k, e, m;
		
		while(true) {	//�ݺ�����
				name=br.readLine();
				if(name==null)
					break;
				k=Integer.parseInt(br.readLine()); //���ڿ��� ���ڷ� ó��
				e=Integer.parseInt(br.readLine());
				m=Integer.parseInt(br.readLine());// br.readline�ϸ� ���״�� �ٸ��� ����..;;;;
				
				System.out.print("�̸� : "+name);
				System.out.print("\t���� : "+(k+e+m));
				System.out.printf("\t��� : %.2f\n",(double)(k+e+m)/3);
		}
	
		//==============Ǯ�� 1================
//		while((name=br.readLine())!=null) {	//�ݺ�����
//		k=Integer.parseInt(br.readLine()); //���ڿ��� ���ڷ� ó��
//		e=Integer.parseInt(br.readLine());
//		m=Integer.parseInt(br.readLine());
//		
//		System.out.print("�̸� : "+name);
//		System.out.print("\t���� : "+(k+e+m));
//		System.out.printf("\t��� : %.2f\n",(double)(k+e+m)/3);
//	
	

		

	}

}
