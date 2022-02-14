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
      // data3.txt를 읽어서 출력하세요
	//------------풀이 2---------------------------   
//	   File file = new File("storage/data3.txt");
//	   BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
//	   
//	   byte[] buffer=new byte[(int)file.length()]; // data3을 만드는데 필요한 데이터의 크기를 file의 길이로 구함. //배열공간을 선언하는 것.
//	   
//	   bis.read(buffer, 0, buffer.length); // 가운데: offset 얼마만큼 띄어서 사용할것인가? (간격)// 세번째: 어디까지? (여기선 끝까지)
//	   System.out.println(String.valueOf(buffer));
//	   
//	   bis.close();
	   
  //-------------------풀이1----------------------------    
//	   File file = new File("storage/data3.txt");
//	   Reader reader = new FileReader(file); 
//	//   Reader reader = new BufferedReader(file); //---> 타입이 안맞아 사용불가
//	//  InputStreamReader reader = new FileReader("storage/data3.txt"); //맨위 두줄 말고 이거 한줄 사용 가능.
//	   
//	   int readData;
//	   while((readData=reader.read())!=-1){
//		   System.out.print((char)readData);
//	   }
//	   reader.close();
	   
	   
//	--------내가한거-------   
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
