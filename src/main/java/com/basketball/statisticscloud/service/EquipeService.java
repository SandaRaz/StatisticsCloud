package com.basketball.statisticscloud.service;

import com.basketball.statisticscloud.repository.EquipeRepository;
import com.basketball.statisticscloud.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {
    @Autowired
    private EquipeRepository equipeRepository;
}
