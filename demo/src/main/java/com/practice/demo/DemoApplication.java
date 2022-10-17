package com.practice.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		//String sql = "INSERT INTO teacher (id, name, age, subject) VALUES(" + " '3', 'Nancy', '36', 'Biology') ";

		//log.info("Creating tables");
		//jdbcTemplate.execute("create table teachers(" + "id serial, name varchar, age serial, subject varchar)");



	}
}
