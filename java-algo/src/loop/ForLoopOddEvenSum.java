package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopOddEvenSum.java
 * @author : coolbeat@naver.com
 * @date : 2015. 9. 21.
 * @story : 등차수열 입력한 값과 값사이의 요소의 홀수합, 짝수합 따로 구하기
 */
public class ForLoopOddEvenSum {
	/**
	 * 입력받은 두개의 수 범위 값 중에서
	 * 짝수의 합, 홀수의 합을 따로 출력하세요.
	 */
	// 기존 변수에 값을 누적시키는 연산자 += , 감소시키는 연산자 -=
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input1 = 0, input2 = 0, oddSum = 0, evenSum = 0,
				small = 0, big = 0,oddSum2 = 0, evenSum2 = 0;
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
			if (i % 2 ==0) { //짝수일때
				evenSum += i;
			}else { // 홀수일때
				oddSum += i;
			}
		}
		
		System.out.println(small + "부터" + big + "까지 짝수의 합:" + evenSum);
		System.out.println(small + "부터" + big + "까지 홀수의 합:" + oddSum);
		
		//======== 또 다른 해결방법(j+=2 로 하면 2씩 증가한다는 문법을 학습하기 위한 풀이

		if (small % 2 ==0) { //짝수일때
			for (int j = small; j <= big; j+=2) {
				evenSum2 += j;
			}
			for (int j = small+1; j <= big; j+=2) {
				oddSum2 += j;
			}
		}else{ // 홀수일때
			for (int j = small; j <= big; j+=2) {
				oddSum2 += j;
			}
			for (int j = small+1; j <= big; j+=2) {
				evenSum2 += j;
			}
		}
		System.out.println(small + "부터" + big + "까지 짝수의 합:" + evenSum2);
		System.out.println(small + "부터" + big + "까지 홀수의 합:" + oddSum2);
		
	}
}
