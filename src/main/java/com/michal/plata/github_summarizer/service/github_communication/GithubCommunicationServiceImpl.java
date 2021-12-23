package com.michal.plata.github_summarizer.service.github_communication;

import java.io.IOException;

import com.michal.plata.github_summarizer.dto.github_data.GithubDataDTO;
import com.michal.plata.github_summarizer.dto.github_data.GithubDataDTOImpl;
import com.michal.plata.github_summarizer.support.printer.Printer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Service;

@Service
public class GithubCommunicationServiceImpl implements GithubCommunicationService {

    private Logger logger = LogManager.getLogger(GithubCommunicationServiceImpl.class);

    @Override
    public GithubDataDTO getData(String username) {
        GitHub gitHub;
        try {
            gitHub = GitHub.connectAnonymously();
        } catch (IOException e) {
            logger.log(Level.FATAL, "There was an error connecting to GitHub");
            e.printStackTrace();
            return null;
        }
        Long id;
        try {
            id = gitHub.getUser(username).getId();
        } catch (IOException e) {
            logger.log(Level.FATAL, "There was an error retrieving your name from github");
            e.printStackTrace();
            return null;
        }
        Printer.print("Github says that your id is " + Long.toString(id));
        return new GithubDataDTOImpl();
    }

}
