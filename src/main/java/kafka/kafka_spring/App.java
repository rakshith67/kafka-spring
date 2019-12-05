package kafka.kafka_spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(ProducerSpring.class, args);
	}
}
