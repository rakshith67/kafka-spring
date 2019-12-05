package kafka.kafka_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

public class ConsumerSpring {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerSpring.class);

	@KafkaListener(topics = "programmingw_topic", groupId = "my-first-id")
	public void listenWithHeaders(@Payload String message) {
		LOGGER.info("Received Message: {}", message);
	}
}
