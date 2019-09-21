package API_Automation.ORG.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class InsertaNewArray 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f= new File("F:\\API Workspace\\ORG.JSON\\body.json");
		FileInputStream fi= new FileInputStream(f);
		JSONTokener jt= new JSONTokener(fi);
		
		JSONObject j= new JSONObject(jt);
		JSONArray ja1= new JSONArray();
		JSONObject data= new JSONObject();
		data.put("Test1", "Data1");
		data.put("Test2", "Data2");
		ja1.put(0, data);
		j.put("New Array",ja1);
		System.out.println(j);
	}

}
