package API_Automation.ORG.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static  com.jayway.restassured.RestAssured.*;

public class Array_Jason 
{
	public static void main(String[] args) 
	{
		JSONObject Outer_Class= new JSONObject();
		
		JSONObject Inner_Class1= new JSONObject();
		
		Inner_Class1.put("Name", "Ashish");
		Inner_Class1.put("LName", "Soni");
		Inner_Class1.put("id", "101");
		Inner_Class1.put("Designatin", "Teser");
		
		JSONArray array= new JSONArray();
		JSONObject j1= new JSONObject();
		j1.put("Sector", "37");
		j1.put("HNumber", "111");
		j1.put("Landmark", "Primary Address");
		
		
		JSONObject j2= new JSONObject();
		j2.put("Sector", "44");
		j2.put("HNumber", "222");
		j2.put("Landmark", "Secondary Address");

		array.put(0,j1);
		array.put(1,j2);
		
		Outer_Class.put("Basic Details", Inner_Class1);
		Outer_Class.put("Address Details", array);
		System.out.println(Outer_Class.toString());
		Response res=
				given().contentType(ContentType.JSON).body(Outer_Class.toString())
		        .when()
		        .post("http://localhost:3000/profile");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		        
		
		
	}
	

}
