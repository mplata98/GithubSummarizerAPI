package com.michal.plata.github_summarizer.dto.github_data;

import java.util.Map;

import com.michal.plata.github_summarizer.dto.repo_data.RepoDataDTOImpl;

import org.kohsuke.github.GHRepository;

public interface GithubDataDTO {
    //Setters
    void setName(String name);
    void setRepos(Map<String, GHRepository> repos);
    
    //Getters
    String getName();
    Map<String, RepoDataDTOImpl> getRepos();
    RepoDataDTOImpl getRepo(String name);
}