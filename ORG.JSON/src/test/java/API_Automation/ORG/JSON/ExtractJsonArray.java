package API_Automation.ORG.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
//Extracting Data from a Json Array
public class ExtractJsonArray 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f= new File("F:\\API Workspace\\ORG.JSON\\body.json");
		FileInputStream fi= new FileInputStream(f);
		JSONTokener jk= new JSONTokener(fi);
		
		JSONObject j= new JSONObject(jk);
		
		System.out.println(j);
		
		JSONArray ja= j.getJSONArray("phoneNumbers");
		JSONObject j2= ja.getJSONObject(0);
		System.out.println(j2.get("number"));
		System.out.println(j2.get("type"));
		
		
		
		
	}

}
