package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("Sorted Array:"+Arrays.toString(data));
		int size=data.length;
		int r=data[size-2];
		System.out.println("Second largest element in the array:"+r);
		
	}

}

