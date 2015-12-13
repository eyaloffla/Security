package com.offla.identityProvider;

import com.google.gson.Gson;

public class UserIdentityObject {
	
	private String userName = "offlaSecurityName";
	private String displayName = "offlaSecurity";
	
	public UserIdentityObject(){
		
	}
	
public static String getUserIdentityObjec(){
		
		Gson gson = new Gson();
		UserIdentityObject uio = new UserIdentityObject();
		String json = "\"userIdentityObject\":" + gson.toJson(uio);
		System.out.println( json);
		return json;
	}

}
