package test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class UserOutputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));// �Է½�Ʈ�� ó��
		
		ObjectOutputStream oos;
		User us;
		
		String name;
		int age;
		double tall;
			
		System.out.println("�Է��� �����Ϸ��� Ctrl+Z�� �Է��Ͻÿ�"); 
		
		do{
			//�����Է� 
			System.out.print("Enter your name : "); name=br.readLine();
			System.out.print("Enter your age : "); age=Integer.parseInt(br.readLine());
			System.out.print("Enter your tall : "); tall=Double.parseDouble(br.readLine());
			
			// ��ü ���� new User(�Ű����� );
			us=new User(name, age, tall);
			// ��ü ���� : ��ü ����ȭ writeObject()
			try {
				oos= new ObjectOutputStream(new FileOutputStream("src/test4/user.txt",false));
				oos.writeObject(us);//������Ʈ ó���ϴ°Ŵ� ������Ʈ��
				
				System.out.println("��ü �������Ⱑ �����߽��ϴ�");
				oos.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("��� �Է��Ϸ��� EnterŰ�� �����ÿ�");
			System.in.read(); //---->����
			}while(System.in.read()!=-1); {
		System.out.println("\nuser.txt ������ ����Ǿ����ϴ�");
		}
			System.out.println(us.toString());
			
	
	
	}

}
