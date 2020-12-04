package inheritancePractice;

public class GoldCustomer extends Customer {

	double discountRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		discountRatio = 0.1;
	}

	@Override
	public int calPraice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*discountRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}

}
