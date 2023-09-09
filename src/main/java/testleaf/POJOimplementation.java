package testleaf;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POJOimplementation {
public static void main(String[] args) {
	int bookingIdVal;
	Response resp = RestAssured.given()
			.headers("Content-Type","application/json")
			.headers("accept","application/json")
			.body("{\r\n"
					+ "    \"firstname\" : \"Jim\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.log()
			.all()
			.post("/booking");

			//resp.jsonPath()
			//bookingIdVal = resp.jsonPath().get("bookingid");
			//System.out.println(bookingIdVal);
			resp.then().assertThat().statusCode(200);
}

}
