// T extends 클래스 테스트
package generics;

public class GenericPrinterETest {
	public static void main(String[] args) {
		GenericPrinterE<EPowder> powderPrinter = new GenericPrinterE<EPowder>();
		powderPrinter.setMaterial(new EPowder());
		powderPrinter.printing();
		
		GenericPrinterE<EPlastic> plasticPrinter = new GenericPrinterE<EPlastic>();
		plasticPrinter.setMaterial(new EPlastic());
		plasticPrinter.printing();
	}

}
