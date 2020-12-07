package genericsPractice;

public class Plastic extends Material {
	@Override
	public String toString() {
		return "material is plastic";
	}

	@Override
	public void doPrinting() {
		System.out.println("Print wtih plastic material");
	}

}
