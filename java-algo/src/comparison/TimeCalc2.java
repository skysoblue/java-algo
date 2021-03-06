package comparison;

import java.util.Scanner;

/**
 * @file_name : TimeCalc.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 21.
 * @story     :  입력된 시간(초)를 시간, 분, 초로 환산하기
 */
public class TimeCalc2 {
	/**
	 * To.개발자님께
	 * 초단위로 알려주는 시험이 있는데
	 * 이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
	 * 혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	 * 그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sec = 0, min = 0, hour = 0, time = 0;
		System.out.println("초를 시간과 분으로 바꾸어주는 프로그램입니다.");
		System.out.println("초를 입력해주세요.");
		time = scanner.nextInt();
		sec = time % 60;        // 초
		min = (time / 60) % 60; // 분
		hour= (time / 60)/ 60;  // 시

		System.out.println(time + "초 = " + hour + "시간 " + min + "분 " + sec + "초");
	}
}
