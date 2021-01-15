package units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class WeightTest {

	private Weight w1 = new Weight(1, EnumWeight.DAG);
	private Weight w2 = new Weight(1000, EnumWeight.T);

	@Before
	public void setUp() {
		w1 = new Weight(1, EnumWeight.DAG);
		w2 = new Weight(1000, EnumWeight.T);
	}

	@After
	public void tearDown() {
		w1 = null;
		w2 = null;

	}

	@Test
	void getDataTest() {
		assertEquals(0.01, w1.getData(), "value * unitValue = value in [kg]");
		assertEquals(1000000, w2.getData(), "value * unitValue = value in [kg]");
		assertNotNull(w2.getData());
		assertNotNull(w1.getData());

	}
	@Test
	void getDataTest_with_mock_using_when() {
		Weight w = mock(Weight.class);
		when(w.getData()).thenReturn(0.01);
		assertEquals(0.01, w.getData(), "simulate object by mock");
		assertNotNull(w.getData());

	}

	@Test
	void getDataTest_with_mock_using_given() {
		Weight w = mock(Weight.class);
		given(w.getData()).willReturn(0.01);
		assertEquals(0.01, w.getData(), "simulate object by mock");
		assertNotNull(w.getData());

	}

	@Test
	void converToEqualsTest() {
		assertEquals(0.00001, w1.convertTo(EnumWeight.T), "1 dag = 0.0001 tony");
		assertEquals(0.01, w1.convertTo(EnumWeight.KG), "1 dag = 0.1 kg");
		assertEquals(10, w1.convertTo(EnumWeight.G), "1 dag = 10 g");
		assertNotNull(w1.convertTo(EnumWeight.G));
		assertNotNull(w2.convertTo(EnumWeight.T));
		assertEquals(w1.convertTo(EnumWeight.KG), w1.getData());
		assertNotSame(w1.convertTo(EnumWeight.KG), w1.getData());

	}

}
