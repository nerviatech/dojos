import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChopTest {

	@Test
	public void testChop() {
		Chop chop = new Chop();

		assertEquals(-1, chop.chop(3, null));
		assertEquals(-1, chop.chop(3, new int[] {}));
		assertEquals(-1, chop.chop(3, new int[] { 1 }));
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
		
		assertEquals(4, chop.chop(8, new int[] { 1, 3, 5, 7, 8, 9, 10, 16, 36, 57 }));
		assertEquals(-1, chop.chop(11, new int[] { 1, 3, 5, 7, 8, 9, 10, 16, 36, 57 }));
		assertEquals(9, chop.chop(57, new int[] { 1, 3, 5, 7, 8, 9, 10, 16, 36, 57 }));
		assertEquals(1, chop.chop(-3, new int[] {-5, -3, -1, 0, 1, 3, 5, 7, 8, 9, 10, 16, 36, 57 }));
	}
}
