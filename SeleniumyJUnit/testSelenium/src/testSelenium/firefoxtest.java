package testSelenium;

import static org.junit.Assert.*;

import org.junit.Test;

public class firefoxtest {

	@Test
	public void test() {
		Testeo test = new Testeo();
		int salida = test.entradaweb();
		assertEquals(5,salida);
		
	}

}
