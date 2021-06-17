
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marin
 */
public class mobIspit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Vector<Mobitel> vec =new Vector();
        Upis(vec);
        System.out.println("**********************************************************************************************");
        System.out.println("Filter upišite cijenu do koje ste spremni platiti prikazat će se svi jeftiniji mobiteli.");
        System.out.println("**********************************************************************************************");
        Scanner scn = new Scanner(System.in);
        Float najvecaCjena= scn.nextFloat();
        Filter(vec,najvecaCjena);
        
    }
    
    public static void Upis(Vector vec){
   
    Scanner scn = new Scanner(System.in);
    System.out.println("***************************");
    System.out.println("Upišite 4 mobilna uređaja.");
    System.out.println("***************************");
    
    String naziv;
    Float cjena;
    for(int i=0;i<4;i++){
     
      System.out.println("Upišite naziv mobitela.");
      naziv = scn.next();
      System.out.println("Upišite cijenu mobitela.");
      cjena = scn.nextFloat();
      Mobitel mob = new Mobitel(naziv,cjena);
      vec.add(mob);    
       
    }  
    }  
    
    public static void Filter(Vector<Mobitel> vec,Float NajvecaCijenaDopustena){
    
         System.out.println("***************************");
         System.out.println("Mobiteli sa nižom cjenom od "+NajvecaCijenaDopustena +" su:");  
         System.out.println("***************************");
       
        for (int i = 0; i < vec.size(); i++) {
              Float cijena = vec.get(i).getCijena().floatValue();
            if(cijena<NajvecaCijenaDopustena){
             
             System.out.println("Naziv mobitela je: " + vec.get(i).getNaziv() + "Cijena mobitela je: " + vec.get(i).getCijena());
            }
                  
              
    }
    
    
    
    }
         
   
}
    
    
    

