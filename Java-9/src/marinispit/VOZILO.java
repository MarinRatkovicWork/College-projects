/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marinispit;

/**
 *
 * @author Marin
 */
abstract  class VOZILO {
    String naziv;
    int cijena;
    String proizvodac;

    public VOZILO(String naziv, int cijena, String proizvodac) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.proizvodac = proizvodac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }
    abstract void ISPIS();
    
}
