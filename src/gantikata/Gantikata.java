/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gantikata;

import java.util.Scanner;

/**
 *
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * 
 */
public class Gantikata {


    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        String nGanti, nJadi;
        
        System.out.println("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.println("Ganti kata : ");
        nGanti = scanner.nextLine();
        
        System.out.println("Menjadi Kata : ");
        nJadi = scanner.nextLine();
        
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("Adalah : " + ganti);
    }
    
}
