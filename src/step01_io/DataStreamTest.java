package step01_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		//result.txt 파일을 읽어서 file 객체 생성
		FileInputStream file = new FileInputStream("src/step01_io/result.txt");
		DataInputStream dis = new DataInputStream(file);
		
		System.out.println("이름 : "+dis.readUTF());
		System.out.println("나이 : "+dis.readInt());
		System.out.println("신장 : "+dis.readDouble());
		
		System.out.println("이름 : "+dis.readUTF());
		System.out.println("나이 : "+dis.readInt());
		System.out.println("신장 : "+dis.readDouble());
		
		dis.close();
		file.close();
		
//------------------------------2-----------------------------------		
		//파일로 출력
		//예외 발생시 그냥  throw해도 되고 try  catch해도 됨. 사실 throw가 더 간단하긴 함.
//		try {
//			FileOutputStream file=new FileOutputStream("src/step01_io/result.txt");// file객체 생성. 파일 이름 리절트 / 하나 또는 \\ 사용. 상대 경로
//		//저장소에 result.txt이름으로 파일을 생성하고 자바에서 file객체로 처리를 하겠다는 의미.
//		DataOutputStream dos=new DataOutputStream(file);
//		dos.writeUTF("뽀로로");
//		dos.writeInt(23);
//		dos.writeDouble(173.5);
//		
//		dos.writeUTF("크롱");
//		dos.writeInt(20);
//		dos.writeDouble(163.5);
//		//이 데이터 들을 result.txt에 추가하겠다는 의미
//		
//		dos.close();
//		file.close();
//		System.out.println("result.txt 파일이 저장되었습니다.");
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		} 
//-------------------------------1-----------------------------------		
//		FileOutputStream file=new FileOutputStream("src/step01_io/result.txt");// file객체 생성. 파일 이름 리절트 / 하나 또는 \\ 사용. 상대 경로
//		//저장소에 result.txt이름으로 파일을 생성하고 자바에서 file객체로 처리를 하겠다는 의미.
//		DataOutputStream dos=new DataOutputStream(file);
//		
//		dos.writeUTF("뽀로로");
//		dos.writeInt(23);
//		dos.writeDouble(173.5);
//		
//		dos.writeUTF("크롱");
//		dos.writeInt(20);
//		dos.writeDouble(163.5);
//		//이 데이터 들을 result.txt에 추가하겠다는 의미
//		
//		dos.close();
//		file.close();
//		System.out.println("result.txt 파일이 저장되었습니다.");
	
		} 
	}


