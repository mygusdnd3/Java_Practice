package day03;

import java.util.Scanner;

/*
 * 	문제 6] - 사망연산자
 * 		게시물을 게시판에 붙이는데
 * 		하나의게시판에는 게시물을 15개를  붙일 수 있다.
 * 		하나의 게시물 갯수를 랜덤하게 입력한 후 (Scanner 이용)
 * 		몇개의 게시판이 필요한지 계산해서 출력하는 
 * 		프로그램을 작성하시오
 */
public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//if
		System.out.print("게시할 게시물 수를 입력하세요 : ");
		int getBoard = sc.nextInt();
		
		//int getBoard = 58;
		int canBoard = 15;
		int chkBoard = 1 ;
		//int chkBoard=0;
		//삼항은 true false
		int temp =0;
		//15개 게시판씩 들어간다. 받은 인자로 몇개의 게시판이 필요한지
					//	()?():()
		 //chkBoard =((getBoard>0)&&(getBoard>=15))?(++chkBoard):(chkBoard=1));
		 //int chk =(getBoard>0)?(getBoard>=15)?(getBoard%canBoard):(chkBoard=1):(chkBoard=0);
		 int tmp = (getBoard>0)?((getBoard>15)?(getBoard>canBoard)?(chkBoard = ( getBoard%canBoard)+1):(1):(1)):(chkBoard=0);
	//	int tmp2 = (getBoard>0)?(getBoard>=15)?(chkBoard = ( getBoard%canBoard)+1):(1):(0);
				//int tmp2 = (getBoard>0)?(getBoard>=15)?(chkBoard = ( getBoard%canBoard)+1):(1"2번x"):(1번x)
		 
		 System.out.printf("입력한 값 [%d] 필요 게시판 수 [%d]",getBoard,tmp2);
		 
//		 if(getBoard>0) {
//		 if(getboard>=15) {
//		 }
//		 if(getBoard %canBoard!=0) {
//			 chkBoard = (getBoard %canBoard)+1;
//		 }
//			 else {
//				 chkBoard +=1;
//			 }
//		 
//		 }
	}
}
