package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) {
		UserInfo ob1=new UserInfo("�ε鷡", 20, 89.5);
		UserInfo ob2=new UserInfo("���޷�", 22, 73.4);
		
		//��ü ����ȭ: �ν��Ͻ�ȭ�� �Ǿ��ִ� �ָ� �������� ��. ������ �׳� �ְ� �޾ƶ�
		//�޸𸮿����� �����ϴ� ��ý�� ������ �������� ������ �� �ְԵ�. �̷��� ���� ���� �Ȱ��� �ٸ����� �����ְų� �� ������Ʈ���� ��밡��.
		// �� ��ü�� � ������ ������ �ִ°�?-> UserInfo ������ �翬�� ������ �ְ� ��ü���� ������ ���� �ε鷡 ���� ��ü user.txt�� ���� �ȴ�.
		ObjectOutputStream oos;
		
		try {
			oos= new ObjectOutputStream(new FileOutputStream("storage/user.txt",false));
			oos.writeObject(ob1);//������Ʈ ó���ϴ°Ŵ� ������Ʈ��
			oos.writeObject(ob2);
			System.out.println("��ü �������Ⱑ �����߽��ϴ�");
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//---------------------��ü ������ȭ----------------------
//		try {
//			ObjectInputStream ois=
//					new ObjectInputStream(new FileInputStream("storage/user.txt"));
//			
//			//��ü�� ���������� �о���̴� ���� �ʿ�
//			UserInfo ui1=(UserInfo)ois.readObject(); //����ȯ �ʿ�
//			UserInfo ui2=(UserInfo)ois.readObject();
//			System.out.println("��ü �ҷ����Ⱑ �����Ͽ����ϴ�");
//			
//			ui1.disp();
//			ui2.disp();
//			
//			ois.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
