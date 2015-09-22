package array;

import java.util.Scanner;

public class Euc {
	public static void main(String[] args) {
		int v1, v2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수입력");
		v1 = scanner.nextInt();
		v2 = scanner.nextInt();
		
		int gcd = test(v1,v2);
		System.out.println("최대 공약수 : "+gcd);
		
	}
	private static int test(int v1, int v2){
		while (v2 != 0) { 
			v1 = v1 % v2;
			int temp = v1;
			v1 = v2;
			v2 = temp;
		}
		return v1;
	}
}
