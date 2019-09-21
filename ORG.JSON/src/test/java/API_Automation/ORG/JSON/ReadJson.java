package API_Automation.ORG.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONTokener;

public class ReadJson 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f = new File("F:\\API Workspace\\ORG.JSON\\body.json");
		FileInputStream fi = new FileInputStream(f);
		JSONTokener js= new JSONTokener(fi);
		org.json.JSONObject j= new org.json.JSONObject(js);
		
		System.out.println(j.toString());
		
	}
	

}
