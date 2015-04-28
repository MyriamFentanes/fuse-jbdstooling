package com.redhat.transformation.custom;

public class ExamTransformation {

	public String transform(String input) {
		if(input.equalsIgnoreCase("Exam")){
			return "Test Grade";
		}
		return input;
	}

}
