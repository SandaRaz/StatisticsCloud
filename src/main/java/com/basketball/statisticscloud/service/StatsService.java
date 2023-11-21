package com.basketball.statisticscloud.service;

import com.basketball.statisticscloud.Joueur;
import com.basketball.statisticscloud.Match;
import com.basketball.statisticscloud.Stats;
import com.basketball.statisticscloud.repository.JoueurRepository;
import com.basketball.statisticscloud.repository.MatchRepository;
import com.basketball.statisticscloud.repository.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class StatsService {
    @Autowired
    private StatsRepository statsRepository;
    @Autowired
    private JoueurRepository joueurRepository;
    @Autowired
    private MatchRepository matchRepository;

    public Stats insererStats(Long idJoueur,double minJoue,double point,double passeDec,double rebond,Long idMatch){
        Optional<Joueur> optJoueur = joueurRepository.findById(idJoueur);
        Joueur joueur = null;
        if(optJoueur.isPresent()){
            joueur = optJoueur.get();
        }
        Optional<Match> optMatch = matchRepository.findById(idMatch);
        Match match = null;
        if(optMatch.isPresent()){
            match = optMatch.get();
        }

        Stats stats = new Stats(joueur, minJoue,point,passeDec,rebond,match);

        return statsRepository.save(stats);
    }
}
