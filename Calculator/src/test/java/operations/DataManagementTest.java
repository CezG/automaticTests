package operations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileReader;

import org.json.JSONException;
import org.json.simple.parser.JSONParser;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import units.EnumLength;
import units.EnumWeight;
import units.Length;
import units.Weight;

public class DataManagementTest {

	private Length l1 = new Length(1, EnumLength.KM);
	private Length l2 = new Length(1000, EnumLength.M);
	private Weight w1 = new Weight(1, EnumWeight.KG);
	private Weight w2 = new Weight(1000, EnumWeight.G);
	private DataManagement dm = new DataManagement();
	private  String jsonString = dm.readAllData().toJSONString();;

	@Before
	public void setUp() {
		l1 = new Length(1, EnumLength.KM);
		l2 = new Length(1000, EnumLength.M);
		w1 = new Weight(1, EnumWeight.KG);
		w2 = new Weight(1000, EnumWeight.G);
		jsonString = dm.readAllData().toJSONString();

	}

	@After
	public void tearDown() {

		l1 = null;
		l2 = null;
		w1 = null;
		w2 = null;
		dm = null;

	}

	@Test
	void writeAllDataTest() {
		dm.writeAllData(l1);
	}

	@Test
	void readAllDataTest() throws JSONException {

		JSONAssert.assertEquals("{\"unit\":\"KM\",\"data\":1000.0,\"value\":1.0,\"unitValue\":1000.0}", jsonString, true);
		JSONAssert.assertNotEquals("{\"unit\":\"KM\",\"data\":2000.0,\"value\":1.0,\"unitValue\":2000.0}", jsonString, true);
		assertNotNull(jsonString);
	}

}
