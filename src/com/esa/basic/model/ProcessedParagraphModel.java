package com.esa.basic.model;


import java.util.Date;
import java.util.List;
import java.util.Map;

public class ProcessedParagraphModel {
	private String input;
	private String output;
	private Date processedDate;
	private Map<String, List<Integer>> result;
	public ProcessedParagraphModel(){};
	
	
	public ProcessedParagraphModel(String input, String output, Date processedDate, Map<String, List<Integer>> result) {
		super();
		this.input = input;
		this.output = output;
		this.processedDate = processedDate;
		this.result = result;
		
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public Date getProcessedDate() {
		return processedDate;
	}
	public void setProcessedDate(Date processedDate) {
		this.processedDate = processedDate;
	}
	public Map<String, List<Integer>> getResult() {
		return result;
	}
	public void setResult(Map<String, List<Integer>> result) {
		this.result = result;
	}
	
	
	
}
