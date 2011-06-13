package com.enzoz.githubhook.unittests;

import junit.framework.Assert;

import org.junit.Test;

import com.enzoz.githubhook.github.payload.Payload;
import com.enzoz.githubhook.twitter.Message;
import com.google.gson.Gson;

public class MessageTests {

	@Test
	public void testMessageBuilder() {

		Payload payload = new Gson().fromJson(new Mocks().payloadJson,
				Payload.class);

		Message message = new Message.MessageBuilder()
				.appendUser(payload.getHead().getAuthor().getName())
				.appendProject(payload.getRepository().getName())
				.appendLastCommit(payload.getHead().getMessage()).build();
		
		Assert.assertTrue(message.extractTweet().contains("ChrisWanstrath"));

	}

}
