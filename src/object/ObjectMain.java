package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) {
		UserInfo ob1=new UserInfo("민들래", 20, 89.5);
		UserInfo ob2=new UserInfo("진달래", 22, 73.4);
		
		//객체 직렬화: 인스턴스화가 되어있는 애를 내보내는 것. 구조는 그냥 주고 받아라
		//메모리에서만 동작하던 객첵를 파일의 형식으로 저장할 수 있게됨. 이렇게 파일 형이 된것을 다른곳에 보내주거나 팀 프로젝트에서 사용가능.
		// 이 객체는 어떤 정보를 가지고 있는가?-> UserInfo 정보는 당연히 가지고 있고 객체생성 시점에 위의 민들래 값을 객체 user.txt가 같게 된다.
		ObjectOutputStream oos;
		
		try {
			oos= new ObjectOutputStream(new FileOutputStream("storage/user.txt",false));
			oos.writeObject(ob1);//오브젝트 처리하는거니 오브젝트로
			oos.writeObject(ob2);
			System.out.println("객체 내보내기가 성공했습니다");
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//---------------------객체 역직렬화----------------------
//		try {
//			ObjectInputStream ois=
//					new ObjectInputStream(new FileInputStream("storage/user.txt"));
//			
//			//객체를 정상적으로 읽어들이는 과정 필요
//			UserInfo ui1=(UserInfo)ois.readObject(); //형변환 필요
//			UserInfo ui2=(UserInfo)ois.readObject();
//			System.out.println("객체 불러오기가 성공하였씁니다");
//			
//			ui1.disp();
//			ui2.disp();
//			
//			ois.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
