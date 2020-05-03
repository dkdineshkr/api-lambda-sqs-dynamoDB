package helloworld;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<SQSEvent, Object> {

	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public Object handleRequest(SQSEvent event, final Context context) {
    	
    	
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");
        	
        	System.out.println("EVENT: {} "+gson.toJson(event));
            for(SQSMessage msg : event.getRecords()){
            	System.out.println("Size: "+event.getRecords().size());
                System.out.println("Get Body : "+new String(msg.getBody().toString()));
                DynamoDBClass.createItems(new String(msg.getBody().toString()));
            }
			return null;
            
       
    }

}
