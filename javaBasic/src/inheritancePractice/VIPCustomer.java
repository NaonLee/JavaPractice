package inheritancePractice;

public class VIPCustomer extends Customer {
		
	private double discountRatio;
	int agentID;
	
	/*public VIPCustomer() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.discountRatio = 0.1;
		agentID = 1000;
	}
	*/
	public VIPCustomer(int customerID, String customerName, int agentID) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.discountRatio = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calPraice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " agent ID: " + agentID;
	}
	
	
}
