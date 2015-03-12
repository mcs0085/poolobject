package ubu.gii.dass.test.c01;

import junit.framework.TestCase;

import ubu.gii.dass.c01.*;

/**
 * Test para la clase Client
 * 
 * @Author Manuel Casado
 * @Author Adrian Gil
 */
public class ClientTest extends TestCase{

	@org.junit.Test
	public void testClient() {
		assertNotNull("Vemos si no es nulo",new Client());
	}

}
