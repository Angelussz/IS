package testSelenium;

import static org.junit.Assert.*;

import org.junit.Test;

public class firefoxtest {

	@Test
	public void test() {
		Testeo test = new Testeo();
		//String salida =test.entradaweb();
		String fuera = test.entradaweb();
		//System.out.print(salida);
		String rest = "Please provide two numeric values in any fields below.";
		assertEquals(rest,fuera);
		
	}

}
