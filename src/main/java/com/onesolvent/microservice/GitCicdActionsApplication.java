package com.onesolvent.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitCicdActionsApplication {

	@GetMapping("/get")
	public String get() {
		return "CI-CD by GITHUB";
	}
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
