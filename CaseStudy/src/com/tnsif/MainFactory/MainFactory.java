package com.tnsif.MainFactory;

import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;

public class MainFactory {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(101,"sneha",3300,true);
		GSNormalAcc gsnormal = new GSNormalAcc(102,"Thanvi",5500,16.3f);

		gsprime.bookProduct(14.8f);
		gsnormal.bookProduct(32.3f);
		
	}

}