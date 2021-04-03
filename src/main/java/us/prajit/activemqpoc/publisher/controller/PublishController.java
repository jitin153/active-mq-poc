package us.prajit.activemqpoc.publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import us.prajit.activemqpoc.model.Message;

@RestController
public class PublishController {
	private static final String DESTINATION_QUEUE = "my-msg-queue";
	@Autowired
	private JmsTemplate jsmTemplate;

	@PostMapping("/publish")
	public ResponseEntity<String> publishMsg(@RequestBody Message msg) {
		try {
			jsmTemplate.convertAndSend(DESTINATION_QUEUE, msg);
			return new ResponseEntity<>("Message successfully published.", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
