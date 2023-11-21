package com.basketball.statisticscloud.service;

import com.basketball.statisticscloud.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurService {
    @Autowired
    private JoueurRepository joueurRepository;
}
