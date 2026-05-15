//In Selenium Java, we use JSON file to store test data 
//like username, password, URL, browser name, etc.
//To read and write JSON data, we can use Jackson ObjectMapper. 
//ObjectMapper provides methods to read JSON into Java objects 
//and write Java objects into JSON.



//Java Code: Read JSON File
/*package Danger_B;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class read_write_data_in_JSON_file_in_Selenium_Java 
{
	public static void main(String[] args) throws Exception 
    {
        ObjectMapper mapper = new ObjectMapper();

        File file = new File("src/test/resources/testdata.json");

        JsonNode jsonData = mapper.readTree(file);

        String url = jsonData.get("url").asText();
        String username = jsonData.get("username").asText();
        String password = jsonData.get("password").asText();

        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }

}


//Java Code: Use JSON Data in Selenium

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class read_write_data_in_JSON_file_in_Selenium_Java
{
    public static void main(String[] args) throws Exception 
    {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode data = mapper.readTree(new File("src/test/resources/testdata.json"));

        String url = data.get("url").asText();
        String username = data.get("username").asText();
        String password = data.get("password").asText();

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        driver.quit();
    }
}

//Java Code: Write Data into JSON File

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class read_write_data_in_JSON_file_in_Selenium_Java
{
    public static void main(String[] args) throws Exception 
    {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> data = new HashMap<>();
        data.put("url", "https://example.com");
        data.put("username", "sanjeev");
        data.put("password", "123456");
        data.put("status", "Pass");

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("src/test/resources/output.json"), data);

        System.out.println("JSON file written successfully");
    }
}

*/
package Danger_B;

