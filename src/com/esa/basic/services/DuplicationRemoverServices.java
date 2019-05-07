package com.esa.basic.services;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;

import com.esa.basic.model.ProcessedParagraphModel;

public class DuplicationRemoverServices {
	public ProcessedParagraphModel removeDuplicate(String txt) {
		Pattern p = Pattern.compile("\\b(\\w+)(\\s+\\1\\b)+", Pattern.CASE_INSENSITIVE);
		ProcessedParagraphModel model = new ProcessedParagraphModel();
		model.setInput(txt);
		//String txtlow = txt.toLowerCase();
		String[] splitted = txt.split("[^\\w']+");
		
		Map<String, List<Integer>> mapData = duplicateWords(splitted);
		HashMap<String, List<Integer>> mappedDuplicatedData = new HashMap<>();
		for (Map.Entry<String, List<Integer>> entry : mapData.entrySet()) {
			List<Integer> value = entry.getValue();
			if (value.size() > 1) {
				mappedDuplicatedData.put(entry.getKey(), entry.getValue());
			model.setResult(mappedDuplicatedData);}
			
		}
		
		Matcher z = p.matcher(txt);
		while (z.find()) {
			txt = txt.replaceAll(z.group(), z.group(1));
			model.setOutput(txt);
			
			Date today = new Date();
			model.setProcessedDate(today);}
		
		return model;
	}

	public Map<String, List<Integer>> duplicateWords(String[] input) {
		Map<String, List<Integer>> mappedWord = new HashMap<String, List<Integer>>();
		
		for (int i = 0; i < input.length; i++) {

			List<Integer> count = mappedWord.get(input[i]);
			if (count == null) {
				count = new ArrayList<>();
			}
			
					count.add(i);
					mappedWord.put(input[i], count);
				}
			
		
		return mappedWord;

	}

}
