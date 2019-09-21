package API_Automation.ORG.JSON;

import org.json.JSONObject;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Complex_Json 
{
	
	public static void main(String[] args) 
	{
		JSONObject js1= new JSONObject();  //Using JsonObject class which is given by org.json library
		js1.put("FirstName", "rajesh");
		js1.put("LastName", "Kumar");
		js1.put("Gender", "Male");
		js1.put("Designation", "Developer");
		
		JSONObject js2= new JSONObject();
		js2.put("Sector", "135");
		js2.put("HouseNumber", "1001");
		js2.put("Landmark", "abcd");
		
		js1.put("AddressDetails", js2);
		
		System.out.println(js1.toString());
		
		Response res=
			given().contentType(ContentType.JSON)
			.body(js1.toString())
			.when()
			.post("http://localhost:3000/profile");
			
			System.out.println("After response Json is \n " +res.asString());
			System.out.println("Status Code is " +res.statusCode());
		
	}

}
