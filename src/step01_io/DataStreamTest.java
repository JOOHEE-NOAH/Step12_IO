package step01_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		//result.txt ������ �о file ��ü ����
		FileInputStream file = new FileInputStream("src/step01_io/result.txt");
		DataInputStream dis = new DataInputStream(file);
		
		System.out.println("�̸� : "+dis.readUTF());
		System.out.println("���� : "+dis.readInt());
		System.out.println("���� : "+dis.readDouble());
		
		System.out.println("�̸� : "+dis.readUTF());
		System.out.println("���� : "+dis.readInt());
		System.out.println("���� : "+dis.readDouble());
		
		dis.close();
		file.close();
		
//------------------------------2-----------------------------------		
		//���Ϸ� ���
		//���� �߻��� �׳�  throw�ص� �ǰ� try  catch�ص� ��. ��� throw�� �� �����ϱ� ��.
//		try {
//			FileOutputStream file=new FileOutputStream("src/step01_io/result.txt");// file��ü ����. ���� �̸� ����Ʈ / �ϳ� �Ǵ� \\ ���. ��� ���
//		//����ҿ� result.txt�̸����� ������ �����ϰ� �ڹٿ��� file��ü�� ó���� �ϰڴٴ� �ǹ�.
//		DataOutputStream dos=new DataOutputStream(file);
//		dos.writeUTF("�Ƿη�");
//		dos.writeInt(23);
//		dos.writeDouble(173.5);
//		
//		dos.writeUTF("ũ��");
//		dos.writeInt(20);
//		dos.writeDouble(163.5);
//		//�� ������ ���� result.txt�� �߰��ϰڴٴ� �ǹ�
//		
//		dos.close();
//		file.close();
//		System.out.println("result.txt ������ ����Ǿ����ϴ�.");
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		} 
//-------------------------------1-----------------------------------		
//		FileOutputStream file=new FileOutputStream("src/step01_io/result.txt");// file��ü ����. ���� �̸� ����Ʈ / �ϳ� �Ǵ� \\ ���. ��� ���
//		//����ҿ� result.txt�̸����� ������ �����ϰ� �ڹٿ��� file��ü�� ó���� �ϰڴٴ� �ǹ�.
//		DataOutputStream dos=new DataOutputStream(file);
//		
//		dos.writeUTF("�Ƿη�");
//		dos.writeInt(23);
//		dos.writeDouble(173.5);
//		
//		dos.writeUTF("ũ��");
//		dos.writeInt(20);
//		dos.writeDouble(163.5);
//		//�� ������ ���� result.txt�� �߰��ϰڴٴ� �ǹ�
//		
//		dos.close();
//		file.close();
//		System.out.println("result.txt ������ ����Ǿ����ϴ�.");
	
		} 
	}


