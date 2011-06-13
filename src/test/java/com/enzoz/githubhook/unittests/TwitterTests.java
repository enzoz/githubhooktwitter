package com.enzoz.githubhook.unittests;

import org.junit.Assert;
import org.junit.Test;

import com.enzoz.githubhook.twitter.Message;
import com.enzoz.githubhook.twitter.TwitterMethods;

public class TwitterTests {

	@Test
	public void testTwitterService() {
		
		Message message = new Message.MessageBuilder()
									 .appendUser("Try%20tweet!").build();

		TwitterMethods twitter = new TwitterMethods();
		String result = twitter.postMessage(message);
		
		System.out.println(result);
		Assert.assertNotNull(result);
		
	}

}
