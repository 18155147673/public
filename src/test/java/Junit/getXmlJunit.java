package Junit;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class getXmlJunit {
	@Resource
	Date date;
	@Test
	public void getDate(){
		System.out.println("sssssssssssssssssssssssssssssssssssssssssssssss"+date.toString());
	}

}
