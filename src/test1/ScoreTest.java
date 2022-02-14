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
		//한줄단위로 읽는 애 사용해야함.
//		InputStreamReader isr = new FileReader("src\\test1\\score.txt");
//		BufferedReader br = new BufferedReader(isr);
//		
//		String name=br.readLine();
//		int kor=Integer.parseInt(name);
//		int eng=Integer.parseInt(name);
//		int mat=Integer.parseInt(name);
//		double tot=(double)(kor+eng+mat);
//		double avg= tot/3.0;
//		
//		while(true) {
//			if((name==null)){
//			
//		System.out.println(name);
//			}
//			
//		}
//		
		 File file=new File("src\\test1\\score.txt");
	      BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
	      
	      String str;
	      int kor,eng,mat;
	      byte[] buffer=new byte[(int) file.length()];
	      
	      bis.read(buffer, 0, 6);
	      bis.read(buffer, 6, 6);
	      bis.read(buffer, 7, 7);
	      
//	      bis.read(buffer, 8, 8);
	      
//	      bis.read(buffer, 0, buffer.length);
	      System.out.println(new String(buffer));
//	      System.out.println((a+b+c)/2);
	      
	      bis.close();

	}

}
