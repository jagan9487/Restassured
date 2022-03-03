import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.awt.*;

import static io.restassured.RestAssured.given;

public class sample {

public static void main(String[] args){
    // Specify the base URL to the RESTful web service

    JSONObject param=new JSONObject();
    param.put("clubCode","B742");


       Response res= given().relaxedHTTPSValidation()
               .contentType("application/json")
               .body(param.toString())
           .when()
           .post("https://10.140.129.72/SSCA_Service/forms/getAuthToken/")
           .then()
           .statusCode(200)
               .extract().response();

       System.out.println(res.prettyPrint());
}

}
