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
		
		System.out.println("입력을 종료하려면 Ctrl+Z를 입력하시오");
		
		//변수입력
		
		 try {
			 ObjectOutputStream oos= new ObjectOutputStream( new FileOutputStream("src/test4/user.txt",true));// true:append허용
			 	
			 do {
			 System.out.print("Enter your name : ");
					name=br.readLine();
				System.out.print("Enter your age : ");
					age=Integer.parseInt(br.readLine());
				System.out.print("Enter your tall : "); 
					tall=Double.parseDouble(br.readLine());
				
					
			//직렬화 및 // 객체 생성		
			oos.writeObject(new User(name,age,tall));
			System.out.println("계속 입력하려면 Enter키를 누르시오");
//			System.in.read(); //---->엔터
			// }while(System.in.read()!=-1); //끝이 아닐동안
			 }while(br.readLine()!=null);
			System.out.println("\nuser.txt 파일이 저장되었습니다");
			oos.flush();
			oos.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일낫파운드");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("아이오익셉션");
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
		
		
//		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));// 입력스트림 처리
//		
//		ObjectOutputStream oos;
//		User us;
//		
//		String name;
//		int age;
//		double tall;
//			
//		System.out.println("입력을 종료하려면 Ctrl+Z를 입력하시오"); 
//		
//		do{
//			//1.변수입력 
//			System.out.print("Enter your name : "); name=br.readLine();
//			System.out.print("Enter your age : "); age=Integer.parseInt(br.readLine());
//			System.out.print("Enter your tall : "); tall=Double.parseDouble(br.readLine());
//			
//			// 2.객체 생성 new User(매개변수 );
//			us=new User(name, age, tall);
//			// 3.객체 쓰기 : 객체 직렬화 writeObject()
//			try {
//				oos= new ObjectOutputStream(new FileOutputStream("src/test4/user.txt",false));
//				oos.writeObject(us);//오브젝트 처리하는거니 오브젝트로
//				
//				System.out.println("객체 내보내기가 성공했습니다");
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
//			System.out.println("계속 입력하려면 Enter키를 누르시오");
//			System.in.read(); //---->엔터
//			}while(System.in.read()!=-1); {
//		System.out.println("\nuser.txt 파일이 저장되었습니다");
//		}
//			System.out.println(us.toString());
//			
	
//	
//	}
//	}

