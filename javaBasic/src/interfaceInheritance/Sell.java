package interfaceInheritance;

public interface Sell {

	void sell();
	default void Order() {
		System.out.println("Seller order");
	}
}
