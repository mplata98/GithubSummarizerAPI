package com.michal.plata.github_summarizer.service.github_communication;

import java.io.IOException;

import com.michal.plata.github_summarizer.dto.github_data.GithubDataDTO;
import com.michal.plata.github_summarizer.dto.github_data.GithubDataDTOImpl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Service;

@Service
public class GithubCommunicationServiceImpl implements GithubCommunicationService {

    private Logger logger = LogManager.getLogger(GithubCommunicationServiceImpl.class);

    @Override
    public GithubDataDTO getData(String username) {
        try{
            GitHub gitHub = connectToGithub();
            GHUser user = getGitHubUser(gitHub, username);
            return loadDataFromGithub(user);
        } catch (NullPointerException exception){
            logger.log(Level.FATAL, "An error ocurred while downloading data, see logs for further info:");
            exception.printStackTrace();
            return new GithubDataDTOImpl();
        }
    }

    private GitHub connectToGithub(){
        try {
            return GitHub.connectAnonymously();
        } catch (IOException e) {
            logger.log(Level.FATAL, "There was an error connecting to GitHub");
            e.printStackTrace();
            return null;
        }
    }

    private GHUser getGitHubUser(GitHub gitHub, String username){
        try {
            return gitHub.getUser(username);
        } catch (IOException e) {
            logger.log(Level.FATAL, "There was an error retrieving user from GitHub");
            e.printStackTrace();
            return null;
        }
    }

    private GithubDataDTO loadDataFromGithub(GHUser user){
        GithubDataDTO dataDTO = new GithubDataDTOImpl();

        try {
            dataDTO.setName(user.getName());
            dataDTO.setRepos(user.getRepositories());
        } catch (IOException e) {
            logger.log(Level.FATAL, "There was an error retrieving user data from GitHub");
            e.printStackTrace();
            return null;
        }
        return dataDTO;
    }

}
