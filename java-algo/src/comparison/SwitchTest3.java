package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchTest3.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 18.
 * @story     : 사칙연산 계산기 만들기
 */
public class SwitchTest3 {
	/**
	 * To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
	 * 복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은 
	 * 몫과 나머지값으로 출력하면 된답니다.
	 * 출력결과물은 예를 들어
	 * 5 + 5 = 10 
	 * 2 - 7 = -5
	 * 이렇게 되고,
	 * 10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
	 * 그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다. 
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :");
		int num1 = scanner.nextInt();
		System.out.println("연산자를 입력하세요");
		String opcode = scanner.next();
		System.out.println("숫자를 입력하세요 :");
		int num2 = scanner.nextInt();
		System.out.println(opcode);
		int result = 0;
		int remainder= 0;
		switch (opcode){
		case "+": result = num1+num2; break;
		case "-": result = num1-num2; break;
		case "*": result = num1*num2; break;
		case "/": result = num1/num2; 
			remainder = num1%num2;
			System.out.println(num1+opcode+num2+"="+result+"["+remainder+"]");	
			return;
		default:
			System.out.println("연산자를 다시 입력하시오");
			return;
		}
		System.out.println(num1+opcode+num2+"="+result);
	}
}
