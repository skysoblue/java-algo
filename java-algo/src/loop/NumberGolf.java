package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @file_name : NumberGolf.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 10. 5.
 * @story     : 최단횟수로 숫자 맞추기 게임
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0, player=0;
		int com = 0; // 1부터 100까지 랜덤
		System.out.println("컴퓨터의 숫자는 정해졌습니다.");
		while (true) {
			System.out.println("1부터 100사이의 정수를 입력하세요");
			try {
				player = scanner.nextInt();
				if (player < 1 || player > 100) {
					System.out.println("1부터 100까지 정수만 입력해야 합니다.");
					continue;
				} 
			} catch (InputMismatchException e) {
				System.out.println("문자는 안됩니다.");
				return;
			} // 유효성 체크를 먼저 함
			// 로직은 완성바랍니다.
			count++;
			System.out.println(count+"회전 중입니다.");
		}
	}
}
