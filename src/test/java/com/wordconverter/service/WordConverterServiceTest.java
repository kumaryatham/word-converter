package com.wordconverter.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;


public class WordConverterServiceTest {


	@InjectMocks
	private WordConverterService wordConvertServiceMock;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void wordConverterSingleDigitTest() {
		String expecteds = "nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(9));
	}
	@Test
	public void wordConverterTwoDigitTest() {
		String expecteds = "ninety nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(99));
	}
	@Test
	public void wordConverterThreeDigitTest() {
		String expecteds = "nine hundred and ninety nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(999));
	}
	@Test
	public void wordConverterFourDigitTest() {
		String expecteds = "nine thousand nine hundred and ninety nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(9999));
	}
	@Test
	public void wordConverterFiveDigitTest() {
		String expecteds = "ninety nine thousand nine hundred and ninety nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(99999));
	}
	@Test
	public void wordConverterSixDigitTest() {
		String expecteds = "nine hundred and ninety nine thousand nine hundred and ninety nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(999999));
	}
	@Test
	public void wordConverterSevenDigitTest() {
		String expecteds = "nine million nine hundred and ninety nine thousand nine hundred and ninety nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(9999999));
	}
	@Test
	public void wordConverterEightDigitTest() {
		String expecteds = "ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(99999999));
	}
	@Test
	public void wordConverterNineDigitTest() {
		String expecteds = "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(999999999));
	}
	@Test
	public void wordConverterZeroTest() {
		String expecteds = "zero";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(0));
	}
	@Test
	public void wordConverterNegetiveDigitTest() {
		String expecteds = "minus fifty five";
		Assert.assertEquals(expecteds, wordConvertServiceMock.wordConverter(-55));
	}


}
