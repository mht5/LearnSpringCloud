package com.mhts.springcloud;

import com.mhts.springcloud.stream.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StreamHelloApplicationTests {

	@Autowired
//	private SinkSender sinkSender;
	private MessageChannel myTopic;

	@Test
	public void contextLoads() {
//		sinkSender.output().send(MessageBuilder.withPayload("From SinkSender").build());
		myTopic.send(MessageBuilder.withPayload("From SinkSender").build());
	}

}
