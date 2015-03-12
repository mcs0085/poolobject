package ubu.gii.dass.test.c01;

import junit.framework.TestCase;

import ubu.gii.dass.c01.*;

/**
 * Test para la clase DuplicatedInstanceException
 * 
 * @Author Manuel Casado
 * @Author Adrian Gil
 */
public class DuplicatedInstanceExceptionTest extends TestCase{

	@org.junit.Test
	public void testDuplicatedInstanceException() throws NotFreeInstanceException {
		try{
			ReusablePool prueba=ReusablePool.getInstance();
			Reusable elemento=prueba.acquireReusable();
			prueba.releaseReusable(elemento);
			prueba.releaseReusable(elemento);
		} catch (DuplicatedInstanceException e) {
		  return;
		}
		fail();
	}

}
