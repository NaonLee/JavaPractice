package genericsPractice;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();		//Generic Type create
		
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(printer.toString());
		
		ThreeDPrinter<Plastic> printer1 = new ThreeDPrinter<Plastic>();	
		printer1.setMaterial(new Plastic());
		Plastic plastic = printer1.getMaterial();
		System.out.println(printer1.toString());
		
		printer.printing();
		printer1.printing();
	}

}
