package loop;

import java.util.Scanner;

/**
 * @file_name : NumberNear.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 10. 5.
 * @story     : 가까운 수 구하기
 */
public class NumberNear {
	/**
	 * [결과]
	 * 다음 배열이 있을 때 입력한 수와 가장 가까운 수를 구하시오.
	 * 단, 동일 갭이면 작은 수를 선택한다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int gap = 0, target = scanner.nextInt(); // 입력값과 차이값
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		System.out.println("다음 배열이 있을 때 입력한 수 "+target+"와 가장 가까운 수를 구하시오.\n"
				+ "단, 동일 갭이면 작은 수를 선택한다.");
		System.out.println("답은 :");
	}
}
