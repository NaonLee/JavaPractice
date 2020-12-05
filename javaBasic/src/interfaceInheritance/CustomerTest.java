package interfaceInheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.Order();
		buyer.Order();
		seller.Order();					//result will be the same.
	}
}
