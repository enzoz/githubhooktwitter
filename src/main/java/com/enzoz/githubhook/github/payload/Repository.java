package com.enzoz.githubhook.github.payload;


public class Repository {

	private String name;
	private String url;
	private String pledgie;
	private String description;
	private int watchers;
	private int forks;
	private int _private;
	private User owner;

	public String getUrl() {
		return url;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getWatchers() {
		return watchers;
	}

	public int getForks() {
		return forks;
	}

	public int getPrivate() {
		return _private;
	}

	public User getOwner() {
		return owner;
	}

	public String getPledgie() {
		return pledgie;
	}

	@Override
	public String toString() {
		return "Repository [name=" + name + ", url=" + url + ", pledgie="
				+ pledgie + ", description=" + description + ", watchers="
				+ watchers + ", forks=" + forks + ", _private=" + _private
				+ ", owner=" + owner + "]";
	}
}
