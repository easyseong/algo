package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) list.add(sc.nextInt());
		
		list.sort(null);
		
		int target =1;
		for(int i=0;i<n;i++) {
			if(target<list.get(i)) break;
			
		}
		
		System.out.println(target);

	}

}
