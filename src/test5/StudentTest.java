package test5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentTest {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public StudentTest() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentTest(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		 FileReader fr = new FileReader("src/test5/student.dat");
         FileWriter fw = new FileWriter("src/test5/backup.dat", true);
         Scanner sfi = new Scanner(fr);
         Reader reader = new FileReader("src/test5/student.dat");
 		BufferedReader br=new BufferedReader(reader);
         
         String name;
     	 int kor;
     	 int eng;
     	 int mat;
		
         while (sfi.hasNextLine() == true) { // End of File
             /* 코드  작성*/
         }
		
		
		StringTokenizer st=null;
		String str=null;
		
		while((str=br.readLine())!=null) {
		
		st=new StringTokenizer(str, "-국어:/영어:/수학:\n");
		name=st.nextToken();
		kor=Integer.parseInt(st.nextToken());
		eng=Integer.parseInt(st.nextToken());
		mat=Integer.parseInt(st.nextToken());
		
		}
		System.out.println(tokens.);
		br.close();
	}

}
