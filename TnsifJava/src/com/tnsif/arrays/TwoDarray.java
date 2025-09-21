package com.tnsif.arrays;

public class TwoDarray {
	public static void main(String args[]) {
		int[][] numbers = new int[3][4];
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				numbers[i][j]=(int)(Math.random()*10);
				
			}
		}
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(" " +numbers[i][j]);
			}
			System.out.println();
	}
}
}
