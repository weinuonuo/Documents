package PTA;

import java.util.ArrayList;
import java.util.Scanner;

//2 3 5 7 9 13 17 19
public class zice02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		ArrayList<Integer> Prime = new ArrayList<Integer>();
		//将小于num的素数存入数组
		for (int i = 2; i <= num; i++) {
			int k = (int) Math.sqrt(i);
			for (int j = 2; j <= k+1; j++) {
				if (i % j == 0) {
					break;
				}
				if(j > k){
					Prime.add(i);
				}
			}
		}
		//检测数组中的素数对有多少对相差为2的
		int sum = 0;
		for (int i = 0; i < Prime.size(); i++) {
			if(i == Prime.size()-1){
				break;
			}else if(Prime.get(i+1)-Prime.get(i) == 2){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
