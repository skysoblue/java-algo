package loop;

import java.util.Scanner;

/**
 * @file_name : ContinueSearch.java
 * @author : coolbeat@naver.com
 * @date : 2015. 9. 25.
 * @story : continue 를 이용한 간단한 검색엔진 원리 이해
 */
public class ContinueSearch {
	/**
	 * 검색어 [동해] 가 존재하는 지 여부 체크
	 */
	public static void main(String[] args) {
		String dest = "동해물백두산";
		boolean isExist = false;
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("검색어를 입력하세요. 종료하려면 q을 입력하세요.");
			String search = scanner.next(); // 백두
			if (search.equals("q")) {  
				return;
			} 
			isExist = false;
			max = dest.length() - search.length(); // 검색어를 뺀 회전수는 의미없다
			foo: for (int i = 0; i <= max; i++) {  
				int searchCount = search.length(); 
				int destStartPoint = i;  // 검색을 마친 후 다음 검색대상 낱말의 위치
				int searchStartPoint = 0;
				// 동해물백두산
				while (searchCount-- != 0) {
					if (dest.charAt(destStartPoint++) != search.charAt(searchStartPoint++)) {
						continue foo;
					}
				}
				isExist = true;
				break foo;
			}
			System.out.println(isExist ? "검색어 [" + search + "] 존재함 " : "존재하지 않음");
		}

	}
}
/**
* 29 : 문법 용어로 "라벨" 이라고 부르며, C언어의 GOTO 문에 태그값에 해당한다.
* 42 : 삼항연산자 (조건문) ? true : false ;  => if - else 
*/

	
	
