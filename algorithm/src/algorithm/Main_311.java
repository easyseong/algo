package algorithm;

import java.util.*;

public class Main_311 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		list.sort(null);
		
		int result = 0;
		int count = 0;
		
		for(int i=0;i<N;i++) {
			count +=1;
			if(list.get(i) <= count) {
				result+=1;
				count=0;
			}
		}
		System.out.println(result);
		
			
			
		
		
		
		
	}

}
