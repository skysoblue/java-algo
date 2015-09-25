package array;
/**
 * @file_name : ArrayMrSmith.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 25.
 * @story     : 이중배열 예제
 */
public class ArrayMrSmith {
	public static void main(String[] args) {
		String[][] names = {
				{"Mr.","Mrs.","Ms."},
				{"Smith","Jones","Alex"},
				{"Hello","Hi","Good-bye","사요나라"}
				
		};
		// Mr.Smith good-bye
		System.out.println(names[0][0]+names[1][0]+names[2][2]);
		// Ms.Alex사요나라
		System.out.println(names[0][2]+names[1][2]+names[2][3]);
	}
}
