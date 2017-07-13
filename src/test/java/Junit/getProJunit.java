package Junit;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.Application;
import com.config.MyJdbcPro;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.test.context.SpringBootTest;




@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)  
public class getProJunit {
	 @Autowired
	 private MyJdbcPro myJdbcPro;
	 
	 @Before
	 public void setUp() throws Exception {
		 
	 }

	 @Test
	 public void getHello() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("--------------------------------------------------------------DriverClassName: " + objectMapper.writeValueAsString(myJdbcPro.getDriverClassName()));    
	 
	 }
}
