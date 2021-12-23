package com.michal.plata.github_summarizer;

import javax.annotation.PostConstruct;

import com.michal.plata.github_summarizer.service.github_communication.GithubCommunicationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubSummarizerApplication {

	private GithubCommunicationService githubCommunicationService;

	public GitHubSummarizerApplication(GithubCommunicationService githubCommunicationService) {
		this.githubCommunicationService = githubCommunicationService;
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubSummarizerApplication.class, args);
	}

	@PostConstruct
	public void init() {
		githubCommunicationService.getData("mplata98");
	}

}
