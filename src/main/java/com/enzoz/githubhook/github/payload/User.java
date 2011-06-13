package com.enzoz.githubhook.github.payload;

public class User {
	private String email;
	private String name;

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + "]";
	}
}
