package com.test;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.Application;

import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;




@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes=Application.class)
public class Junit {
	 @LocalServerPort
	 private int port;

	 private URL base;

	 @Autowired
	 private TestRestTemplate template;

	 @Before
	 public void setUp() throws Exception {
	    this.base = new URL("http://localhost:" + port + "/");
	    //this.base = new URL("http://localhost:8080/");
	 }

	 @Test
	 public void getHello() throws Exception {
		//获取选定的地址页面信息
	    ResponseEntity<String> response = template.getForEntity(base.toString(),
	                String.class);
	    System.out.println("=================================================================="+response.getBody());
	 }

}
