package units;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class LengthTest {

	private Length l1 = new Length(1, EnumLength.KM);
	private Length l2 = new Length(1000, EnumLength.M);

	@Before
	public void setUp() {
		l1 = new Length(1, EnumLength.KM);
		l2 = new Length(1000, EnumLength.M);
	}

	@After
	public void tearDown() {
		l1 = null;
		l2 = null;

	}

	@Test
	void getDataTest() {
		assertEquals(1000, l1.getData(), "value * unitValue = value in [m]");
		assertEquals(1000, l2.getData(), "value * unitValue = value in [m]");

	}

	@Test
	void converToTest() {
		assertEquals(10000, l1.convertTo(EnumLength.DM), "1 km = 10000 dm");
		assertEquals(1000, l1.convertTo(EnumLength.M), "1 km = 1000 m");
		assertEquals(1000000, l1.convertTo(EnumLength.MM), "1 km = 1000000 m");

	}

}
