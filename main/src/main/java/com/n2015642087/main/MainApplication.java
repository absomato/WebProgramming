package com.n2015642087.main;

import com.n2015642087.main.domain.Basic;
import com.n2015642087.main.domain.Profile;
import com.n2015642087.main.repository.BasicRepository;
import com.n2015642087.main.repository.ProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(BasicRepository basicRepository, ProfileRepository profileRepository){
		return {
			basicRepository.save(Basic.builder()
			.name("홍길동")
			.label("CEO")
			.email("hone@gmail.com")
			.phone("012-123-4567")
			.build());
		basicRepository.save(Basic.builder()
				.name("장길산")
				.label("CEO")
				.email("jang@gmail.com")
				.phone("123-456-7890")
				.build());
		basicRepository.save(Basic.builder()
				.name("춘향이")
				.label("CEO")
				.email("chun@gmail.com")
				.phone("234-567-8901")
				.build());
		profileRepository.save(Profile.builder()
		.network("트위터")
		.userName("@home")
		.url("https://www.twitter.com/@home")
		.createdDate(LocalDateTime.now())
		.build());

		profileRepository.save(Profile.builder()
				.network("페이스북")
				.userName("@home")
				.url("https://www.twitter.com/@home")
				.createdDate(LocalDateTime.now())
				.build());
		profileRepository.save(Profile.builder()
				.network("인스타그램")
				.userName("@home")
				.url("https://www.twitter.com/@home")
				.createdDate(LocalDateTime.now())
				.build());
		}
	}
}
