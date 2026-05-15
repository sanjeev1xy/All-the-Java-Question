package Danger1;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Restassured_API_How_Can_We_Find_bob_id 
{
	/*[
	  {"id":1, "name":"John"},
	  {"id":2, "name":"Alice"},
	  {"id":3, "name":"Bob"}
	]
*/
	
	public static void main(String[] args) 
	{
		JSONArray arr = new JSONArray();

        JSONObject o1 = new JSONObject();
        o1.put("id", 1);
        o1.put("name", "John");

        JSONObject o2 = new JSONObject();
        o2.put("id", 2);
        o2.put("name", "Alice");

        JSONObject o3 = new JSONObject();
        o3.put("id", 3);
        o3.put("name", "Bob");

        arr.put(o1);
        arr.put(o2);
        arr.put(o3);

        System.out.println(arr.toString());

        Response res =
                given()
                .contentType(ContentType.JSON)
                .body(arr.toString())
                .when()
                .post("http://localhost:3000/APIStudents");

        System.out.println("Status Code: " + res.statusCode());
        System.out.println("Response Body: " + res.asString());
        
        String json = res.asString();
        JsonPath js = new JsonPath(json);
        int bobId = js.getInt("find { it.name == 'Bob' }.id");
        System.out.println("Bob ID is: " + bobId);
	    		  
	}
}
