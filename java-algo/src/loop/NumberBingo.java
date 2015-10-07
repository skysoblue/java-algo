package loop;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @file_name : NumberBingo.java 
 * @author    : coolbeat@naver.com
 * @date      : 2015. 10. 5.
 * @story     : 숫자 맞추기 게임
 */
public class NumberBingo {
	/**
	 *  1부터 10까지 랜덤숫자를 컴퓨터가 생성하면
	 *  3회안에 숫자를 맞추는데
	 *  플레이어가 입력한 숫자가 답보다 큰지 작은지를 알려줌
	 */
	public static void main(String[] args) {
		int com=0,player=0,count=0;
		com = 0; // 랜덤수 발생 
		String result = "";
		int randomNum = (int) ((Math.random()*10)+1);
		
			while (true) {
			int player2 = Integer.parseInt(JOptionPane.showInputDialog("1부터 10까지 숫자만 넣으시오."));
			try {
				count++;
				if (player2 == randomNum) {
				result = "컴퓨터가 입력한 값"+randomNum+"과 일치합니다.";
				}else if (player2 > randomNum) {
					result = "컴퓨터의 값은"+player2+"보다 작은 수 입니다 다시 입력해 주세요";
				}else {
					result = "컴퓨터의 값은"+player2+"보다 큰 수 입니다 다시 입력해 주세요";
				}
				if(count==3){
					System.out.println("게임의 총 회수는 3회입니다.");
					System.out.println("정답은 :"+randomNum);
					return;
				}
			} catch (Exception e) {
				System.out.println("1부터 10사이 숫자만 입력하세요");
				count--; // 범위밖의 숫자를 입력했을 때에는 카운트에서 제외 해준다.
			}
			
			System.out.println(result);
		}	
	}
}








