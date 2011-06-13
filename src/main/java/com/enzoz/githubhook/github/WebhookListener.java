package com.enzoz.githubhook.github;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.apache.cxf.feature.Features;

import com.enzoz.githubhook.github.payload.Payload;
import com.enzoz.githubhook.twitter.Message;
import com.enzoz.githubhook.twitter.TwitterMethods;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class WebhookListener {

	@POST
	@Path("/receiver/push")
	public Response receiveUpdateFromGitHub(@FormParam("payload") String payloadJson) {

		Gson gson = new GsonBuilder().create();
		Payload payload = gson.fromJson(payloadJson, Payload.class);

		Message message = new Message.MessageBuilder().appendUser(payload.getHead().getAuthor().getName())
													  .appendProject(payload.getRepository().getName())
													  .appendLastCommit(payload.getHead().getMessage())
													  .build();
		
		TwitterMethods twitter = new TwitterMethods();
		String result = twitter.postMessage(message);
		
		return Response.ok(result).build();
	}



}
