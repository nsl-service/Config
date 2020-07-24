package com.nsl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootTest
@EnableAutoConfiguration
@EnableConfigServer
class ServerConfigApplicationTests {

	@Test
	void contextLoads() {
	}

}
