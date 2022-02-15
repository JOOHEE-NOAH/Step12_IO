package object;

import java.io.Serializable;

import org.w3c.dom.ls.LSSerializer;

//객체 직렬화: 객체를 메모리상에 저장하는게 아니라 파일에 저장해 필요할 때 사용하게 하는 방식
public class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //자료형 자동으로 롱형 꼭 버전 맞춰주기
	private String name;
	private int age;
	private double score;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
		
	}

	public UserInfo(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}	
	public void disp() {
		System.out.print("이름 : "+name);
		System.out.print("\t나이 : "+age);
		System.out.println("\t점수 : "+score);
	}
	
		
}
