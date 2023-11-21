package com.basketball.statisticscloud;

import jakarta.persistence.*;

import java.util.Date;

@Table(name="joueur")
@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJoueur;
    private String nom;
    private Date naissance;

    private double height;
    private double weight;
    @ManyToOne
    @JoinColumn(name="idEquipe")
    private Equipe equipe;

    public Joueur() {
    }

    public Joueur(Long idJoueur, String nom, Date naissance, double height, double weight, Equipe equipe) {
        this.idJoueur = idJoueur;
        this.nom = nom;
        this.naissance = naissance;
        this.height = height;
        this.weight = weight;
        this.equipe = equipe;
    }

    public Joueur(String nom, Date naissance, double height, double weight, Equipe equipe) {
        this.nom = nom;
        this.naissance = naissance;
        this.height = height;
        this.weight = weight;
        this.equipe = equipe;
    }

    public Long getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Long idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
