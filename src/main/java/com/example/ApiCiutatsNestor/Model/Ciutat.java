package com.example.ApiCiutatsNestor.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Ciutat {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    private int poblacio;
    private String descripcio;
    private String imatge;

    public Ciutat() {
    }

    public Ciutat(Long id, String nom, int poblacio, String descripcio, String imatge) {
        this.id = id;
        this.nom = nom;
        this.poblacio = poblacio;
        this.descripcio = descripcio;
        this.imatge = imatge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(int poblacio) {
        this.poblacio = poblacio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getImatge() {
        return imatge;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }

    @Override
    public String toString() {
        return "Ciutat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", poblacio=" + poblacio +
                ", descripcio='" + descripcio + '\'' +
                ", imatge='" + imatge + '\'' +
                '}';
    }
}
