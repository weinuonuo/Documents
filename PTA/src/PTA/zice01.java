package PTA;

import java.util.Scanner;

public class zice01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String sign = in.next();
		int line = (int) Math.sqrt((num+1)/2);
		
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j < i; j ++) {
				System.out.print(" ");
			}
			for (int k = 2*(line-i)+1; k >= 1; k--) {
				System.out.print(sign);
			}
			System.out.println();
		}
		for (int i = 1; i < line; i++) {
			for (int j = 1; j <= line-i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print(sign);
			}
			System.out.println();
		}
		System.out.println(num+1-2*line*line);
	}
}
