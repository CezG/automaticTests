package operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import units.AbstractUnit;

public class DataManagement {

    public JSONObject readAllData() {

        JSONParser parser = new JSONParser();

        Object obj = new Object();
        try {
            obj = parser.parse(new FileReader(".\\unit.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
    }

    public void writeAllData(AbstractUnit unit) {
        ObjectMapper om = new ObjectMapper();
        try {
            om.writerWithDefaultPrettyPrinter().writeValue(new File("unit.json"), unit);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
