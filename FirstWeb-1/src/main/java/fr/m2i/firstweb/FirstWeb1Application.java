package fr.m2i.firstweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

import fr.m2i.firstweb.config.ConfigApp;

@SpringBootApplication
public class FirstWeb1Application implements CommandLineRunner{

	@Value("${server.port : 8080}")
	String appName;
	
	
	@Value("${application.auteur}")
	String auteur;
	
	@Value("${application.version}")
	String version;

	
	@Autowired
	ConfigApp bddConfig;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FirstWeb1Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Version : " + version);
		System.out.println("Auteur : " + auteur);
		
	}

	
	/*
	 * 
	 * CREER UNE APPLICATION CONSOLE
	 * 
	 * Qui affiche en utilisant un @ConfigurationProperties
	 * 3 informations sur la base de donnée.
	 * 
	 * qui affiche avec @Value()
	 * une information sur : l'auteur de l'appli et la date de creation de l'application / ou un numero version
	 * 
	 */
	
	
}
