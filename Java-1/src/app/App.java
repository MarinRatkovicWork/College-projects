/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author mev Marin Ratković
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadatak 1\n ------------------\n");
        System.out.print("Unesite tekst:\n -----------------\n ");
        String tekst = scanner.nextLine();
        System.out.print("Unesite slovo:\n------------------\n ");
        char slovo = scanner.nextLine().charAt(0);
        Vector<String> resenje = odredi(tekst, slovo);
        
      for(String rijec : resenje){
            System.out.println(rijec);
        }

        System.out.println("Zadatak 2");
        System.out.print("Koliko aviona zelite unijeti: ");
        int broj = Integer.parseInt(scanner.nextLine());
        
        ArrayList<Avion> lista = upis(broj);
        
       for(Avion avion : lista){
            System.out.println(avion.getProizvodac() + " " + avion.getMaxPutnika());
        }

        System.out.println("Zadatak 3");
        System.out.print("Unesite ime koje zelite provjeriti: ");
        String ime = scanner.nextLine();
        
        boolean postoji = pronadi(ime);
        

        System.out.println(postoji);
    }
    
    public static Vector<String> odredi(String tekst, char c){
        Vector<String> vec = new Vector<String>();
        
        String[] rijeci = tekst.split(" ");
        
        for(String rijec : rijeci){
            if(rijec.charAt(rijec.length() - 1) == c){
                vec.add(rijec);
            }
        }
        
        return vec;
    }
    
    public static ArrayList<Avion> upis(int brojUpisa){
        ArrayList<Avion> lista = new ArrayList<Avion>();
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < brojUpisa; i++){
            System.out.print("Unesite proizvodac: ");
            String proizvodac = scanner.nextLine();
            System.out.print("Unesite maksimalan broj putnika: ");
            int maxBroj = Integer.parseInt(scanner.nextLine());
            lista.add(new Avion(proizvodac, maxBroj));
        }
        
        return lista;
    }
    
    public static boolean pronadi(String ime){
        boolean postoji = false;
        File file = new File("D:\\App\\putnici.txt");
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String ulaz = null;
            while((ulaz = br.readLine()) != null){
                if(ulaz.equals(ime)){
                    postoji = true;
                }
            }
        }
        catch(Exception e){
            System.out.println("Greska kod dohvata datoteke!");
        }
        return postoji;
    }
    
     
}
