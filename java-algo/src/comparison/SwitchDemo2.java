package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchDemo.java 
 * @author    : 박준규
 * @date      : 2015. 9. 17.
 * @story     : 스위치 문법
 */
public class SwitchDemo2 {
	public static void main(String[] args) {
		/**
		 * 월을 입력하면 해당 월이 몇일까지인지
		 * 알려주는 프로그램을 작성하시오.
		 * 단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
		 * 출력문장 : "??월은 **일 까지 입니다."
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = scanner.nextInt();
		String res = null; // 지역변수는 반드시 초기화를 해 주어야 한다.
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12: 
			res = "31";break;
		case 4:case 6:case 9:case 11:
			res = "30";break;
		case 2:res = "29";break;
		default:
			System.out.println(month+"월은 없습니다."); return;
		}
		System.out.println(month+"월은 "+res+"일 입니다.");
	}
}














































































	