package com.POSTRequest.demo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private JSONObject testUser;
    private int createdUserId;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = BASE_URL;

        testUser = new JSONObject();
        testUser.put("name", "Test User");
        testUser.put("email", "binit1601@gmail.com");
        testUser.put("username", "binit264");
    }

    @Test(priority = 1)
    public void TestPostRequestComplete() {

        System.out.println("\n========== POST REQUEST - TRADITIONAL ==========");

        JSONObject user = new JSONObject(testUser.toString());
        user.put("id", 1);

        System.out.println("Request Body:");
        System.out.println(user.toString(2));

        Response response =
                given()
                    .header("Content-Type", "application/json")
                    .body(user.toString())

                .when()
                    .post("/users");

        printResponseDetails(response, "Traditional POST");

        Assert.assertEquals(response.getStatusCode(), 201);

        JSONObject responseJson =
                new JSONObject(response.getBody().asString());

        if (responseJson.has("id")) {
            createdUserId = responseJson.getInt("id");
            System.out.println("Created User ID : " + createdUserId);
        }
    }

    @Test(priority = 2)
    public void testBDDApproach() {

        System.out.println("\n========== BDD APPROACH ==========");

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "BDD Post");
        requestBody.put("body", "Testing BDD approach");
        requestBody.put("userId", 2);

        given()
            .header("Content-Type", "application/json")
            .body(requestBody.toString())

        .when()
            .post("/posts")

        .then()
            .statusCode(201)
            .statusLine(containsString("201"))
            .contentType("application/json")
            .body("title", equalTo("BDD Post"))
            .body("userId", equalTo(2))
            .time(lessThan(5000L))
            .log().all();
    }

    @Test(priority = 3)
    public void testBDDApproachWithExtraction() {

        System.out.println("\n========== BDD APPROACH WITH EXTRACTION ==========");

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "BDD with Extraction");
        requestBody.put("body", "Testing BDD with response extraction");
        requestBody.put("userId", 3);

        Response response =
                given()
                    .header("Content-Type", "application/json")
                    .body(requestBody.toString())

                .when()
                    .post("/posts")

                .then()
                    .statusCode(201)
                    .extract()
                    .response();

        printResponseDetails(response, "BDD Extraction");

        Assert.assertEquals(response.jsonPath().getString("title"),
                "BDD with Extraction");

        Assert.assertEquals(response.jsonPath().getInt("userId"), 3);

        System.out.println("Title : " + response.jsonPath().getString("title"));
        System.out.println("User ID : " + response.jsonPath().getInt("userId"));
        System.out.println("Response Time : " + response.time() + " ms");
    }

    // Helper Method
    public void printResponseDetails(Response response, String approach) {

        System.out.println("\n===== " + approach + " Response =====");
        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Status Line : " + response.getStatusLine());
        System.out.println("Content Type : " + response.getContentType());
        System.out.println("Response Time : " + response.time() + " ms");
        System.out.println("Response Body : ");
        System.out.println(response.getBody().asPrettyString());
    }
}