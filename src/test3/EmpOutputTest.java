package test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class EmpOutputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));// �Է½�Ʈ�� ó��
		//��½�Ʈ�� ó��
//		OutputStream os= new FileOutputStream("src/test3/emp.txt");
//		FileWriter os= new FileWriter("src/test3/emp.txt"); //������ ����
//		FileWriter os=new FileWriter("src/test3/emp.txt",true); //�������Ͽ� �߰�
		FileWriter os=new FileWriter(new File("src/test3/emp.txt"),true); //�������Ͽ� �߰�
//		PrintWriter pw=new PrintWriter(os); //print() , write() ��밡��
		BufferedWriter pw=new BufferedWriter(os); //write()�� ��밡��
		
		String name;
		String dept;
		int salary;
			
		System.out.println("�Է��� �����Ϸ��� Ctrl+Z�� �Է��Ͻÿ�"); 
		
		do {
		System.out.print("�̸��� �Է��Ͻÿ� : "); name=br.readLine();
		System.out.print("�μ��� �Է��Ͻÿ� : "); dept=br.readLine();
		System.out.print("�޿��� �Է��Ͻÿ� : "); salary=Integer.parseInt(br.readLine());
		
		pw.write(name+"\t"+dept+"\t"+salary+"\n"); //��¹� //pw.print�ε� ����.
		pw.flush();
		System.out.println("��� �Է��Ϸ��� EnterŰ�� �����ÿ�");
		}while(br.readLine()!=null);
		
		pw.close();
		System.out.println("emp.txt ������ ����Ǿ����ϴ�");
		
		
	
	}

}
