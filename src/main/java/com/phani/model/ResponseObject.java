package com.phani.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ResponseObject {
	
	private ArrayList<RequestObject> responseList = new ArrayList<>();

	public ArrayList<RequestObject> getResponseList() {
		return responseList;
	}

	public void setResponseList(RequestObject requestObject) {
		this.responseList.add(requestObject);
	}

}
