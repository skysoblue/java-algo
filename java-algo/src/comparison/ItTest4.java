package comparison;

import java.util.Scanner;

/**
 * @file_name : ItTest4.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 18.
 * @story     : if-else 로 SSN 성별 분석하기
 */
public class ItTest4 {
	/**
	 * To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수가 주민번호를 입력하면 해당 학생이 남자인지, 여자인지, 외국인인지 
	 * 자동 으로 출력해 주는 프로그램을 만들어 달랍니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 홍길동 : 800101-1234567 : 남
	 * 입력값은 이름과 주민번호이고 남은 자동으로 출력되는 값입니다.
	 * 현행법상 1, 3으로 시작되면 남자, 2, 4로 시작되면 여자, 5,6 이면 외국인
	 * 교수가 실수로 0,7,8,9 로 시작 주민번호를 입력하면
	 * "다시 입력하세요" 라고 알려주시길 바랍니다.
	 */
	public static void main(String[] args) {
		/**
		 *  String ssn = scanner.next();
		 *  char ch = ssn.charAt(7);
		 */
		String gender = null;
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = s.next();
		System.out.println("주민등록번호를 입력해주세요.");
		String ssn = s.next();
		char ch = ssn.charAt(7);
		if (ch=='0'||ch=='7'||ch=='8'||ch=='9') {
			System.out.println("다시 입력하세요");
			return;
		}
		if (ch=='1' || ch=='3') {
			gender = "남";
		} else if (ch=='2' || ch=='4') {
			gender = "여";
		} else {
			gender = "외국인";
		}		
		System.out.println(name+" : "+ssn+" : "+gender);
	}
}









