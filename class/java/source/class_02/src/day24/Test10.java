package day24;
/*
 	"src/day24/wTest/doutTest.txt"
 	의 파일을 읽어보자.
 	DataOutputStream을 사용해서 저장했으니
 	반드시 읽ㄴ을 때도 DataInputStream을 사용해서 읽어야 하고
 	저장한 순서와 같게 읽는 순서도 결정이 된다.
 	
 */
import java.io.*;
public class Test10 {

	public Test10() {
		//타겟 스트림 준비
		FileInputStream fin = null;
		//필터 스트림 준비
		DataInputStream din = null;
		
		try {
			//스트림 만들고
			fin = new FileInputStream("src/day24/wTest/doutTest.txt");
			din = new DataInputStream(fin);
			
			// 저장할때 이름 , 나이, 신장, 성별, 전화, 메일 순으로 저장했으니
			// 꺼낼때도 같은 순서로꺼내야 한다.
			String name = din.readUTF();
			int age = din.readInt();
			double height = din.readDouble();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			//출력한다
			System.out.printf("이름 : %-6s, 나이 : %2d, 신장 : %5.2f, \n성별 : %c, 전화번호 : %13s, 메일 : %s", name,age,height,gen,tel,mail);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				din.close();
				fin.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
