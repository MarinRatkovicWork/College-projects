
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marin
 */
public class RACUNALO {
     String naziv;
     float cijena;

    public RACUNALO(String naziv, float cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    RACUNALO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public float getCijena() {
        return cijena;
    }

    /**
     * @param cijena the cijena to set
     */
    public void setCijena(float cijena) {
        this.cijena = cijena;
    }
   

 public void UPIS() {    
        //Kreiranje datoteke
        File Datoteka = new File("PismeniIspit\\PODACI.txt");  
        try {
            FileWriter UnesiUDatoteku= new FileWriter("PODACI.txt",true);          
            UnesiUDatoteku.write("Naziv : "+naziv+"\n");     
            UnesiUDatoteku.write("Cijena : "+cijena+"\n"); 
            UnesiUDatoteku.write("------------------------------------------- \n"); 
            UnesiUDatoteku.close();
             } catch (IOException ex) {
            Logger.getLogger(RACUNALO.class.getName()).log(Level.SEVERE, null, ex);
            }
      
         
}
}
