
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
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
public class NewMain {

    /**
     * @param args the command line arguments
     */
             
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       //Zadatak1
       Random rand = new Random(); 
       
       int red = 5, stupac = 4;
       int[][] PoljeBrojeva = new int[red][stupac];    
        for (int row = 0; row < PoljeBrojeva.length; row++){            
	for (int col = 0; col < PoljeBrojeva[row].length; col++){
        int nasumicnibroj=rand.nextInt(1000);   
    	PoljeBrojeva[row][col] =nasumicnibroj;
        }
        }     
        int TrazenaZnamenka;  
        System.out.println(Arrays.deepToString(PoljeBrojeva));
        
        Scanner scanner = new Scanner(System.in);     
        System.out.println("Unesite broj:");
        TrazenaZnamenka = scanner.nextInt();
        BROJEVI(PoljeBrojeva,TrazenaZnamenka);
          
          
       //Zadatak2  
        String naziv;
       float cijena=1;  
       float VelicinaEkrana;
        
        Scanner scannerr = new Scanner(System.in);
          System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Napmena iz programa se izlazi tako da se pritisne nula - 0 - kad se traži cijena.");
         System.out.println("---------------------------------------------------------------------------------");
       while(cijena!=0){
            
              System.out.println("Naziv:");
              naziv = scannerr.nextLine();
              System.out.println("Cijena");
              cijena = scannerr.nextFloat();
              if(cijena==0){
              scannerr.close();  
              System.out.println("Završili ste unos u datoteku.");
              break;
              
              }     
              System.out.println("Velicina Ekrana");
              VelicinaEkrana = scannerr.nextFloat();
              scannerr.nextLine();
              System.out.println("************************************************************************");
             LAPTOP Laptop= new LAPTOP(VelicinaEkrana,naziv,cijena);
             Laptop.UPIS();
         }   
    } 
    
     
    
    
    public static void BROJEVI(int[][] PoljeBrojeva, int TrazeniBroj){
       
        
        
        int brojac=0;
        for (int row = 0; row < PoljeBrojeva.length; row++){
	for (int col = 0; col < PoljeBrojeva[row].length; col++){
    	 int brojevi=PoljeBrojeva[row][col];
         String broj = Integer.toString(brojevi); 
          for(int i=0;broj.length()>i;i++){
              String Trazeni = Integer.toString(TrazeniBroj); 
              if(broj.charAt(i)==Trazeni.charAt(0) ){                 
                  brojac++;
              }}
          
              
                      
          } 
        }     
        System.out.println("******************************************************");
        System.out.println(brojac+" polja sadržavaju znamenku "+TrazeniBroj+".");
        System.out.println("******************************************************");
        }
      
}
        
    

