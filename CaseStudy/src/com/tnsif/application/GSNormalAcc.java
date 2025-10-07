package com.tnsif.application;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
	}
	public void bookProduct(float Charges) {
		System.out.println("Hello NormalAcc user! your product charges are :" +Charges +"And the deliverycharges are :"+deliveryCharge);
		
	}
	@Override
	public String toString() {
		return "GSNormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="+ Charges + "]";
	}
	
	

}
