package step02_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("src/step02_file/data1.txt"); //out객체 생성
		
		String name="뽀로로";
		int age=25;
		double tall=183.4;
		
		out.write(name.getBytes()); //name 변수의 값을 byte 형태로 변환해서 리턴
		out.write(Integer.toString(age).getBytes());// 정수-> 문자열로 바꿔서 리턴 해줘야함.
		out.write(Double.toString(tall).getBytes());// 더블-> 문자열로 바꿔서 리턴
		
		//출력 byte stream filtering
		PrintStream ps = new PrintStream(out); //객체 out이 옴. out:12번 라인의 파일로 출력하겠다는 의미
		//System.out : 모니터 출력
		ps.printf("\n\n\r이름 : %s   나이 : %d   신장 : %.2f",name,age,tall);
		
		//출력 character stream filtering
		PrintWriter pw=new PrintWriter(out);
		pw.printf("\n\n\r이름 : %s   나이 : %d   신장 : %.2f",name,age,tall); //이것 까지만 하면 출력안됨
		pw.flush(); // ->PrintWriter은 이거까지 해야 출력됨./ 버퍼 비우기, 운영체제에 요청, 반드시 기록된다고 보장하지는 않음
		
		//close() 작업을 통해 버퍼비우기가 가능
		pw.close();
		ps.close();
		out.close();
		
		
		System.out.println("data1.txt로 저장되었습니다");
	}

}
