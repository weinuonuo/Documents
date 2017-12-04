package PTA;

import java.math.BigInteger;
import java.util.Scanner;


public class zice04 {
	public static boolean judge(String nums,String doubled){
		int []exaclty = new int[10];
		if (nums.length() != doubled.length()) {
			return false;
		}
		for (int i = 0; i < nums.length(); i++) {
			int num = nums.charAt(i) - '0';
			if(num == 0){
				exaclty[num] = -1;
			}else if(exaclty[num] == 0){
				exaclty[num] = num;
			}else if(exaclty[num] == num){
				exaclty[num] += num;
			}else if(exaclty[num] == -1){
				exaclty[num] += -1;
			}
		}
		for (int i = 0; i < doubled.length(); i++) {
			int num = doubled.charAt(i) - '0';
			if (exaclty[num]%-1 == 0){
				exaclty[num] -= -1;
			}else if (exaclty[num]%num == 0) {
				exaclty[num] -= num;
			}
		}
		for (int i = 0; i < exaclty.length; i++) {
			System.out.print(exaclty[i]+' ');
		}
		for (int i = 0; i < exaclty.length; i++) {
			
			if (exaclty[i] != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nums = in.next();
		BigInteger doubling = new BigInteger(nums);
		doubling = doubling.shiftLeft(1);
		String doubled = String.valueOf(doubling);
		if (judge(nums,doubled)) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		System.out.println(doubling);
	}
}
