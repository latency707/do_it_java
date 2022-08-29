package generics;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder2> powderPrinter = new GenericPrinter<Powder2>(); // Powder형으로 GenericPrinter 클래스 생성
		
		powderPrinter.setMaterial(new Powder2());
		Powder2 powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); // Plastic형으로 GenericPrinter 클래스 생성
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
