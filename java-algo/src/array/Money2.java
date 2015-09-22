package array;

import java.util.Scanner;

/**
 * @file_name : Money.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화폐단위별로 분류시키는 문제
 */
public class Money2 {
	/**
	 * 예를 들어서 134,530 이면
	 * 거스름돈을 화폐로 표시해주면 5만원: 2, 1만원: 3,...
	 * 표시하고 10원미만은 절삭
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scanner.nextInt();
		int[] moneyUnit = {50000,10000,5000,1000,500,100,50,10};
		int mok = 0; // 화폐단위 갯수
		int nmg = 0; // 금액 - 몫 * 화폐단위
		for (int i = 0; i < moneyUnit.length; i++) {
			mok = money / moneyUnit[i];
			nmg = money % moneyUnit[i];
			money = nmg;
			System.out.println(moneyUnit[i]+"원 : " + mok);
		}
	}
}
/**
 *  25 : moneyUnit[0] = 5만원권, 전체금액을 5만원권으로 나눈 몫을 구한다
 */






