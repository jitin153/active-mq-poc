package us.prajit.activemqpoc.consumer.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import us.prajit.activemqpoc.model.Message;

@Component
public class MessageConsumer {

	private static final Logger LOG = LoggerFactory.getLogger(MessageConsumer.class);

	@JmsListener(destination = "my-msg-queue")
	public void listenMsg(Message msg) {
		LOG.info("Received message: {}", msg);
	}
}
