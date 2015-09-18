package comparison;

import java.util.Scanner;

public class IfTest3 {
	/**
	 * To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 3명의 a b  c이름과 각 학생 평균을 입력하면 1등을 알려주는 기능을 추가해 달랍니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 1등 : 김유신
	 * 단) 학생은 총 3명입니다. 그리고 평균점수는 0 이상 100 이하입니다.
	 * 교수가 실수로 120점이라든지 하는 범위 밖 점수를 입력하면
	 * "다시 입력하세요" 라고 알려주시길 바랍니다.
	 */

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("첫번째 학생 이름 입력 ");
			String name1 = scanner.next();
			System.out.println("첫번째 학생 평균 입력");
			int avg1 = scanner.nextInt();
			System.out.println("두번째 학생 이름 입력 ");
			String name2 = scanner.next();
			System.out.println("두번째 학생 평균 입력");
			int avg2 = scanner.nextInt();
			System.out.println("세번째 학생 이름 입력 ");
			String name3 = scanner.next();
			System.out.println("세번째 학생 평균 입력");
			int avg3 = scanner.nextInt();
			
			if (avg1 < 0 || avg1 > 100 || avg2 < 0 || avg2 > 100 ||  avg3 < 0 || avg3 > 100  ) {
				System.out.println("다시 입력하세요");
			} else if (avg1 > avg2 && avg1> avg3) {//123
				System.out.println(name1+"\t1등");
			} else if (avg2 > avg3 ) {
				System.out.println(name2+"\t1등");
			} else {
				System.out.println(name3+"\t1등");
			}
	 
		}
}
