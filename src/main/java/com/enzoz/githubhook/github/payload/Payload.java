package com.enzoz.githubhook.github.payload;

import java.util.List;

public class Payload {
	private String before;
	private Repository repository;
	private List<Commit> commits;
	private String after;
	private String ref;

	public Commit getHead() {
		for (Commit commit : commits) {
			if (commit.getId().equals(after)) {
				return commit;
			}
		}
		return null;
	}

	public String getBefore() {
		return before;
	}

	public Repository getRepository() {
		return repository;
	}

	public List<Commit> getCommits() {
		return commits;
	}

	public String getAfter() {
		return after;
	}

	public String getRef() {
		return ref;
	}

	@Override
	public String toString() {
		return "Payload [before=" + before + ", repository=" + repository
				+ ", commits=" + commits + ", after=" + after + ", ref=" + ref
				+ "]";
	}
}
