package object;

import java.io.Serializable;

import org.w3c.dom.ls.LSSerializer;

//��ü ����ȭ: ��ü�� �޸𸮻� �����ϴ°� �ƴ϶� ���Ͽ� ������ �ʿ��� �� ����ϰ� �ϴ� ���
public class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //�ڷ��� �ڵ����� ���� �� ���� �����ֱ�
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
		System.out.print("�̸� : "+name);
		System.out.print("\t���� : "+age);
		System.out.println("\t���� : "+score);
	}
	
		
}