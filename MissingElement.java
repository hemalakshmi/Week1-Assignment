package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
			if((i+1)!=arr[i]) {
				System.out.println("Missig Element in given Array:" + (i+1));
			break;
		}
		
	}

	}
}
