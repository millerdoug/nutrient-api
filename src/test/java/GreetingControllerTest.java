import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GreetingControllerTest {

	@Test
	public void testGetDataController() {
		get("/greeting?name=1").then().assertThat()
			.statusCode(HttpStatus.OK.value())
			.contentType(ContentType.JSON)
			.body("$", hasKey("id"))
			.body("content", equalTo("Oats"));
	}
	
	@Test
	public void testPostDataController() {
		String testUser = "testUser";
		post("/greeting?name=" + testUser).then().assertThat()
			.statusCode(HttpStatus.OK.value())
			.contentType(ContentType.JSON)
			.body("$", hasKey("id"))
			.body("content", equalTo(String.format("Thanks, added %s!",testUser)));
	}

}
