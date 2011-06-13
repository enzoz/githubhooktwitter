package com.enzoz.githubhook.twitter;

public class Message {
	private String message;
	
	private Message(String message) {
		this.message = message;
	}
	
	public Message(){
		super();
	}
	
	public String extractTweet() {
		String tweet = "";
		if (this.message.length() > 120)
			tweet = this.message.substring(0, 120);
		else
			tweet = this.message;
		tweet += "(...) #githubhook";
		return tweet;
	}
	
	public static class MessageBuilder{
		public MessageBuilder() {
			super();
		}
		
		private String lastCommit;
		private Integer numberOfCommits;
		private String project;
		private String user;
		
		public Message build(){
			StringBuilder message = new StringBuilder();
			message.append("Hey! ")
					.append(this.user)
					.append(" pushed ")
					.append(this.numberOfCommits)
					.append(this.lastCommit).append(" in the project: '")
					.append(this.project)
					.append("'")
					.append(" and the last has the follow message: ");

			return new Message(message.toString());
		}
		
		public MessageBuilder appendProject(String project){
			this.project = project;
			return this;
		}
		
		public MessageBuilder appendUser(String user){
			this.user = user;
			return this;
		}
		
		public MessageBuilder appendLastCommit(String ... commits){
			
			this.numberOfCommits = commits.length;
			this.lastCommit = commits[commits.length-1];
			
			return this;
		}
		
	}
}
