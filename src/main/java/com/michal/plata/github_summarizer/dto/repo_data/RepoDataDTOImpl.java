package com.michal.plata.github_summarizer.dto.repo_data;

import java.util.Map;

public class RepoDataDTOImpl implements RepoDataDTO {

    private String name;
    private String description;
    private Map<String, Long> languages;
    private Long numberOfCollaborators;
    private Long numberOfStargazers;
    private Long numberOfWatchers;

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public Map<String, Long> getLanguages() {
        return languages;
    }
    
    @Override
    public void setLanguages(Map<String, Long> languages) {
        this.languages = languages;
    }
    
    @Override
    public Long getNumberOfCollaborators() {
        return numberOfCollaborators;
    }
    
    @Override
    public void setNumberOfCollaborators(Long numberOfCollaborators) {
        this.numberOfCollaborators = numberOfCollaborators;
    }
    
    @Override
    public Long getNumberOfStargazers() {
        return numberOfStargazers;
    }
    
    @Override
    public void setNumberOfStargazers(Long numberOfStargazers) {
        this.numberOfStargazers = numberOfStargazers;
    }
    
    @Override
    public Long getNumberOfWatchers() {
        return numberOfWatchers;
    }
    
    @Override
    public void setNumberOfWatchers(Long numberOfWatchers) {
        this.numberOfWatchers = numberOfWatchers;
    }

}
