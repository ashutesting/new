package API_Automation.ORG.JSON;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class Simple_Json 
{
	public static void main(String[] args) 
	{
		JSONObject js= new JSONObject();
		js.put("FirstName", "Ashish");
		js.put("LastName", "Soni");
		js.put("id", "asas");
		js.put("designation", "QA");
		
		System.out.println(js.toString());
		
		Response res=
		given().contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post("http://localhost:3000/profile");
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		
		
	}

}
