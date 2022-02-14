package step02_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
	//	File file = new File("C:\\java\\java_joohee195\\step12_IO\\storage\\data3.txt");//절대경로
	//	File file = new File("C:/java/java_joohee195/step12_IO/storage/data3.txt");//절대경로
		File file = new File("storage/data3.txt");//상대경로-->앞쪽에 슬래시 해주면 안됨.
	
	//=	FileWriter writer=new FileWriter(file);
		Writer writer=new FileWriter(file);
		
	//	이 창에서 보는 페이지는 방문 기록에 나타나지 않으며,
	//	열려 있는 모든 게스트 창을 닫은 후 쿠키와
	//	같은 다른 흔적을 컴퓨터에 남기지 않습니다. 
	//	하지만 다운로드한 파일은 모두 저장됩니다.
		StringBuilder str=new StringBuilder();
		str.append("이 창에서 보는 페이지는 방문 기록에 나타나지 않으며,\n");//-->내가 추가하고자하는 문자열
		str.append("열려 있는 모든 게스트 창을 닫은 후 쿠키와\n");
		str.append("같은 다른 흔적을 컴퓨터에 남기지 않습니다.\n");
		str.append("하지만 다운로드한 파일은 모두 저장됩니다.\n");
		
		writer.write(str.toString());//-->write이 string 또는 int만 인식하기때문에 toString해준다. 아니면 밑에처럼 그냥 원하는 문자열 넣어도 된다.
//	=	writer.write("이 창에서 보는 페이지는 방문 기록에 나타나지 않으며,"
//				+ " 열려 있는 모든 게스트 창을 닫은 후 쿠키와"
//				+ " 같은 다른 흔적을 컴퓨터에 남기지 않습니다. "
//				+ "하지만 다운로드한 파일은 모두 저장됩니다.");
				
				writer.flush();
				writer.close();
				System.out.println("data3.txt로 저장되었습니다");
	}

}
