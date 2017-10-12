package com.mka.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class WeatherResourceIntTest {

	
	private MockMvc restWeatherMockMvc;
	
	@Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        WeatherResource weatherResource = new WeatherResource();
        this.restWeatherMockMvc = MockMvcBuilders.standaloneSetup(weatherResource).build();
    }
	@Ignore
	@Test
	public void getWeatherInLocation() throws Exception {
      
        // Get the user
		restWeatherMockMvc.perform(get("/api/weather/{location}", "oulu"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.location").value("Oulu"))
            .andExpect(jsonPath("$.tempature").value("1"))
            .andExpect(jsonPath("$.wind").value("2"))
            .andExpect(jsonPath("$.windfrom").value("3"))
            .andExpect(jsonPath("$.icon").value("4"))
            .andExpect(jsonPath("$.weatherDate").value("5"));
    }
	
}
