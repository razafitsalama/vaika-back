package com.Vaika.modele;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StatistiqueDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "dates")
    private Date dates;

    @Column(name = "nombre_annonces")
    private double nombreAnnonces;

    public StatistiqueDate(Date dates, double nombreAnnonces) {
        this.dates = dates;
        this.nombreAnnonces = nombreAnnonces;
    }

    public StatistiqueDate() {
    }

    public Long getId() {
        return id;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public double getNombreAnnonces() {
        return nombreAnnonces;
    }

    public void setNombreAnnonces(double nombreAnnonces) {
        this.nombreAnnonces = nombreAnnonces;
    }
}
