package Junit;

import java.net.URL;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.Application;
import com.config.MyServerYml;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.test.context.SpringBootTest;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)  
public class getYmlJunit {
	 @Autowired
	 private MyServerYml myServer;

	 private URL base;
	 
	 @Before
	 public void setUp() throws Exception {
		String str="http://localhost:" + myServer.getPort() + "/";
		this.base = new URL(str);
	 }

	 @Test
	 public void getHello() throws Exception {
		 
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("--------------------------------------------------------------url:"+ objectMapper.writeValueAsString(base));
		System.out.println("--------------------------------------------------------------arrayProps: " + objectMapper.writeValueAsString(myServer.getPort()));    
	 
	 }
}
