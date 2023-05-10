import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DataControllerTest {

	// Test assumes MySql database running with record in item table: [id:1, name: item1, lastName: asdf] (Don't ask me how I name things)
	@Test
	public void testDataController() {
		get("/info?name=1").then().assertThat()
			.statusCode(HttpStatus.OK.value())
			.contentType(ContentType.JSON)
			.body("id", hasItem(1))
			.body("lastName", hasItem("asdf"))
			.body("name", hasItem("item1"));
	}
	
	// Controller returns a blank sheet
	@Test
	public void testInvalidDataDataController() {
		get("/info?name=2").then().assertThat()
			.statusCode(HttpStatus.OK.value())
			.body("$", not(hasKey("id")));
	}

	@Test
	public void testPostDataController() {
		post("/info?name=1").then().assertThat()
			.statusCode(HttpStatus.METHOD_NOT_ALLOWED.value());
	}

}
