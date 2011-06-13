package com.enzoz.githubhook.github.payload;

import java.util.List;

public class Commit {
	private String id;
	private String url;
	private User author;
	private String message;
	private String timestamp;
	private List<String> added;
	private List<String> removed;
	private List<String> modified;

	public String getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}

	public User getAuthor() {
		return author;
	}

	public String getMessage() {
		return message;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public List<String> getAdded() {
		return added;
	}

	public List<String> getRemoved() {
		return removed;
	}

	public List<String> getModified() {
		return modified;
	}

	@Override
	public String toString() {
		return "Commit [id=" + id + ", url=" + url + ", author=" + author
				+ ", message=" + message + ", timestamp=" + timestamp
				+ ", added=" + added + ", removed=" + removed + ", modified="
				+ modified + "]";
	}
}
