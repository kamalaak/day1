package org.bank;

public class AxisBank extends BankInfo {
	@Override
		public void deposit() {
		System.out.println("3%");
		}

public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.fixed();
	a.savings();
	a.deposit();
	
}
}
