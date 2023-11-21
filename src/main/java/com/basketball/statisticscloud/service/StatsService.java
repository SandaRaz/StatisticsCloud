package com.basketball.statisticscloud.service;

import com.basketball.statisticscloud.repository.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {
    @Autowired
    private StatsRepository statsRepository;
}
