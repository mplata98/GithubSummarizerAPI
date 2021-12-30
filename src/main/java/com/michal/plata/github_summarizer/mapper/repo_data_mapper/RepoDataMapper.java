package com.michal.plata.github_summarizer.mapper.repo_data_mapper;

import com.michal.plata.github_summarizer.dto.repo_data.RepoDataDTOImpl;

import org.kohsuke.github.GHRepository;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RepoDataMapper {

    RepoDataMapper INSTANCE = Mappers.getMapper(RepoDataMapper.class);

    RepoDataDTOImpl repoDataToRepoDataDTO(GHRepository repoData);
    
}
