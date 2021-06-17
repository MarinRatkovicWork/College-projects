
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class LAPTOP extends RACUNALO {
    
    private float VelicinaZaslona;

    public LAPTOP(float VelicinaZaslona, String naziv, float cijena) {
        super(naziv, cijena);
        this.VelicinaZaslona = VelicinaZaslona;
    }

    /**
     * @return the VelicinaZaslona
     */
    public float getVelicinaZaslona() {
        return VelicinaZaslona;
    }

    /**
     * @param VelicinaZaslona the VelicinaZaslona to set
     */
    public void setVelicinaZaslona(float VelicinaZaslona) {
        this.VelicinaZaslona = VelicinaZaslona;
    }

    @Override
    public void UPIS() {        
         File Datoteka = new File("PismeniIspit\\PODACI.txt");  
        try {
            FileWriter UnesiUDatoteku= new FileWriter("PODACI.txt",true);          
            UnesiUDatoteku.write("Naziv Laptopa : "+naziv+"\n");     
            UnesiUDatoteku.write("Cijena Laptopa: "+cijena+"\n"); 
            UnesiUDatoteku.write("VelicinaZaslona: "+VelicinaZaslona+"\n"); 
            UnesiUDatoteku.write("------------------------------------------- \n"); 
            UnesiUDatoteku.close();
             } catch (IOException ex) {
            Logger.getLogger(RACUNALO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
}
