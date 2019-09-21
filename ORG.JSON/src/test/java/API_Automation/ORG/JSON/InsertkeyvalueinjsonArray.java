package API_Automation.ORG.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class InsertkeyvalueinjsonArray 
{
	
		public static void main(String[] args) throws FileNotFoundException 
		{
			File f= new File("F:\\API Workspace\\ORG.JSON\\body.json");
			FileInputStream fi= new FileInputStream(f);
			JSONTokener jt= new JSONTokener(fi);
			
			JSONObject j= new JSONObject(jt);
			
			JSONArray ja= j.getJSONArray("phoneNumbers");
			JSONObject j2= ja.getJSONObject(0);
			j2.put("New1", "Test1");
			j2.put("New2", "Test2");
		    System.out.println(j);
	}

}
