package comparison;

import java.util.Scanner;

/**
 * @file_name : ifTest.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 17.
 * @story     : 성적표 프로그램
 */
public class SamHang {
	/**
	 * To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 학생과 국어, 영어, 수학점수만 입력하면
	 * 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 학생		국어		영어		수학		총점		평균		합격여부
	 * =======================================================
	 * 홍길동     90       90      90     270      90       (장학생)
	 * 합격여부는 다음과 같다고 합니다.
	 * 평균이 90점 이상이면 장학생
	 * 70점 이상 90점미만 이면 합격
	 * 70미만이면 불합격이라고 하네요.
	 * 단) 평균에서 소수점이하는 절삭입니다.
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 :");
		String name = scanner.next();
		System.out.println("국어 :");
		int kor = scanner.nextInt();
		System.out.println("영어 :");
		int eng = scanner.nextInt();
		System.out.println("수학 :");
		int math = scanner.nextInt();
		System.out.println("학생		국어		영어		수학		총점		평균		합격여부");
		System.out.println("=======================================================");
		int tot = kor+eng+math;
		int avg = tot/3;
		
		String result = (70 <= avg )? "합격":"불합격";
		System.out.println(name+"\t\t"+kor+"\t\t"+ eng+"\t\t"+math+"\t\t"+tot+"\t\t"+avg+"\t\t"+result);
	}
}

/**
 * 삼항연산자 예문
 * boolean flag = (true)?true :false;
 * String str = (true) ? "참" : "거짓";
 * int a = (true) ? 1 : 0;
 */




