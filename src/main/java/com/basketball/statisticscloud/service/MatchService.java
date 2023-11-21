package com.basketball.statisticscloud.service;

import com.basketball.statisticscloud.Match;
import com.basketball.statisticscloud.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;

    public Match ajouterMatch(Date dateMatch) {
        Match nouveauMatch = new Match(dateMatch);
        return matchRepository.save(nouveauMatch);
    }

    public Optional<Match> recupererMatch(Long idMatch) {
        return matchRepository.findById(idMatch);
    }
}
