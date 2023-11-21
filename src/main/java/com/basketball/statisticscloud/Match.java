package com.basketball.statisticscloud;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "match")
@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatch;
    private Date dateMath;

    public Match() {
    }

    public Match(Long idMatch, Date dateMath) {
        this.idMatch = idMatch;
        this.dateMath = dateMath;
    }

    public Match(Date dateMath) {
        this.dateMath = dateMath;
    }

    public Long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }

    public Date getDateMath() {
        return dateMath;
    }

    public void setDateMath(Date dateMath) {
        this.dateMath = dateMath;
    }
}
