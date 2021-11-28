package pers.justin.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@SpringBootTest
class KafkaApplicationTests {

	@Test
	void contextLoads() {
		Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
		Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
		long time = new Date().getTime();
		System.out.println(milliSecond);
		System.out.println(time);

		System.out.printf("123%c", '1');
		System.out.print("123");
	}

}
