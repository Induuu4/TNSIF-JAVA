package com.tnsif.second;

public class Nonprimitive {
	public static void main(String args[]) {
		String name = "Non primitive datatypes example";
		int[] arr= {2,4,6,8};
		System.out.println("Given String= "+name);
		System.out.println("Array value at Index1="+arr[1]);
		//For displaying all values
		int n=arr.length;
		System.out.println("All Array values:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
	}
}