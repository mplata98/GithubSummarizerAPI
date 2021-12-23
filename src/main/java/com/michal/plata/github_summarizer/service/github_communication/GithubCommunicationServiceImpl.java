package com.michal.plata.github_summarizer.service.github_communication;

import java.io.IOException;
import java.util.Map;

import com.michal.plata.github_summarizer.dto.github_data.GithubDataDTO;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Service;

@Service
public class GithubCommunicationServiceImpl implements GithubCommunicationService {

    private Logger logger = LogManager.getLogger(GithubCommunicationServiceImpl.class)

    @Override
    public GithubDataDTO getData(String username) {
        try {
            GitHub gitHub = GitHub.connectAnonymously();
        } catch (IOException e) {
            logger.log(Level.FATAL, "There was an error connecting to GitHub");
        }
        return null;
    }

}
