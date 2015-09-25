package loop;
/**
 * @file_name : Continue3Multiple.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 25.
 * @story     : 3의 배수를 제외한 1 부터 10까지 정수 출력
 */
public class Continue3Multiple {
	/**
	 * [결과]
	 * 1 2  4 5  7 8  10
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i%3==0) {
				continue; // 조건에 맞으면 아래로 진행하지 말고 다시 처음에서 시작해라
			}
			System.out.print(i+"\t");
		}
	}
}
