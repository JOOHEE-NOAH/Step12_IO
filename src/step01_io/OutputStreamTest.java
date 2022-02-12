package step01_io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(System.out); //System.out 콘솔로 출력 //속도 느림
		BufferedWriter bw=new BufferedWriter(osw);
		
		String str="자바 IO 학습중...";
		bw.write(str); //익셉션 발생할수도 있으니 던지기 처리
		bw.flush();//스트림에 대해 밀어내기 작업
		
		bw.close();// 버퍼비우기
		osw.close();
	}

}
