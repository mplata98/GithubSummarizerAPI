package com.michal.plata.github_summarizer.dto.repo_data;

import java.util.Map;


public interface RepoDataDTO {
    //Getters
    String getRepoName();
    String getDescription();
    Map<String,Long> getLanguages();
    Long getNumberOfCollaborators();
    Long getNumberOfStargazers();
    Long getNumberOfWatchers();

    //Setters
    void setRepoName(String name);
    void setDescription(String description);
    void setLanguages(Map<String, Long> languages);
    void setNumberOfCollaborators(Long numberOfCollaborators);
    void setNumberOfStargazers(Long numberOfStargazers);
    void setNumberOfWatchers(Long numberOfWatchers);
}
