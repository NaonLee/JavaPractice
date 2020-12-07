package genericsPractice;

public class Powder extends Material {

	@Override
	public String toString() {
		return "material is powder";
	}

	@Override
	public void doPrinting() {
		System.out.println("Print wtih powder material");
	}

}
