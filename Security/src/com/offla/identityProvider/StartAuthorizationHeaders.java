package com.offla.identityProvider;

import com.google.gson.Gson;

public class StartAuthorizationHeaders {
	
	private String status = "success";  // fail
	
	private UserIdentityObject userIdentityObject;
	
	public StartAuthorizationHeaders(){
		
	}
	
	public static String getStartAuthorizationHeadersJson(){
		
		Gson gson = new Gson();
		StartAuthorizationHeaders sah = new StartAuthorizationHeaders();
		String json = "\"startAuthorizationHeaders\":" + gson.toJson(sah);
		System.out.println( json);
		return json;
	}
	
	

}
