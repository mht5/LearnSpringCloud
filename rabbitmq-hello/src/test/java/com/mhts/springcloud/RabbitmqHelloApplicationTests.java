package com.mhts.springcloud;

import com.mhts.springcloud.rabbit.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RabbitmqHelloApplicationTests {

	@Autowired
	Sender sender;

	@Test
	public void contextLoads() {
	}

	@Test
	public void hello() {
		sender.send();
	}

}
