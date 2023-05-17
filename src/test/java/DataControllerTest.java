import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DataControllerTest {

	// Test assumes MySql database running with record in recipe table: [id:1, name: Mug Brownie, url: /img1.png, tags:null]
	@Test
	public void testDataController() {
		get("/recipies?name=brownie").then().assertThat()
			.statusCode(HttpStatus.OK.value())
			.contentType(ContentType.JSON)
			.body("final_list",hasSize(2))
			.body("id", hasItem(1))
			.body("name", hasItem("Mug Brownie"))
			.body("url", hasItem("/img1.png"));
	}
	
	// Controller returns a blank sheet
	@Test
	public void testInvalidDataDataController() {
		get("/recipies?name=2").then().assertThat()
			.statusCode(HttpStatus.OK.value())
			.body("$", not(hasKey("id")));
	}

	@Test
	public void testPostDataController() {
		post("/recipies?name=1").then().assertThat()
			.statusCode(HttpStatus.METHOD_NOT_ALLOWED.value());
	}

}
