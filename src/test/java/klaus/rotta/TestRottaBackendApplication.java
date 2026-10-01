package klaus.rotta;

import org.springframework.boot.SpringApplication;

public class TestRottaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(RottaBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
