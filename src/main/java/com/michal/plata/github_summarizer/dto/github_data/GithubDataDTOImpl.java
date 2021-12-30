package com.michal.plata.github_summarizer.dto.github_data;

import java.util.Map;

import com.michal.plata.github_summarizer.dto.repo_data.RepoDataDTOImpl;
import com.michal.plata.github_summarizer.mapper.repo_map_mapper.RepoMapMapper;

import org.kohsuke.github.GHRepository;

public class GithubDataDTOImpl implements GithubDataDTO {
    private String name;
    private Map<String, RepoDataDTOImpl> repos;

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public Map<String, RepoDataDTOImpl> getRepos() {
        return repos;
    }
    
    @Override
    public void setRepos(Map<String, GHRepository> repos) {
        this.repos = RepoMapMapper.INSTANCE.mapRepoToMapRepoDTO(repos);
    }

    @Override
    public RepoDataDTOImpl getRepo(String name) {
        return repos.get(name);
    }

}
