package algorithm;

import java.util.Scanner;

public class Main_312 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] list = sc.nextLine().toCharArray();
		
		int result =1;
		
		for(char a : list) {
			int num = a - '0';
			if(num==0) continue;
			else {
				result *= num;
			}
		}	
		
		System.out.println(result);
	}

}

