package loop;

import java.util.Scanner;

public class WhileLoopTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1, sum = 0, key=0;
		
		while ( true ) {
			System.out.println("원하는 업무를 선택해주세요\n "
					+ "1 : 통장개설, 2 : 잔액조회, 3 : 입금, 4 : 출금 , 5 : 정지");
			key = scanner.nextInt();
			System.out.print(i+"\t");
			
			switch (key) {
			case 1 :  i++; break;
			case 2:return;
			default:break;
			}
		// 	if(i==11){return;}
		}
	
	}
}
