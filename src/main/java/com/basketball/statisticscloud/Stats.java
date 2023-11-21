package com.basketball.statisticscloud;

import jakarta.persistence.*;

@Table(name="stats")
@Entity
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStats;

    @ManyToOne
    @JoinColumn(name="idEquipe")
    private Joueur joueur;
    private double minJoue;
    private double point;
    private double passeDec;
    private double rebond;
    @ManyToOne
    @JoinColumn(name="idMatch")
    private Match match;

    public Stats() {
    }

    public Stats(Long idStats, Joueur joueur, double minJoue, double point, double passeDec, double rebond, Match match) {
        this.idStats = idStats;
        this.joueur = joueur;
        this.minJoue = minJoue;
        this.point = point;
        this.passeDec = passeDec;
        this.rebond = rebond;
        this.match = match;
    }

    public Stats(Joueur joueur, double minJoue, double point, double passeDec, double rebond, Match match) {
        this.joueur = joueur;
        this.minJoue = minJoue;
        this.point = point;
        this.passeDec = passeDec;
        this.rebond = rebond;
        this.match = match;
    }

    public Long getIdStats() {
        return idStats;
    }

    public void setIdStats(Long idStats) {
        this.idStats = idStats;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public double getMinJoue() {
        return minJoue;
    }

    public void setMinJoue(double minJoue) {
        this.minJoue = minJoue;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public double getPasseDec() {
        return passeDec;
    }

    public void setPasseDec(double passeDec) {
        this.passeDec = passeDec;
    }

    public double getRebond() {
        return rebond;
    }

    public void setRebond(double rebond) {
        this.rebond = rebond;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
