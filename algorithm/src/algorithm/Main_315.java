

package algorithm;

import java.util.Scanner;

public class Main_315 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //공의 갯수
		int m = sc.nextInt(); //최대 무게
		int[] list = new int[n];
		for(int i=0;i<n;i++) {
			list[i] = sc.nextInt();
		}
		int cnt = 0;
		
		for(int i=0;i<(n-1);i++) {
			for(int j=(i+1); j<n;j++) {
				if(list[i]!=list[j]) cnt +=1;
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
