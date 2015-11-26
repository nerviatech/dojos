import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestChop {
	
	@Test
	public void testChopRecursive() {
		Chop chop = new Chop();
		
		assertEquals(-1, chop.chopRecursive(3, null));
		assertEquals(-1, chop.chopRecursive(3, new int[] {}));
		assertEquals(0, chop.chopRecursive(1, new int[] { 1 }));
		assertEquals(0, chop.chopRecursive(1, new int[] { 1, 3, 5 }));
		assertEquals(1, chop.chopRecursive(3, new int[] { 1, 3, 5 }));
		assertEquals(2, chop.chopRecursive(5, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop.chopRecursive(0, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop.chopRecursive(2, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop.chopRecursive(4, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop.chopRecursive(6, new int[] { 1, 3, 5 }));
		assertEquals(0, chop.chopRecursive(1, new int[] { 1, 3, 5, 7 }));
		assertEquals(1, chop.chopRecursive(3, new int[] { 1, 3, 5, 7 }));
		assertEquals(2, chop.chopRecursive(5, new int[] { 1, 3, 5, 7 }));
		assertEquals(3, chop.chopRecursive(7, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chopRecursive(0, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chopRecursive(2, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chopRecursive(4, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chopRecursive(6, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chopRecursive(8, new int[] { 1, 3, 5, 7 }));
	}
	
	@Test
	public void testChop() {
		Chop chop = new Chop();
		
		assertEquals(-1, chop.chop(3, null));
		assertEquals(-1, chop.chop(3, new int[] {}));
		assertEquals(0, chop.chop(1, new int[] { 1 }));
		assertEquals(0, chop.chop(1, new int[] { 1, 3, 5 }));
		assertEquals(1, chop.chop(3, new int[] { 1, 3, 5 }));
		assertEquals(2, chop.chop(5, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop.chop(0, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop.chop(2, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop.chop(4, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop.chop(6, new int[] { 1, 3, 5 }));
		assertEquals(0, chop.chop(1, new int[] { 1, 3, 5, 7 }));
		assertEquals(1, chop.chop(3, new int[] { 1, 3, 5, 7 }));
		assertEquals(2, chop.chop(5, new int[] { 1, 3, 5, 7 }));
		assertEquals(3, chop.chop(7, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chop(0, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chop(2, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chop(4, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chop(6, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop.chop(8, new int[] { 1, 3, 5, 7 }));
	}

}
