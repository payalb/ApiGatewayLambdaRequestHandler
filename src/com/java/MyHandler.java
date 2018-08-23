package com.java;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.java.dto.User;

public class MyHandler implements RequestHandler<User, String> {

	@Override
	public String handleRequest(User input, Context ctx) {
		ctx.getLogger().log("Input: " + input);
		return "saved!";
	}

}
