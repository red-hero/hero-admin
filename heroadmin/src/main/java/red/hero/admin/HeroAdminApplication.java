package red.hero.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import red.hero.admin.server.bo.staff.Member;
import red.hero.admin.server.bo.staff.MemberRepository;

@SpringBootApplication
public class HeroAdminApplication {

	private static final Logger log = LoggerFactory.getLogger(HeroAdminApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HeroAdminApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(MemberRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Member("Jack", "Bauer"));
			repository.save(new Member("Chloe", "O'Brian"));
			repository.save(new Member("Kim", "Bauer"));
			repository.save(new Member("David", "Palmer"));
			repository.save(new Member("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Member customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Member customer = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastNameStartsWithIgnoreCase('Bauer'):");
			log.info("--------------------------------------------");
			for (Member bauer : repository
					.findByLastNameStartsWithIgnoreCase("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
		};
	}
}
