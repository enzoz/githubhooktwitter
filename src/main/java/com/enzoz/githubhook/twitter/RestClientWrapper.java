package com.enzoz.githubhook.twitter;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


public class RestClientWrapper {

	public String updateStatus(Message tweet) {
		try {
			
			Twitter twitter = getTwitterServiceInstance();
			Status status = twitter.updateStatus(tweet.extractTweet());

			return status.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private Twitter getTwitterServiceInstance() {
		ConfigurationBuilder cb = getConfigurationBuilder();
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		return twitter;
	}

	private ConfigurationBuilder getConfigurationBuilder() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("nnIghNkEykyB6PgoMCA2Q")
		  .setOAuthConsumerSecret("sMUSHMBtNcxth1pQ2BTlPC9rWrdbRGuOjZSBou1dUE")
		  .setOAuthAccessToken("315624776-mrlFzgehppMhHb1OzVvroBBpX0CK7nllNRviHR67")
		  .setOAuthAccessTokenSecret("1rrfMe98L7GKLB1qmSttWWyzDomAqTwASdW9RzaM9g");
		return cb;
	}

}
