package test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class EmpOutputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));// 입력스트림 처리
		//출력스트림 처리
//		OutputStream os= new FileOutputStream("src/test3/emp.txt");
//		FileWriter os= new FileWriter("src/test3/emp.txt"); //새파일 생성
//		FileWriter os=new FileWriter("src/test3/emp.txt",true); //기존파일에 추가
		FileWriter os=new FileWriter(new File("src/test3/emp.txt"),true); //기존파일에 추가
//		PrintWriter pw=new PrintWriter(os); //print() , write() 사용가능
		BufferedWriter pw=new BufferedWriter(os); //write()만 사용가능
		
		String name;
		String dept;
		int salary;
			
		System.out.println("입력을 종료하려면 Ctrl+Z를 입력하시오"); 
		
		do {
		System.out.print("이름을 입력하시오 : "); name=br.readLine();
		System.out.print("부서를 입력하시오 : "); dept=br.readLine();
		System.out.print("급여를 입력하시오 : "); salary=Integer.parseInt(br.readLine());
		
		pw.write(name+"\t"+dept+"\t"+salary+"\n"); //출력문 //pw.print로도 가능.
		pw.flush();
		System.out.println("계속 입력하려면 Enter키를 누르시오");
		}while(br.readLine()!=null);
		
		pw.close();
		System.out.println("emp.txt 파일이 저장되었습니다");
		
		
	
	}

}
