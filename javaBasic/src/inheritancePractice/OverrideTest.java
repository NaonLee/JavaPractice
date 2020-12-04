package inheritancePractice;

public class OverrideTest {

	public static void main(String[] args) {
		/*
		Customer customer = new Customer(100010, "Lee");
		customer.calPraice(10000);
		System.out.println(customer.showCustomerInfo());

		VIPCustomer vipCustomer = new VIPCustomer(100020, "Kim", 100);
		vipCustomer.calPraice(10000);
		System.out.println(vipCustomer.showCustomerInfo());
		*/
		
		Customer customeri = new VIPCustomer(10030, "Im", 100);			//Virtual method
		customeri.calPraice(10000);
		System.out.println(customeri.showCustomerInfo());
	}

}
