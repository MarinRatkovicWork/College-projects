/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marin
 */
public class Mobitel {
    private String naziv;
    private Float cijena;

    public Mobitel(String naziv, Float cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public Mobitel() {
    }

    /**
     * @return the naziv
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * @param naziv the naziv to set
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    /**
     * @return the cijena
     */
    public Float getCijena() {
        return cijena;
    }

    /**
     * @param cijena the cijena to set
     */
    public void setCijena(Float cijena) {
        this.cijena = cijena;
    }
   
    

    
    
    
}
