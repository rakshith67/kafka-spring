package kafka.kafka_spring;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaAdmin;

public class TopicConfiguration {

	@Bean
	public KafkaAdmin kafkaAdmin() {
		String bootstrapAddress = "localhost:9092";
		Map<String, Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
		return new KafkaAdmin(configs);
	}

	@Bean
	public NewTopic topic1() {
		return new NewTopic("programmingw_topic", 1, (short) 1);
	}
}
