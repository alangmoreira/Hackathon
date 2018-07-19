package br.com.itau.datagenerator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataGeneratorApplication implements CommandLineRunner {

    public static void main(String[] args) {
    	try {
    		SpringApplication.run(DataGeneratorApplication.class, args);	
		} catch (Exception e) {
			// TODO: handle exception
		}	
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
