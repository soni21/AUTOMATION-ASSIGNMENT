package nz.co.assurity.automation.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CategoryAPI {

    private static final String API_URL= "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";

    public static Response getCategoryDetails(){
        RestAssured.baseURI = API_URL;
        return given().when().get().then().statusCode(200).extract().response();
    }
}
