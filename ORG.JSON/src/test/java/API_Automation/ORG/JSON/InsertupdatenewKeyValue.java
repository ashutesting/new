package API_Automation.ORG.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class InsertupdatenewKeyValue 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f= new File("F:\\API Workspace\\ORG.JSON\\body.json");
		FileInputStream fi= new FileInputStream(f);
		JSONTokener jt= new JSONTokener(fi);
		
		JSONObject j= new JSONObject(jt);
		JSONObject j1= j.getJSONObject("address");
		j1.put("data1", "Test1");
		j1.put("data2", "Test2");
		System.out.println(j);
		
		
		
		
	}

}
