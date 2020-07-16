package com.mhts.springcloud.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.SendTo;

import java.util.Date;

//@EnableBinding(value = {Source.class, SinkSender.class})
@EnableBinding(Processor.class)
public class SinkReceiver {

//    @StreamListener("myTopic")
//    @SendTo(Source.OUTPUT)
//    public String receive(Object payload) {
//        System.out.println("Received: " + payload);
//        return "Feedback: " + payload;
//    }
//
//    @StreamListener(Source.OUTPUT)
//    public void receive1(String msg) {
//        System.out.println("Received: "+msg);
//    }

    @StreamListener(Processor.INPUT)
    public void receive(Date date) {
        System.out.println("Received: " + date);
    }
}
