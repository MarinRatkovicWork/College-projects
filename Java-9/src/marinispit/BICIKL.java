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
public class BICIKL extends VOZILO{
    int brzina;
    int velicinakotaca;

    public BICIKL(int brzina, int velicinakotaca, String naziv, int cijena, String proizvodac) {
        super(naziv, cijena, proizvodac);
        this.brzina = brzina;
        this.velicinakotaca = velicinakotaca;
    }


    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public int getVelicinakotaca() {
        return velicinakotaca;
    }

    public void setVelicinakotaca(int velicinakotaca) {
        this.velicinakotaca = velicinakotaca;
    }

    @Override
    public void ISPIS() {
        System.out.println("Naziv bicikla : "+ naziv);
        System.out.println("Cijena bicikla : "+ cijena +" kn" );
        System.out.println("Naziv proizvođača bicikla : "+ proizvodac);       
        System.out.println("Brzina bicikla : "+brzina +" km/h");
        System.out.println("Veličina kotača bicikla : "+velicinakotaca+ " cm" );
        System.out.println("_______________________________________________________");
    }
    
}
