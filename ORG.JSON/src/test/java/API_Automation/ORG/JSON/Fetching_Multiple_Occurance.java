package API_Automation.ORG.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Fetching_Multiple_Occurance 
{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f= new File("F:\\API Workspace\\ORG.JSON\\body.json");
		FileInputStream fi= new FileInputStream(f);
		JSONTokener jt= new JSONTokener(fi);
		JSONObject j= new JSONObject(jt);
		int l= j.length();
		System.out.println(l);
		
		JSONArray JA= j.getJSONArray("phoneNumbers");
		int l2= JA.length();
		System.out.println(l2);
		for(int i=0; i<l2; i++)
		{
			JSONObject j2= JA.getJSONObject(i);
			System.out.println(j2.get("type"));
			
		}
		
	}

}
