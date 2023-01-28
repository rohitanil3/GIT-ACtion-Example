package com.onesolvent.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitCicdActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitCicdActionsApplication.class, args);
	}

	
//	echo "# GIT-ACtion-Example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/rohitanil3/GIT-ACtion-Example.git
//	git push -u origin main
}
