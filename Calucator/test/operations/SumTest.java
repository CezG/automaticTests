package operations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

		assertEquals(2, s.sum(EnumLength.KM, l1, l2), "1km + 1000m = 2km");
		assertEquals(2000, s.sum(EnumLength.M, l1, l2), "1km + 1000m = 2000 m");
		assertNotNull(s.sum(EnumLength.M, l1, l2));

	}

	@Test
	void sumWeightTest() {
		assertEquals(2, s.sum(EnumWeight.KG, w1, w2), "1kg + 1000g = 2kg");
		assertEquals(2000, s.sum(EnumWeight.G, w1, w2), "1kg + 1000g = 2000 g");
		assertNotNull(s.sum(EnumWeight.G, w1, w2));

	}

}
