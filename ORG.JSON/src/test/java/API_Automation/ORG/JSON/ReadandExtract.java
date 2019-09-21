package API_Automation.ORG.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadandExtract 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f = new File("F:\\API Workspace\\ORG.JSON\\body.json");
		
		FileInputStream fi = new FileInputStream(f);
		JSONTokener js= new JSONTokener(fi);
		JSONObject j= new JSONObject(js);
		//System.out.println(j.toString());
		
		JSONObject address=  j.getJSONObject("address");
		
		System.out.println(address.get("city"));
		System.out.println(address.get("postalCode"));
		
		
	}

}
