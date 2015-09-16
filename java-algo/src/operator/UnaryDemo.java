package operator;
/**
 * @file_name : UnaryDemo.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 단항연산자 문법
 */
public class UnaryDemo {
	public static void main(String[] args) {
		/**
		 * ++i (전위 연산자)는 i의 값을 증가시키고 연산한다.
		 */
		int i=10,j=10;
		System.out.println("++i 의 값 :" + (++i));
		System.out.println("--j 의 값 :" + (--j));
		
	}
}
