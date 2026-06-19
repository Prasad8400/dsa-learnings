package DAY24;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredAPI {
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

  public static void main(String[] args) {
    get();
    delete();
  }
}
