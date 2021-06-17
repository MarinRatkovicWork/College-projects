/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author mev
 */
public class Avion {
    
    private String proizvodac;
    private int maxPutnika;

    public Avion(String proizvodac, int maxPutnika) {
        this.proizvodac = proizvodac;
        this.maxPutnika = maxPutnika;
    }

    /**
     * Get the value of proizvodac
     *
     * @return the value of proizvodac
     */
    public String getProizvodac() {
        return proizvodac;
    }

    /**
     * Set the value of proizvodac
     *
     * @param proizvodac new value of proizvodac
     */
    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }


    /**
     * Get the value of maxPutnika
     *
     * @return the value of maxPutnika
     */
    public int getMaxPutnika() {
        return maxPutnika;
    }

    /**
     * Set the value of maxPutnika
     *
     * @param maxPutnika new value of maxPutnika
     */
    public void setMaxPutnika(int maxPutnika) {
        this.maxPutnika = maxPutnika;
    }

}
