package com.SpringBoot.SpringBootJava;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MainApp.class)
public class JavaIntegratinTest {
	
	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void test() throws Exception {
		 mockMvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content()
		.contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(content().json("{\"manufacturer\":\"Honda\",\"name\":\"Civic\"},{\"manufacturer\":\"Nissan\",\"name\":\"Sentra\"}",true))
		.andDo(MockMvcResultHandlers.print()).andReturn();
	}
}
