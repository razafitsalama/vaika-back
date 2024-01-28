package com.Vaika.modele;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StatistiqueMarque {
    @Id
    @Column(name="idmarque")
    Long idMarque;

    @Column(name = "count")
    double countMarque;

    @Column(name = "marque")
    String marque;

    public StatistiqueMarque(Long idMarque, double countMarque, String marque) {
        this.idMarque = idMarque;
        this.countMarque = countMarque;
        this.marque = marque;
    }

    public StatistiqueMarque() {
    }

    public Long getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(Long idMarque) {
        this.idMarque = idMarque;
    }

    public double getCountMarque() {
        return countMarque;
    }

    public void setCountMarque(double countMarque) {
        this.countMarque = countMarque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
