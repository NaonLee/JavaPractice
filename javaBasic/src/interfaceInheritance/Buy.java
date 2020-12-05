package interfaceInheritance;

public interface Buy {

	void buy();
	
	default void Order() {
		System.out.println("buyer order");
	}
}
