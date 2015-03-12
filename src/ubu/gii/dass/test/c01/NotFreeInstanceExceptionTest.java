package ubu.gii.dass.test.c01;



import junit.framework.TestCase;

import ubu.gii.dass.c01.*;

/**
 * Test para la clase NotFreeInstanceException
 * 
 * @Author Manuel Casado
 * @Author Adrian Gil
 */
public class NotFreeInstanceExceptionTest extends TestCase{

	@org.junit.Test
	public void testNotFreeInstanceException(){		
		try{
			ReusablePool intento1=ReusablePool.getInstance();
			intento1.acquireReusable();
			intento1.acquireReusable();
			intento1.acquireReusable();
		} catch (NotFreeInstanceException e) {
		  return;
		}
		fail();
	}

}
