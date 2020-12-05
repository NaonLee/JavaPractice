package interfaceInheritance;

public class Customer implements Buy, Sell {
	
	public void sell() {
		System.out.println("sell");
	}

	@Override
	public void buy() {
		System.out.println("buy");
	}

	@Override
	public void Order() {							//default methods are duplicated, it can be overrided
		System.out.println("Customer order");
	}

}
