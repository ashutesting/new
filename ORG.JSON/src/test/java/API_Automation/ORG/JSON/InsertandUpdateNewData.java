package API_Automation.ORG.JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;
//Insert an New Object in Json
public class InsertandUpdateNewData 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f= new File("F:\\API Workspace\\ORG.JSON\\body.json");
		FileInputStream fi= new FileInputStream(f);
		JSONTokener jt= new JSONTokener(fi);
		
		JSONObject j= new JSONObject(jt);
		JSONObject new_data= new JSONObject();
		new_data.put("MyName", "Ashish");
		new_data.put("Designation", "QA Tester");
		j.put("Update Data", new_data);
		
		System.out.println(j);
		
		
		
	}

}
