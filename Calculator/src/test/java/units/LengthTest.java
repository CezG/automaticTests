package units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import operations.Multiplication;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
		assertNotNull(l2.getData());
		assertNotNull(l1.getData());

	}

	@Test
	void getDataTest_with_mock_using_when() {
		Length l = mock(Length.class);
		when(l.getData()).thenReturn(1000.);
		assertEquals(1000, l.getData(), "simulate object by mock");
		assertNotNull(l.getData());

	}

	@Test
	void getDataTest_with_mock_using_given() {
		Length l = mock(Length.class);
		given(l.getData()).willReturn(1000.);
		assertEquals(1000, l.getData(), "simulate object by mock");
		assertNotNull(l.getData());

	}

	@Test
	void converToTest() {
		assertEquals(10000, l1.convertTo(EnumLength.DM), "1 km = 10000 dm");
		assertEquals(1000, l1.convertTo(EnumLength.M), "1 km = 1000 m");
		assertEquals(1000000, l1.convertTo(EnumLength.MM), "1 km = 1000000 m");
		assertEquals(l1.convertTo(EnumLength.M), l1.getData());
		assertNotSame(l1.convertTo(EnumLength.M), l1.getData());

	}

	@Test
	void converToTest_with_mock() {
		Length l = mock(Length.class);

		given(l.convertTo(EnumLength.DM)).willReturn(10000.);
		given(l.convertTo(EnumLength.M)).willReturn(1000.);
		when(l.convertTo(EnumLength.MM)).thenReturn(1000000.);
		when(l.getData()).thenReturn(1000.);

		assertEquals(10000, l.convertTo(EnumLength.DM), "1 km = 10000 dm");
		assertEquals(1000, l.convertTo(EnumLength.M), "1 km = 1000 m");
		assertEquals(1000000, l.convertTo(EnumLength.MM), "1 km = 1000000 m");
		assertEquals(l.convertTo(EnumLength.M), l.getData());

	}

	@Test
	void converToTest_with_mockito_any() {
		Length l = mock(Length.class);

		given(l.convertTo(Mockito.any(EnumLength.class))).willReturn(10000.);
		when(l.getData()).thenReturn(10000.);

		assertEquals(10000, l.convertTo(EnumLength.DM), "1 km = 10000 dm");
		assertEquals(10000, l.convertTo(EnumLength.M), "1 km = 1000 m");
		assertNotSame(100000, l.convertTo(EnumLength.M), "1 km = 1000 m");
		assertEquals(10000, l.convertTo(EnumLength.MM), "1 km = 1000000 m");
		assertEquals(l.convertTo(EnumLength.M), l.getData());

	}

}
