package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopTenSum.java
 * @author : coolbeat@naver.com
 * @date : 2015. 9. 21.
 * @story : 등차수열 입력한 값과 값사이의 요소의 합 구하기
 */
public class ForLoopSum {
	/**
	 * To. 개발자님 교수님이 원하는 숫 부터 원하는 숫자까지 합 구하는 프로그램이 필요하답니다. 그런데, 교수님이 까다로와서 큰 수를
	 * 먼저 입력하든 나중에 입력하든 두 수 사이의 정수들의 합을 나오게 해달랍니다. [결과] 5 부터 137 까지의 합은 ????
	 * 입니다.
	 */
	// 기존 변수에 값을 누적시키는 연산자 += , 감소시키는 연산자 -=
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input1 = 0, input2 = 0, sum = 0, small = 0, big = 0;
		System.out.println("원하는 숫자를 입력");
		input1 = scanner.nextInt();
		input2 = scanner.nextInt();
		// 숫자 사이의 서열 정리
		if (input1 < input2) {
			small = input1;
			big = input2;
		} else {
			small = input2;
			big = input1;
		} 
		for (int i = small; i <= big; i++) { // 이 문제에서는 limit 값까지의 합이니까
			sum += i;
		}
		System.out.println(small + "부터" + big + "까지의 합:" + sum);
	}
}
