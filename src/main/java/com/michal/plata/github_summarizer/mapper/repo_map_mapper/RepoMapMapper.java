package com.michal.plata.github_summarizer.mapper.repo_map_mapper;

import java.util.Map;

import com.michal.plata.github_summarizer.dto.repo_data.RepoDataDTOImpl;

import org.kohsuke.github.GHRepository;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RepoMapMapper {
    RepoMapMapper INSTANCE = Mappers.getMapper(RepoMapMapper.class);

    Map<String,RepoDataDTOImpl> mapRepoToMapRepoDTO(Map<String, GHRepository> map);
}
