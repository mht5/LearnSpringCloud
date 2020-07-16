package com.mhts.springcloud.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {

    @Output("myTopic")
    MessageChannel output();
}
