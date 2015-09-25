package loop;
/**
 * @file_name : Gugudan.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 25.
 * @story     : 책받침 구구단
 */
public class Gugudan {
	public static void main(String[] args) {
		int dan = 2; // 2단부터 시작함
		for (int i = 1; i < 10; i++) {
			System.out.println("");  // 바깥쪽 for문 1회전이 끝나면 라인개행
			for (dan = 2; dan < 6; dan++) {
				System.out.print(dan+" * "+i+" ="+dan*i+"\t");
			}
		}
		System.out.println("");
		for (int i = 1; i < 10; i++) {
			System.out.println("");  // 바깥쪽 for문 1회전이 끝나면 라인개행
			for (dan = 6; dan < 10; dan++) {
				System.out.print(dan+" * "+i+" ="+dan*i+"\t");
			}
		}
	}
}
