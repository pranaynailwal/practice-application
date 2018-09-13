package com.pranay.practice.application.practiceapplicationservice.beans;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class SampleData {
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SampleData [id=" + id + ", name=" + name + "]";
	}
}
