package com.enzoz.githubhook.twitter;


public class TwitterMethods {

	public String postMessage(Message message) {
		RestClientWrapper twitter = new RestClientWrapper();
		return twitter.updateStatus(message);
	}

}
