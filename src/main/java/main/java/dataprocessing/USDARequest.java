//package main.java.dataprocessing;
//
//import java.io.InputStream;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//
//import org.apache.hc.client5.http.classic.methods.HttpGet;
//import org.apache.hc.client5.http.classic.methods.HttpPost;
//
//public class USDARequest {
//
//	public void makeRequest() {
//		String url = "https://api.nal.usda.gov/fdc/v1/food/2344719?api_key=" + System.getProperty("udsaApiKey");
//		HttpGet get = new HttpGet(url);
//		get.setHeader("Content-Type","application/json");
//		get.setRequestBody("{\"query\":\"avocado\",\n"
//				+ "\"dataType\": [\"Survey (FNDDS)\"]}");
//		// execute method and handle any error responses.
//
//		InputStream in = get.getResponseBodyAsStream();
//		// handle response.
//	}
//	
//}
