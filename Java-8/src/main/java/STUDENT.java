
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marin
 */
public class STUDENT {
    private String ImeStudenta;
    private int GodinaStudija;

    public STUDENT(String ImeStudenta, int GodinaStudija) {
        this.ImeStudenta = ImeStudenta;
        this.GodinaStudija = GodinaStudija;
    }

    /**
     * @return the ImeStudenta
     */
    public String getImeStudenta() {
        return ImeStudenta;
    }

    /**
     * @param ImeStudenta the ImeStudenta to set
     */
    public void setImeStudenta(String ImeStudenta) {
        this.ImeStudenta = ImeStudenta;
    }

    /**
     * @return the GodinaStudija
     */
    public int getGodinaStudija() {
        return GodinaStudija;
    }

    /**
     * @param GodinaStudija the GodinaStudija to set
     */
    public void setGodinaStudija(int GodinaStudija) {
        this.GodinaStudija = GodinaStudija;
    }
    
     public static ArrayList Unesi(int broj){
        ArrayList<STUDENT> array = new ArrayList<STUDENT>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < broj; i++){
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.nextLine();
            System.out.println("Unesite godinu studenta: ");
            int god = Integer.parseInt(scanner.nextLine());
            STUDENT s = new STUDENT(ime, god);
            array.add(s);
        }
        return array;
    }
    
}

