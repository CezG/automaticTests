package operations;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
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
    private String jsonString = dm.readAllData().toJSONString();
    ;

    @Before
    public void setUp() {
        l1 = new Length(1, EnumLength.KM);
        l2 = new Length(1000, EnumLength.M);
        w1 = new Weight(1, EnumWeight.KG);
        w2 = new Weight(1000, EnumWeight.G);
        dm.writeAllData(l1);


    }

    @After
    public void tearDown() {

        l1 = null;
        l2 = null;
        w1 = null;
        w2 = null;
        dm = null;

    }


    @DisplayName("Testing reading json which was created and strict with true")
    @Test
    void readAllDataTest_withStrictTrue() throws JSONException {
        jsonString = dm.readAllData().toJSONString();
        JSONAssert.assertEquals("{\"unit\":\"KM\",\"data\":1000.0,\"value\":1.0,\"unitValue\":1000.0}", jsonString, true);
        JSONAssert.assertNotEquals("{\"unit\":\"KM\",\"value\":1.0,\"unitValue\":1000.0}", jsonString, true);
        JSONAssert.assertNotEquals("{\"unit\":\"KM\",\"data\":2000.0,\"value\":1.0,\"unitValue\":2000.0}", jsonString, true);
    }

    @DisplayName("Testing json which was created and strict with false")
    @Test
    void readAllDataTest_withStrictFalse() throws JSONException {
        jsonString = dm.readAllData().toJSONString();
        JSONAssert.assertEquals("{\"unit\":\"KM\",\"value\":1.0,\"unitValue\":1000.0}", jsonString, false);
        assertNotNull(jsonString);
    }

    @DisplayName("Testing json is it null")
    @Test
    void readAllDataTest_isNotNull() throws JSONException {
        jsonString = dm.readAllData().toJSONString();
        assertNotNull(jsonString);
    }

}
