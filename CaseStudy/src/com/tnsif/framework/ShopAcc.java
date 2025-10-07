package com.tnsif.framework;

public class ShopAcc {
	public int accNo;
	public String accNm;
	public float Charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		Charges = charges;
	}
	
	public void bookProduct(float Charges) {
		
	}
	
	public void items(float Charges) {
		
	}
	
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", Charges=" + Charges + "]";
	}
	
}
