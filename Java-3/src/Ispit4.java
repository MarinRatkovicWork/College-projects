/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author josip
 */
public class Ispit4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //Prvi Zadatak
        Vector prviZadatak = new Vector();
        System.out.println("Unesi recenicu \n---------------------");
        Scanner scanner = new Scanner(System.in);
        String linija = scanner.nextLine();
        prviZadatak = Odredi(linija);
        System.out.println(prviZadatak);
        //Drugi Zadatak
        System.out.println("Koliko studenata zelite unesti\n-------------------------}");
        ArrayList<Student> array = new ArrayList<Student>();
        int brojStudenata = Integer.parseInt(scanner.nextLine());
        try{
            array = Unesi(brojStudenata);
            for(Student student : array){
                System.out.println("Ime: " + student.getIme() + " Godina studija: " + student.getGodinaStudija());
            }
        }catch(Exception e){
            System.out.println("Greska!!");
        }
        
        //Treci Zadatak       
       System.out.print("");      
        File Imena = new File("C:\\Users\\Marin\\Desktop\\Java bruno\\0moje vjezbe\\Ispit4\\Imena.txt");
        FileWriter UnesiTekstUDatoteku = new FileWriter("Imena.txt");
        UnesiTekstUDatoteku.write("Ivana Ana Lucija Martina Marin Josip Adrian Ivona Tihomir ");
        UnesiTekstUDatoteku.close();
        
        DATOTEKA();
    }
    //Prvi Zadatak
    public static Vector Odredi(String linija){
        
        Vector vec = new Vector();
        String[] rijeci = linija.split(" ");
        for(String rijec : rijeci){
            
            if(rijec.charAt(0)=='M'||rijec.charAt(0)=='m'){
                vec.add(rijec);
            }
        }
        return vec;
    }
    //Drugi Zadatak
    public static ArrayList Unesi(int broj){
        ArrayList<Student> array = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < broj; i++){
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.nextLine();
            System.out.println("Unesite godinu studenta: ");
            int god = Integer.parseInt(scanner.nextLine());
            Student s = new Student(ime, god);
            array.add(s);
        }
        return array;
    }
    
    public static class Student{
        private String ime;
        private int godinaStudija;

        public Student(String ime, int godinaStudija) {
            this.ime = ime;
            this.godinaStudija = godinaStudija;
        }

        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public int getGodinaStudija() {
            return godinaStudija;
        }

        public void setGodinaStudija(int godinaStudija) {
            this.godinaStudija = godinaStudija;
        }

        public Student() {
        }
        
    }
    // Treci Zadatak
    public static class ProgramskaNitDatoteka extends Thread{
         public void run () {
             try {
                 String NajduzaRijec = "";
                 String TrenutnaRijec;
                 Scanner Citac = new Scanner(new File("Imena.txt"));
                 
                 
                 while (Citac.hasNext()) {
                     TrenutnaRijec = Citac.next();
                     if (TrenutnaRijec.length() > NajduzaRijec.length()) {
                         NajduzaRijec = TrenutnaRijec;
                     }
                     
                 }
                 System.out.println(NajduzaRijec.length());
                
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Ispit4.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
           
    }
    public static void DATOTEKA(){
       new ProgramskaNitDatoteka().start();
       
    }
    
}

