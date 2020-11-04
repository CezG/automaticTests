package operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import units.EnumLength;
import units.EnumWeight;
import units.Length;
import units.Weight;

class SumTest {

	private Length l1 = new Length(1, EnumLength.KM);
	private Length l2 = new Length(1000, EnumLength.M);
	private Weight w1 = new Weight(1, EnumWeight.KG);
	private Weight w2 = new Weight(1000, EnumWeight.G);
	private Sum s = new Sum();

	@Before
	public void setUp() {
		l1 = new Length(1, EnumLength.KM);
		l2 = new Length(1000, EnumLength.M);
		w1 = new Weight(1, EnumWeight.KG);
		w2 = new Weight(1000, EnumWeight.G);

		s = new Sum();
	}

	@After
	public void tearDown() {
		s = null;
		l1 = null;
		l2 = null;
		w1 = null;
		w2 = null;

	}

	@Test
	void sumLengthTest() {
		// Length result1 =new Length;
		// Length result2 = new Length;

		// assertThat(result.m, 3.0);
		assertEquals(2, s.sum(EnumLength.KM, l1, l2), "1km + 1000m = 2km");
		assertEquals(2000, s.sum(EnumLength.M, l1, l2), "1km + 1000m = 2000 m");
		assertEquals(null, s.sum(EnumLength.M, null), "Should throw that there isn't any arguments");
//		assertEquals(result2,result);
//		assertEquals(result1.m,result.m,0.001);
//		assertEquals(3,l1.dm,0.001);
//		assertEquals(3,l1.getM(),0.001);
//		assertEquals(3,result.m,0.001);
//		assertTrue(result1.equals(result));
//		assertThat(result1.m,result.m).isTrue;
//		assertThat(result).isEqualToComparingFieldByField();
	}

	@Test
	void sumWeightTest() {
		assertEquals(2, s.sum(EnumWeight.KG, w1, w2), "1kg + 1000g = 2kg");
		assertEquals(2000, s.sum(EnumWeight.G, w1, w2), "1kg + 1000g = 2000 g");
//		
	}

}
