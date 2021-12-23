package com.michal.plata.github_summarizer.service.github_communication;

import com.michal.plata.github_summarizer.dto.github_data.GithubDataDTO;

public interface GithubCommunicationService {

    public GithubDataDTO getData(String username);

}
