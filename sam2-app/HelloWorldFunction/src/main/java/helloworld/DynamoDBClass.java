package helloworld;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.google.gson.Gson;

public class DynamoDBClass {

	
    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
    static DynamoDB dynamoDB = new DynamoDB(client);

    static String tableName = "SampleTable";
    
	
	/*
	 * public static void main(String args[]) {
	 * 
	 * createItems("Dinesh");
	 * 
	 * }
	 */
	 
	 
	 
	 public static void createItems(String title) {

	        Table table = dynamoDB.getTable(tableName);
	       
	        Gson gson = new Gson();
	        String jsonTitle = gson.toJson(title);
	        String str = "{\"input\":[\"A\",\"B\",\"C\",\"D\"]}";
	        System.out.println("Json title : "+jsonTitle);
	        System.out.println("Json String : "+str);
	        try {
	        	
	        	Item item = new Item()
	        			.withPrimaryKey("id", "1")
	        			.withJSON("request", jsonTitle)
	        			.withJSON("response", Combinations.getSqsOutput(title));

	        	PutItemOutcome outcome = table.putItem(item); 
	        	System.out.println(outcome);
	        }
	        catch (Exception e) {
	            System.err.println("Create items failed.");
	            System.err.println(e.getMessage());

	        }
	    }

	    
}
