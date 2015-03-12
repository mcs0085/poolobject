package ubu.gii.dass.test.c01;

//import static org.junit.Assert.*;
import junit.framework.TestCase;

import ubu.gii.dass.c01.*;

/**
 * Test para la clase ReusablePool
 * 
 * @Author Manuel Casado
 * @Author Adrian Gil
 */
public class ReusablePoolTest extends TestCase{

	public ReusablePool poolPrueba;
	public Reusable elemento;
	
	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@org.junit.Test
	public void testReusablePool() {
		poolPrueba=ReusablePool.getInstance();
		assertNotNull("Intentamos intaciar un ReusablePool", poolPrueba);
		try {
			elemento=poolPrueba.acquireReusable();			
			assertNotNull("Comprobamos si podemos adquirir un elemento del objeto ReusablePool", elemento);
		} catch (NotFreeInstanceException e) {
			fail();
		}
		try {
			poolPrueba.releaseReusable(elemento);
		} catch (DuplicatedInstanceException e) {
			fail();
		}
	}	
}
