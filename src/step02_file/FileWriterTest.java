package step02_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
	//	File file = new File("C:\\java\\java_joohee195\\step12_IO\\storage\\data3.txt");//������
	//	File file = new File("C:/java/java_joohee195/step12_IO/storage/data3.txt");//������
		File file = new File("storage/data3.txt");//�����-->���ʿ� ������ ���ָ� �ȵ�.
	
	//=	FileWriter writer=new FileWriter(file);
		Writer writer=new FileWriter(file);
		
	//	�� â���� ���� �������� �湮 ��Ͽ� ��Ÿ���� ������,
	//	���� �ִ� ��� �Խ�Ʈ â�� ���� �� ��Ű��
	//	���� �ٸ� ������ ��ǻ�Ϳ� ������ �ʽ��ϴ�. 
	//	������ �ٿ�ε��� ������ ��� ����˴ϴ�.
		StringBuilder str=new StringBuilder();
		str.append("�� â���� ���� �������� �湮 ��Ͽ� ��Ÿ���� ������,\n");//-->���� �߰��ϰ����ϴ� ���ڿ�
		str.append("���� �ִ� ��� �Խ�Ʈ â�� ���� �� ��Ű��\n");
		str.append("���� �ٸ� ������ ��ǻ�Ϳ� ������ �ʽ��ϴ�.\n");
		str.append("������ �ٿ�ε��� ������ ��� ����˴ϴ�.\n");
		
		writer.write(str.toString());//-->write�� string �Ǵ� int�� �ν��ϱ⶧���� toString���ش�. �ƴϸ� �ؿ�ó�� �׳� ���ϴ� ���ڿ� �־ �ȴ�.
//	=	writer.write("�� â���� ���� �������� �湮 ��Ͽ� ��Ÿ���� ������,"
//				+ " ���� �ִ� ��� �Խ�Ʈ â�� ���� �� ��Ű��"
//				+ " ���� �ٸ� ������ ��ǻ�Ϳ� ������ �ʽ��ϴ�. "
//				+ "������ �ٿ�ε��� ������ ��� ����˴ϴ�.");
				
				writer.flush();
				writer.close();
				System.out.println("data3.txt�� ����Ǿ����ϴ�");
	}

}
