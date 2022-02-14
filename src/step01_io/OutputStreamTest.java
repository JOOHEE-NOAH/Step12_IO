package step01_io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(System.out); //System.out 콘솔로 출력 //속도 느림
		BufferedWriter bw=new BufferedWriter(osw);
		
		String str="자바 IO 학습중...";
		bw.write(str); //익셉션 발생할수도 있으니 던지기 처리 System.out.printl(); 이거랑 같음. 네트워크 프로그램(채팅)에서는 syso을 사요할 수 없어 그때는 bw사용.
		bw.flush();//스트림에 대해 bw가 osw를 모니터 쪽으로 밀어내기 작업 // 습관적으로 쓰는게 좋음
		
		bw.close();// 버퍼비우기
		osw.close();
	}

}
