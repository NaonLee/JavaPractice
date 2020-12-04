package inheritancePractice;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(1001, "Lee");
		Customer customer2 = new Customer(1002, "Kim");
		Customer customer3 = new GoldCustomer(1003, "Im");
		VIPCustomer customer4 = new VIPCustomer(1004, "Ryu", 100);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		
		System.out.println("<Customer information>");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("\n<discounted price, and bonus point>");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calPraice(price);
			System.out.println(customer.getCustomerName() + " paid "+ cost);
			System.out.println(customer.showCustomerInfo());
		}
	}

}
