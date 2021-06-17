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
public class AUTO extends VOZILO{
    
   private int zapremnina;
   private int brzina;

    public AUTO(int zapremnina, int brzina, String naziv, int cijena, String proizvodac) {
        super(naziv, cijena, proizvodac);
        this.zapremnina = zapremnina;
        this.brzina = brzina;
    }

    

    /**
     * @return the zapremnina
     */
    public int getZapremnina() {
        return zapremnina;
    }

    /**
     * @param zapremnina the zapremnina to set
     */
    public void setZapremnina(int zapremnina) {
        this.zapremnina = zapremnina;
    }

    /**
     * @return the brzina
     */
    public int getBrzina() {
        return brzina;
    }

    /**
     * @param brzina the brzina to set
     */
    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    @Override
    public void ISPIS() {  
      
        System.out.println("Naziv auta : "+ naziv);
        System.out.println("Cijena auta : "+ cijena +" kn" );
        System.out.println("Naziv proizvođača auta : "+ proizvodac);       
        System.out.println("Volumen auta : " +zapremnina+ " cm2" );
        System.out.println("Brzina auta : " +brzina + " km/h");
        System.out.println("_______________________________________________________");
    }

  
    
}
