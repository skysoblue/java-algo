package comparison;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @file_name : StaticCalc.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 18.
 * @story     : 스태틱으로 만든 사칙연산 계산기
 */
public class StaticCalcMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요 :");
		System.out.println(StaticCalc.minus(scanner.nextInt(), scanner.nextInt()));
	}
}

class StaticCalc{
	static int result = 0; // 멤버변수 중에서 클래스 변수
	public static int plus(int a, int b){  // 매개변수 = 파라미터 = 매변, 다만 파라미터는 초기화할 필요가 없다
		return a + b;
	}
	public static int minus(int a, int b){  // 매개변수 = 파라미터 = 매변, 다만 파라미터는 초기화할 필요가 없다
		return a - b;
	}
	public static int multi(int a, int b){  // 매개변수 = 파라미터 = 매변, 다만 파라미터는 초기화할 필요가 없다
		return a * b;
	}
	public static int divide(int a, int b){  // 매개변수 = 파라미터 = 매변, 다만 파라미터는 초기화할 필요가 없다
		return a / b;
	}
}













