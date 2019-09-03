package com.wordconverter.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordconverter.service.WordConverterService;

@RestController
public class WordConverterController {

	@Autowired
	private WordConverterService wordConvertServiceInstance;

	@RequestMapping(value="/converters/wordconverter/{number}", method=RequestMethod.GET)
	public String wordConverter(@Valid @PathVariable int number) {
		return wordConvertServiceInstance.wordConverter(number);
	}


}
