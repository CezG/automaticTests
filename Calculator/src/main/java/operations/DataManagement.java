package operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import units.AbstractUnit;
import units.Length;

public class DataManagement {

	public JSONObject readAllData() {

		JSONParser parser = new JSONParser();

			Object obj = null;
			try {
				obj = parser.parse(new FileReader("C:/work/projects/automaticTests/Calculator/unit.json"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			JSONObject jsonObject = (JSONObject) obj; 

		
//			Length reader = null;
//			try {
//				reader = new ObjectMapper().readValue(new File("unit.json"), Length.class);
//			} catch (JsonParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (JsonMappingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

//		ObjectReader reader = objectMapper.readerFor(type).with(schema); 
		
//		try {
//			reader = new ObjectMapper().readerFor(Length.class).readValue(new File("unit.json"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
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
