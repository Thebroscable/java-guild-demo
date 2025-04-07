package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		HashMap<String, Integer> leaderboard = new HashMap<>();
		leaderboard.put("Agnieszka Cieślak", 0);
		leaderboard.put("Grzegorz Kasperski", 0);
		leaderboard.put("Kamil Leśniak", 0);
		leaderboard.put("Marcin Janczurewicz", 0);
		leaderboard.put("Michał Surowiec", 0);

		System.out.println("PARTICIPANT   |   SCORE");
		for (Map.Entry<String, Integer> entry : leaderboard.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
