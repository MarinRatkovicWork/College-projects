/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marinispit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marin
 */
public class MarinIspit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Zadatak jedan provjera
        Zadatak1ProvjeraIspravnosti();
        //Zadatak dva 
        //2D polje 30*30
        int red = 30, stupac = 30;
    String[][] arr = new String[red][stupac];    
    for (int row = 0; row < arr.length; row++){
	for (int col = 0; col < arr[row].length; col++){
    	arr[row][col] = NasumicniString();
        }
    }
        /*Isprobavanje sa jednostavnim poljem
        String Polje[][] = {
           
            {"aa","dsfadfadfsdf","safsdasdasdsd","asdfasdasdsd","afsadadasdas"},
            {"aaaadfsabdfsc","dsfadfsdfsadfsdf","aa","asdfsdfasdasdsd","afsadadasdfsdas"}    
            };
       */
        //Parametri za zadatak 2
        int brojPonavljanja;
        char TrazeniKarakter;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi slovo čij broj ponavljanja se traži.");
        TrazeniKarakter = scanner.nextLine().charAt(0);
        System.out.println("Unesite željeni broj ponavljanja.");
        brojPonavljanja = scanner.nextInt();
        //Kreiranje datoteke
        File Datoteka = new File("MarinIspit\\rijeci.txt");
        
        
        RIJECI(arr,brojPonavljanja,TrazeniKarakter);
    }
    
    public static void Zadatak1ProvjeraIspravnosti (){
        VOZILO bicikl1 = new BICIKL(60,250,"Trek Serija 5",1000,"Trek");
        bicikl1.ISPIS();
        
        VOZILO auto1 = new AUTO (1200,320,"Audi A8",430000,"Audi");
        auto1.ISPIS();
    }
    public static String NasumicniString(){
       
    String abeceda = "abcčćddžđefghijklljmnnjoprsštuvzž";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    int duzinanasumicnerijeci = 5;
    for(int i = 0; i < duzinanasumicnerijeci; i++) {
      int index = random.nextInt(abeceda.length());
      char randomChar = abeceda.charAt(index);
      sb.append(randomChar);
    }
    String nasumicniString = sb.toString();
    return nasumicniString;

    }
    public static void RIJECI(String[][] rijeci, int brojPonavljanja, char trazeniKarakter){
       
        
        String newLine = System.getProperty("line.separator");
        try {
            FileWriter UnesiUDatoteku= new FileWriter("rijeci.txt",true);          
            UnesiUDatoteku.write("Traženi karakter : "+trazeniKarakter+newLine);     
            UnesiUDatoteku.write("Broj ponavljanj : "+brojPonavljanja+newLine); 
            UnesiUDatoteku.write("-------------------------------------------"+newLine); 
            UnesiUDatoteku.close();
             } catch (IOException ex) {
            Logger.getLogger(MarinIspit.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        int rijecbrojac = 0;
        for(int i=0; i<rijeci.length; i++) {
        for(int j=0; j<rijeci[i].length; j++) {
           int brojac =0;
           
            for(int z=0;z<rijeci[i][j].length();z++){              
                if(rijeci[i][j].charAt(z)==trazeniKarakter){
                    brojac++;
                }               
            }
            if (brojac==brojPonavljanja){
                rijecbrojac++;
                try {
            FileWriter UnesiUDatoteku= new FileWriter("rijeci.txt",true);          
            UnesiUDatoteku.write("Riječ "+rijecbrojac+": "+rijeci[i][j]+"  - Zadovoljava traženi kriterij "+newLine);            
            UnesiUDatoteku.close();
             } catch (IOException ex) {
            Logger.getLogger(MarinIspit.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             System.out.println("Riječ "+rijecbrojac+": "+rijeci[i][j]+"  - Zadovoljava traženi kriterij");
             
            }else {
                rijecbrojac++;
                    try {
            FileWriter UnesiUDatoteku= new FileWriter("rijeci.txt",true);          
            UnesiUDatoteku.write("Riječ "+rijecbrojac+": "+rijeci[i][j]+"  - Ne zadovoljava traženi kriterij "+newLine);
            UnesiUDatoteku.close();
             } catch (IOException ex) {
            Logger.getLogger(MarinIspit.class.getName()).log(Level.SEVERE, null, ex);
            }
               
                   System.out.println("Riječ "+rijecbrojac+": "+rijeci[i][j]+"  - Ne zadovoljava traženi kriterij");             
                   }
   
        }
        }  
}}
