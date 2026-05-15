package Danger1;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Restassured_API_Find_Name_Product 
{
public static void main(String[] args) 
{
    /*{
		  "orderId": 1,
		  "customer": {"name":"John", "email":"john@example.com"},
		  "items": [
		    {"product":"Laptop", "qty":1},
		    {"product":"Mouse", "qty":2}
		  ]
		}
		*/
	
	// MAIN JSON OBJECT
    JSONObject main = new JSONObject();

    // CUSTOMER OBJECT
    JSONObject customer = new JSONObject();
    customer.put("name", "John");
    customer.put("email", "john@example.com");

    // ITEMS ARRAY
    JSONArray items = new JSONArray();

    JSONObject item1 = new JSONObject();
    item1.put("product", "Laptop");
    item1.put("qty", 1);

    JSONObject item2 = new JSONObject();
    item2.put("product", "Mouse");
    item2.put("qty", 2);

    items.put(item1);
    items.put(item2);

    // ADD ALL TO MAIN JSON
    main.put("orderId", 1);
    main.put("customer", customer);
    main.put("items", items);

    System.out.println(main.toString());

    // POST REQUEST
    Response res =
            given()
            .contentType(ContentType.JSON)
            .body(main.toString())
            .when()
            .post("http://localhost:3000/APIStudents");

    System.out.println("Status Code: " + res.statusCode());
    System.out.println("Response Body: " + res.asString());

    // JSON PATH
    String json = res.asString();
    JsonPath js = new JsonPath(json);

    // EXTRACT NAME + EMAIL
    String cname = js.getString("customer.name");
    String cemail = js.getString("customer.email");

    // EXTRACT FIRST PRODUCT
    String product1 = js.getString("items[0].product");
    int qty1 = js.getInt("items[0].qty");

    // EXTRACT SECOND PRODUCT
    String product2 = js.getString("items[1].product");
    int qty2 = js.getInt("items[1].qty");

    // PRINT OUTPUT
    System.out.println("Name = " + cname);
    System.out.println("Email = " + cemail);

    System.out.println("First Product = " + product1 + ", qty = " + qty1);
    System.out.println("Second Product = " + product2 + ", qty = " + qty2);

}
}
