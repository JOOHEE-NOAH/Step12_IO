package test1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ScoreTest {

	public static void main(String[] args) throws IOException {	
		//문자단위로 읽을 수 있느 버퍼드 리더사용
		BufferedReader br = new BufferedReader(new FileReader("src/test1/score.txt")); //파일 리더: 직접 경로를 지정해 찾기
		
		//줄바꿈이 일어나는 시점에
		String name;
		int k, e, m;
		
		while(true) {	//반복루프
				name=br.readLine();
				if(name==null)
					break;
				k=Integer.parseInt(br.readLine()); //문자열을 숫자로 처리
				e=Integer.parseInt(br.readLine());
				m=Integer.parseInt(br.readLine());// br.readline하면 말그대로 줄마다 읽음..;;;;
				
				System.out.print("이름 : "+name);
				System.out.print("\t총점 : "+(k+e+m));
				System.out.printf("\t평균 : %.2f\n",(double)(k+e+m)/3);
		}
	
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
