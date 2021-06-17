
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
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
public class IspitMarin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
      /*
//Zadatak1
        String text= "Najveca bitka se vodi u nama samima. \n Niti jedan plan ne prezivi kontakt sa neprijateljom. \n Samo su mrtvi vidjeli kraj rata. \n Nikad nije bilo dobrog rata i loseg mira.  ";
        System.out.println(text);
       ODREDI(text);
       
       //Zadatak2
       System.out.println("Koliko studenata zelite unesti");
        ArrayList<STUDENT> array = new ArrayList<STUDENT>();
        Scanner scanner= new Scanner(System.in);
        int brojStudenata = Integer.parseInt(scanner.nextLine());
        try{
            array =STUDENT.Unesi(brojStudenata);
            for(STUDENT student : array){
                System.out.println("Ime: " + student.getImeStudenta() + " Godina studija: " + student.getGodinaStudija());
            }
        }catch(Exception e){
            System.out.println("Greska!!");
        }
        */
        //Zadatak 3
       new DATOTEKA().start();
    }
    
    
   public static void ODREDI(String tekst){
       Vector RijeciSaM = new Vector();
       String[] rijeci=tekst.split(" ");
       for(String rijec:rijeci){
           if( rijec.charAt(0)== 'm'|| rijec.charAt(0)== 'M' ){
              RijeciSaM.add(rijec);
           }       
       }
     System.out.println("Rijeci koje pocinju sa slovom M su: "+RijeciSaM);      
    }
   
   
   public static class DATOTEKA extends Thread{
  
    public void run(){
       try { 
        File TrenutniDirektorij = new File(".");
        String putanja = TrenutniDirektorij.getAbsolutePath();
        String TrazeniPut = putanja.substring(0, putanja.length() - TrenutniDirektorij.getCanonicalPath().length());
        File imena = new File(TrazeniPut+"Imena.txt");
         Scanner sc;
        
            sc = new Scanner(imena);     
           while(sc.hasNextLine()){
          String recenica = sc.nextLine();                                              
       String[] rijeci=recenica.split(" ");
       int najvece =0;
       for(String Imena:rijeci){           
           if( Imena.length()> najvece ){
              najvece = Imena.length();
           }       
       } 
       System.out.println("Najveca rijec sadrzi: " +najvece+ " karaktera");
           } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IspitMarin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IspitMarin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void exit(){
              
           }
   
   }
}
