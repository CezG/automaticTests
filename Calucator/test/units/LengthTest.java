package units;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import operations.Sum;

public class LengthTest {

	public LengthTest() {
		// TODO Auto-generated constructor stub
	}

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
		assertEquals();

	}

	@Test
	void showDataTest() {
		assertEquals();

	}

	@Test
	void converToTest() {
		assertEquals();

	}

}
