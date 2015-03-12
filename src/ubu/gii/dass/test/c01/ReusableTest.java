package ubu.gii.dass.test.c01;

import junit.framework.TestCase;

import ubu.gii.dass.c01.*;

/**
 * Test para la clase Reusable
 * 
 * @Author Manuel Casado
 * @Author Adrian Gil
 */
public class ReusableTest extends TestCase{

	Reusable elemento=new Reusable();
	
	@org.junit.Test
	public void testUtil() {
		assertNotNull("Vemos si no es nulo",elemento);
	}

}
