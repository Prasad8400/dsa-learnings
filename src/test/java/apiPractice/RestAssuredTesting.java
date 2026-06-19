package apiPractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredTesting {
  /*
   * given() means: prepare request
   * when() means: send request
   * then() means: validate response
   */

  public static void postAPI() {
    /*
     * 🎯 RestAssured — POST API
     */
    Response response = RestAssured
        .given()
        .contentType(ContentType.JSON)
        .body("""
            {
              "title": "Naruto",
              "body": "Will become Hokage",
              "userId": 1
            }
            """)
        .post("https://jsonplaceholder.typicode.com/posts");

    System.out.println("Status Code: " + response.getStatusCode());
    System.out.println("Response Body: ");
    response.prettyPrint();
  }

  public static void get() {
    Response response = RestAssured.given()
        .when()
        .get("https://jsonplaceholder.typicode.com/posts/1/")
        .then()
        .assertThat().body("id", equalTo(1))
        .statusCode(200).extract().response(); // took help from google
    System.out.println("Status Code: " + response.statusCode());
    System.out.println("Response Body: " + response.getBody().asString());
    System.out.println("title: " + response.jsonPath().getString("title"));
  }

  public static void delete() {
    Response response = RestAssured.given()
        .when()
        .delete("https://jsonplaceholder.typicode.com/posts/1/")
        .then()
        .assertThat()
        .statusCode(200)
        .extract()
        .response();
    System.out.println("Deleted: " + response.body().asString().isEmpty());
  }

  public static void getAPI() {

    Response response = RestAssured.get("https://jsonplaceholder.typicode.com/users/1");
    System.out.println("Status Code: " + response.getStatusCode());
    System.out.println("Response Body:");
    System.out.println(response.getBody().asString());

    /*
     * 🎯 RestAssured — GET API
     */
    given().when()
        .get("https://jsonplaceholder.typicode.com/users/1")
        .then().assertThat().statusCode(200)
        .body("name", equalTo("Leanne Graham"));
    System.out.println("Succesfull");
  }

  static void putAPI() {
    /*
     * 🎯 RestAssured — PUT API
     */

    Response response = RestAssured.given()
        .contentType(ContentType.JSON)
        .body("""
            {
                         "id": 1,
                         "title": "Naruto Updated",
                         "body": "I will become Hokage",
                         "userId": 1
                       }
                       """)
        .put("https://jsonplaceholder.typicode.com/posts/1");

    System.out.println("Status Code: " + response.getStatusCode());
    System.out.println("Response Body:");
    response.prettyPrint();
  }

  static void pathParameters() {

    Response response = RestAssured.given()
        .when()
        .pathParam("id", 1)
        .get("https://jsonplaceholder.typicode.com/posts/{id}")
        .then()
        .assertThat()
        .statusCode(200)
        .extract()
        .response();

    System.out.println(response.getBody().asPrettyString());

  }

  static void queryParams() {
    Response response = RestAssured.given()
        .auth()
        .basic("admin", "admin123")
        .when()
        .header("Content-Type", "application/json")
        .queryParam("userId", 1)
        .get("https://jsonplaceholder.typicode.com/posts")
        .then()
        .assertThat()
        .statusCode(200)
        .extract()
        .response();

    System.out.println("Response Body: " + response.getBody().asPrettyString());
    System.out.println("Status Code: " + response.statusCode());
    System.out.println(response.getHeader("Content-Type"));
  }

  public static void main(String[] args) {
    // get();
    // getAPI();
    // postAPI();
    // putAPI();
    // delete();
    // pathParameters();
    queryParams();
  }
}
