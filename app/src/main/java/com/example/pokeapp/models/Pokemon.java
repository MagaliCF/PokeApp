package com.example.pokeapp.models;

public class Pokemon {
	private int number;
	private String name;
	private String url;

	public String getName(){
		return name;
	}

	public String getUrl(){
		return url;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNumber() {
		String[] partsUrl = url.split("/");
		return Integer.parseInt(partsUrl[partsUrl.length - 1]);
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
