package com.wordconverter.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.wordconverter.service.WordConverterService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class WordConverterControllerTest {

	@Autowired
	private MockMvc mvc;


	@MockBean
	private WordConverterService wordConvertServiceMock;

	@Test
	public void wordConverterTest() throws Exception {

		mvc.perform(get("/converters/wordconverter/2023")
				.contentType(MediaType.TEXT_HTML))
		.andExpect(status().isOk());
	}

	@Test
	public void wordConverterNegTest() throws Exception {

		mvc.perform(get("/converters/wordconverter/nine")
				.contentType(MediaType.TEXT_HTML))
		.andExpect(status().is4xxClientError());
	}

}
