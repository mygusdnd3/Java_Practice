package day24;

import java.io.*;

/*
  1. D:\\fileTest
  		폴더를 강제로 만들자.
  		
  2. D:\\day24\\fileTest
  		폴더를 강제로 만들자.
  3. 만들어진 파일중 하나를 삭제한다.
  	(delete() - 파일과 폴더 모두 삭제가 가능)
 
 */
public class Test01 {

	public Test01() {
		/*
		//만들고 싶은 폴더를 파일로 만든다.
		//1.
		//1-1 파일 만든다.
		File file = new File("D:\\fileTest");
		//1-2. 만들어진 파일을 이용해서 폴더를 만든다.
		file.mkdir();
		*/
		/*
		//2. 계층폴더 만들기
		File file = new File("D:\\day24\\fileTest");
		//file.mkdir()	//day24폴더가 존재 하지 않으므로 만들어지지 못한다. 
		file.mkdirs();
		*/
		//3. 폴더 삭제
		// - 삭제할 파일을 File로 만든다. (존재해야 지울 수 있기 때문에)
		
		/*boolean bool = true;
		int a = 0;
		while(bool) {
		File file = new File("D:\\fileTest");
		File file2 = new File("D:\\day24\\fileTest\\tt.txt");
		file.mkdir();
		file2.mkdirs();
		file.delete();
		file2.delete();
		a++;
		if(a==10000000) {
			bool=false;
		}
		}
		*/
		// 4. 특정 파일의 이름을 다른이름으로 변경하자
		File oldf = new File("D:\\day24\\fileTest");
		File newf = new File("D:\\day24\\fTest");
		// 4-2 바꾼다.(renameTo());
		oldf.renameTo(newf);
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
