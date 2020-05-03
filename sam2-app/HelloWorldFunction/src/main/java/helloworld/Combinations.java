package helloworld;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Combinations {
	private StringBuilder output = new StringBuilder();
	private final String inputstring;
	private static List<String> inputreq = new ArrayList<String>();
	public Combinations(final String str) {
		inputstring = str;
		System.out.println("The input string  is  : " + inputstring);
	}

	//public static void main(String args[]) {
		//String str = "{\"input\":[\"A\",\"B\",\"C\",\"D\"]}";
		//System.out.println(getSqsOutput(str));
	//}
	public static String getSqsOutput(String jsonInput) {
		//String str = "{\"input\":[\"A\",\"B\",\"C\",\"D\"]}";
		StringBuilder strBuilder = new StringBuilder();
		ObjectMapper mapper = new ObjectMapper();
		List<SQSInputRequest> inputrequestList = null;
		try {
			inputrequestList = Arrays.asList(mapper.readValue(jsonInput, SQSInputRequest.class));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        for(SQSInputRequest req : inputrequestList) {
        	for(StringBuilder str1 : req.getInput())
        		strBuilder.append(str1);
        }
		
		Combinations combobj = new Combinations(strBuilder.toString());
		System.out.println("All possible combinations are :  ");
		combobj.combine();
		System.out.println("All list : "+inputreq);
		String json = new Gson().toJson(inputreq);
		System.out.println(json);
		return json;
		
	}

	public void combine() {
		combine(0);
	}

	private List<String> combine(int start) {
		
		for (int i = start; i < inputstring.length(); ++i) {
			output.append(inputstring.charAt(i));
			//System.out.println(output);
			inputreq.add(output.toString());
			if (i < inputstring.length())
				combine(i + 1);
			output.setLength(output.length() - 1);
			
		}
		
		return inputreq;
	}
}