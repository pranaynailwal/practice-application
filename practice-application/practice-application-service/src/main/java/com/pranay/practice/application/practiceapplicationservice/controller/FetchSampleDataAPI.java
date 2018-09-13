package com.pranay.practice.application.practiceapplicationservice.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pranay.practice.application.practiceapplicationservice.beans.SampleData;

@RestController
public class FetchSampleDataAPI {

	@RequestMapping("/fetchSampleData")
	private ArrayList<SampleData> fetchSampleData() {
		ArrayList<SampleData> response = new ArrayList<SampleData>();
		long defId = 100;
		String defStr = "Stringer0";
		for(int i = 1; i<=5; i++ ) {
			SampleData sampleData = new SampleData();
			sampleData.setId(defId+i);
			sampleData.setName(defStr+i);
			response.add(sampleData);
		}
		return response;
	}
}
