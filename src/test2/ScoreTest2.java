package test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ScoreTest2 {
	public static void main(String[] args) throws IOException {	
		BufferedReader reader=null;
		PrintWriter writer=null;
		
		//���ڴ����� ���� �� �ִ� ���۵� �������
		reader = new BufferedReader(new FileReader("src/test2/source.txt")); //���� ����: ���� ��θ� ������ ã��
	//	writer= new PrintWriter (new FileReader("src/test2/score.txt"));
		writer=new PrintWriter("src/test2/desc.txt");
		
		//�ٹٲ��� �Ͼ�� ������
		String name;
		int k, e, m;
		
		while(true) {	//�ݺ�����
				name=reader.readLine();
//				System.out.println(name);
				if(name==null)
					break;
				k=Integer.parseInt(reader.readLine()); //���ڿ��� ���ڷ� ó��
				e=Integer.parseInt(reader.readLine());
				m=Integer.parseInt(reader.readLine());// br.readline�ϸ� ���״�� �ٸ��� ����..
				
				
				//��� 
				writer.printf("�̸� : %s\t���� : %d\t��� : %.2f\n",name,(k+e+m),(double)(k+e+m)/3);
				writer.flush(); //���� ����
		}
		reader.close();
		writer.close();
		
	
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
