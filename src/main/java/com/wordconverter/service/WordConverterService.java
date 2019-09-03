package com.wordconverter.service;


import org.springframework.stereotype.Service;
import com.wordconverter.constants.IConstants;; 

@Service
public class WordConverterService implements IConstants {

	public String wordConverter(int number) {
		if (number == 0) {
			return ZERO;
		}else {
			return intToWordConverter(number);
		}
	}


	private String intToWordConverter(int number) {
		String word = "";
		// For negative
		if (number < 0) {  
			number = -(number);
			return MINUS + intToWordConverter(number);
		} 
		// Million Check
		if ((number / 1000000) > 0) {
			word += intToWordConverter(number / 1000000) + MILLION;
			number %= 1000000;
		}
		// Thousand Check
		if ((number / 1000) > 0) {
			word += intToWordConverter(number / 1000) + THOUSAND;
			number %= 1000;
		}
		// Hundred check
		if ((number / 100) > 0 ) {
			if((number/100) >0 )
				word += intToWordConverter(number / 100) + HUNDRED;

			if(number%100 > 0) {
				word += AND;	
			}
			number %= 100;				
		}

		// Check for below 20 
		if (number > 0) {
			if (number < 20) { 
				word += NUM_NAMES[number];
			} else { 
				word += TENS_NAMES[number / 10]; 
				if ((number % 10) > 0) {
					word += " " + NUM_NAMES[number % 10];
				}  
			}
		}
		return word;
	}
}
