package PTA;

import java.util.Scanner;

public class zice03 {
	public static void Reverse(int m,int n,int list[]){
		for (int i = m; i <= n/2; i++) {
			int tmp = list[i];
			list[i] = list[n-i];
			list[n-i] = tmp;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int change = (in.nextInt()) % num;
		change = num - change;
		int []list = new int[num];
		for (int i = 0; i < list.length; i++) {
			list[i] = in.nextInt();
		}
		if(change != num){
			Reverse(0,change-1, list);
			Reverse(change, list.length-1+change,list);
			Reverse(0,list.length-1,list);
		}
		//Êä³ö
		for (int i = 0; i < list.length-1; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println(list[list.length-1]);
	}
}
