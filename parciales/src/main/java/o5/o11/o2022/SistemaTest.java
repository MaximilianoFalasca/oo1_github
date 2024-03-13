package o5.o11.o2022;

import java.time.LocalDate;

public class SistemaTest {
	public static void main(String[] args) {
		Sistema sistema=new Sistema();
		Contribuyente c=sistema.altaContribuyente("pablo", 13, "pablo@gmail.com", "la plata,111");
		sistema.altaAutomotor("aaa", "bbb", "ccc", LocalDate.of(2013, 11, 9), 250000.0, c);
		sistema.altaEmbarcacion("2", "a", LocalDate.of(2023, 1, 1),1500000.0, c);
		System.out.println("impuestos a pagar: "+c.calcularImpuesto());
	}
}
