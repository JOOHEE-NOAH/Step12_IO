package step02_file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileReaderTest {

   public static void main(String[] args) throws IOException {
      // data3.txt�� �о ����ϼ���
	//------------Ǯ�� 2---------------------------   
//	   File file = new File("storage/data3.txt");
//	   BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
//	   
//	   byte[] buffer=new byte[(int)file.length()]; // data3�� ����µ� �ʿ��� �������� ũ�⸦ file�� ���̷� ����. //�迭������ �����ϴ� ��.
//	   
//	   bis.read(buffer, 0, buffer.length); // ���: offset �󸶸�ŭ �� ����Ұ��ΰ�? (����)// ����°: ������? (���⼱ ������)
//	   System.out.println(String.valueOf(buffer));
//	   
//	   bis.close();
	   
  //-------------------Ǯ��1----------------------------    
//	   File file = new File("storage/data3.txt");
//	   Reader reader = new FileReader(file); 
//	//   Reader reader = new BufferedReader(file); //---> Ÿ���� �ȸ¾� ���Ұ�
//	//  InputStreamReader reader = new FileReader("storage/data3.txt"); //���� ���� ���� �̰� ���� ��� ����.
//	   
//	   int readData;
//	   while((readData=reader.read())!=-1){
//		   System.out.print((char)readData);
//	   }
//	   reader.close();
	   
	   
//	--------�����Ѱ�-------   
//       Reader in=new FileReader("storage/data3.txt");
//       
//       int readData;
//       while((readData=in.read())!=-1) {    
//            System.out.print((char)readData);
//         }
//      
//   
//      in.close();
   }

}
