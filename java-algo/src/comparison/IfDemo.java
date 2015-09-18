package comparison;

import java.util.Scanner;

/**
 * @file_name : IfDemo.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 17.
 * @story     : 단일if문 예제
 */
public class IfDemo {
	public static void main(String[] args) {
		/**
		 *  변수명은 입력한 값은 num, 기준값은 gijun 으로 설정하고..
		 *  컨디션에 따라 
		 *  "입력한 수는 ?? 초과입니다."
		 *  "입력한 수는 ?? 같습니다."
		 *  "입력한 수는 ?? 미만입니다."
		 */
		/**
		 * continue, break(스위치 문에서만 사용), return(스위치 문을 제외한 나머지 구문에서 end)
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("판별하려는 숫자를 입력하세요");
		int num = scanner.nextInt();
		System.out.println("기준값을 입력하세요");
		int gijun = scanner.nextInt();
		if(num > gijun){
			System.out.println(num+"은(는)" +gijun+ "초과입니다.");
		}else if(num == gijun){
			System.out.println(num+"은(는)" +gijun+ "같습니다.");
		}else{
			System.out.println(num+"은(는)" +gijun+ "미만 입니다.");
		}
	}
}




















