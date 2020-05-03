package helloworld;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<Object, Object> {

	public Object handleRequest(final Object input, final Context context) {

		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		headers.put("X-Custom-Header", "application/json");

		try {
						
			String items = GetDynamoDBItems.getItems("SampleTable");
			return new GatewayResponse(items, headers, 200);
			
		} catch (IOException e) {
			return new GatewayResponse("{}", headers, 500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return headers;
	}

}
