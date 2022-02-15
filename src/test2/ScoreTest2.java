package test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ScoreTest2 {
	public static void main(String[] args) throws IOException {	
		BufferedReader reader=null;
		PrintWriter writer=null;
		
		//문자단위로 읽을 수 있느 버퍼드 리더사용
		reader = new BufferedReader(new FileReader("src/test2/source.txt")); //파일 리더: 직접 경로를 지정해 찾기
	//	writer= new PrintWriter (new FileReader("src/test2/score.txt"));
		writer=new PrintWriter("src/test2/desc.txt");
		
		//줄바꿈이 일어나는 시점에
		String name;
		int k, e, m;
		
		while(true) {	//반복루프
				name=reader.readLine();
//				System.out.println(name);
				if(name==null)
					break;
				k=Integer.parseInt(reader.readLine()); //문자열을 숫자로 처리
				e=Integer.parseInt(reader.readLine());
				m=Integer.parseInt(reader.readLine());// br.readline하면 말그대로 줄마다 읽음..
				
				
				//출력 
				writer.printf("이름 : %s\t총점 : %d\t평균 : %.2f\n",name,(k+e+m),(double)(k+e+m)/3);
				writer.flush(); //버퍼 비우기
		}
		reader.close();
		writer.close();
		
	
		//==============풀이 1================
//		while((name=br.readLine())!=null) {	//반복루프
//		k=Integer.parseInt(br.readLine()); //문자열을 숫자로 처리
//		e=Integer.parseInt(br.readLine());
//		m=Integer.parseInt(br.readLine());
//		
//		System.out.print("이름 : "+name);
//		System.out.print("\t총점 : "+(k+e+m));
//		System.out.printf("\t평균 : %.2f\n",(double)(k+e+m)/3);
//	
	


}
}
