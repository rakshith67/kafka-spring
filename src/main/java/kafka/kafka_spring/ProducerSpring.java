package kafka.kafka_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class ProducerSpring {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerSpring.class);

	public void sendMessage(String topic, String message) {
		kafkaTemplate.send(topic, message);
		LOGGER.info("sent message: {}", message);
	}
}
