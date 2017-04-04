package com.example.soliton.anefepan0_1;

/**
 * Created by User on 4/4/2017.
 */

public class Postman {

    private String proorismos;
    private double varos;

    public Postman(String proorismos, double varos) {
        this.proorismos = proorismos;
        this.varos = varos;
    }

    public Postman() {
    }

    public String getProorismos() {
        return proorismos;
    }

    public void setProorismos(String proorismos) {
        this.proorismos = proorismos;
    }

    public double getVaros() {
        return varos;
    }

    public void setVaros(double varos) {
        this.varos = varos;
    }

    @Override
    public String toString() {
        return "Postman{" +
                "proorismos='" + proorismos + '\'' +
                ", varos=" + varos +
                '}';
    }


    public double computeXreosi() {
        double xreosi = 0;
        if (proorismos.equalsIgnoreCase("Εσωτερικο")) {
            if (getVaros() <= 1000)
                xreosi = 2.0;
            else if (getVaros() <= 2000)
                xreosi = 3.5;
            else
                xreosi = 4.2;
        } else {
            if (getVaros() <= 1000)
                xreosi = 4.8;
            else if (getVaros() <= 2000)
                xreosi = 7.2;
            else
                xreosi = 11.5;
        }

        return xreosi;


    }
}
