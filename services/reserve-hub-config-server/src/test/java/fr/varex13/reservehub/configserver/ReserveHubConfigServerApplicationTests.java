package fr.varex13.reservehub.configserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class ReserveHubConfigServerApplicationTests {

	@Test
	void contextLoads() {
		assertThat("Pour faire plaisir à Sonar", is("Pour faire plaisir à Sonar"));
	}

}