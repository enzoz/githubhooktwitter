package com.enzoz.githubhook.unittests;

import org.junit.Assert;
import org.junit.Test;

import com.enzoz.githubhook.github.payload.Payload;
import com.google.gson.Gson;

public class PayloadTests {

	
	@Test
	public void testPayloadParse(){
		Payload payload = new Gson().fromJson(new Mocks().payloadJson, Payload.class);
		Assert.assertEquals("5aef35982fb2d34e9d9d4502f6ede1072793222d",payload.getBefore());
	}
	
}
