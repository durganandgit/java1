package com.dn.java1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java1Application implements CommandLineRunner {

	@Autowired
	private CakeBaker cakeBaker;
	public static void main(String[] args) {
		SpringApplication.run(Java1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cakeBaker.bakeCake());

	}
}
