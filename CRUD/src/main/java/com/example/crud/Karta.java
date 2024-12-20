package com.example.crud;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Karta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String meno_drzitela;

    private String cislo_karty;

    private String expiracia_mesiac;

    private String expiracia_rok;

    private String cvc;


    public String getMeno_drzitela() {
        return meno_drzitela;
    }

    public void setMeno_drzitela(String meno_drzitela) {
        this.meno_drzitela = meno_drzitela;
    }

    public String getCislo_karty() {
        return cislo_karty;
    }

    public void setCislo_karty(String cislo_karty) {
        this.cislo_karty = cislo_karty;
    }

    public String getExpiracia_mesiac() {
        return expiracia_mesiac;
    }

    public void setExpiracia_mesiac(String expiracia_mesiac) {
        this.expiracia_mesiac = expiracia_mesiac;
    }

    public String getExpiracia_rok() {
        return expiracia_rok;
    }

    public void setExpiracia_rok(String expiracia_rok) {
        this.expiracia_rok = expiracia_rok;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public Karta() {

    }



    public Karta(String meno_drzitela, String cislo_karty, String expiracia_mesiac,String expiracia_rok, String cvc) {
        super();
        this.meno_drzitela = meno_drzitela;
        this.cislo_karty = cislo_karty;
        this.expiracia_mesiac = expiracia_mesiac;
        this.expiracia_rok = expiracia_rok;
        this.cvc = cvc;
    }
}
