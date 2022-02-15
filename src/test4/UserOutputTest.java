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

	public static void main(String[] args)  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int age;
		double tall;
		
		System.out.println("�Է��� �����Ϸ��� Ctrl+Z�� �Է��Ͻÿ�");
		
		//�����Է�
		
		 try {
			 ObjectOutputStream oos= new ObjectOutputStream( new FileOutputStream("src/test4/user.txt",true));// true:append���
			 	
			 do {
			 System.out.print("Enter your name : ");
					name=br.readLine();
				System.out.print("Enter your age : ");
					age=Integer.parseInt(br.readLine());
				System.out.print("Enter your tall : "); 
					tall=Double.parseDouble(br.readLine());
				
					
			//����ȭ �� // ��ü ����		
			oos.writeObject(new User(name,age,tall));
			System.out.println("��� �Է��Ϸ��� EnterŰ�� �����ÿ�");
//			System.in.read(); //---->����
			// }while(System.in.read()!=-1); //���� �ƴҵ���
			 }while(br.readLine()!=null);
			System.out.println("\nuser.txt ������ ����Ǿ����ϴ�");
			oos.flush();
			oos.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���ϳ��Ŀ��");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���̿��ͼ���");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		 
	}
}		
		
		
//		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));// �Է½�Ʈ�� ó��
//		
//		ObjectOutputStream oos;
//		User us;
//		
//		String name;
//		int age;
//		double tall;
//			
//		System.out.println("�Է��� �����Ϸ��� Ctrl+Z�� �Է��Ͻÿ�"); 
//		
//		do{
//			//1.�����Է� 
//			System.out.print("Enter your name : "); name=br.readLine();
//			System.out.print("Enter your age : "); age=Integer.parseInt(br.readLine());
//			System.out.print("Enter your tall : "); tall=Double.parseDouble(br.readLine());
//			
//			// 2.��ü ���� new User(�Ű����� );
//			us=new User(name, age, tall);
//			// 3.��ü ���� : ��ü ����ȭ writeObject()
//			try {
//				oos= new ObjectOutputStream(new FileOutputStream("src/test4/user.txt",false));
//				oos.writeObject(us);//������Ʈ ó���ϴ°Ŵ� ������Ʈ��
//				
//				System.out.println("��ü �������Ⱑ �����߽��ϴ�");
//				oos.close();
//				
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			System.out.println("��� �Է��Ϸ��� EnterŰ�� �����ÿ�");
//			System.in.read(); //---->����
//			}while(System.in.read()!=-1); {
//		System.out.println("\nuser.txt ������ ����Ǿ����ϴ�");
//		}
//			System.out.println(us.toString());
//			
	
//	
//	}
//	}

