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
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));// 입력스트림 처리
		
		ObjectOutputStream oos;
		User us;
		
		String name;
		int age;
		double tall;
			
		System.out.println("입력을 종료하려면 Ctrl+Z를 입력하시오"); 
		
		do{
			//변수입력 
			System.out.print("Enter your name : "); name=br.readLine();
			System.out.print("Enter your age : "); age=Integer.parseInt(br.readLine());
			System.out.print("Enter your tall : "); tall=Double.parseDouble(br.readLine());
			
			// 객체 생성 new User(매개변수 );
			us=new User(name, age, tall);
			// 객체 쓰기 : 객체 직렬화 writeObject()
			try {
				oos= new ObjectOutputStream(new FileOutputStream("src/test4/user.txt",false));
				oos.writeObject(us);//오브젝트 처리하는거니 오브젝트로
				
				System.out.println("객체 내보내기가 성공했습니다");
				oos.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("계속 입력하려면 Enter키를 누르시오");
			System.in.read(); //---->엔터
			}while(System.in.read()!=-1); {
		System.out.println("\nuser.txt 파일이 저장되었습니다");
		}
			System.out.println(us.toString());
			
	
	
	}

}
