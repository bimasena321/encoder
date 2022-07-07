/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bimasena;
import java.util.Scanner;
import java.lang.Integer;


public class bima{
    public static void main(String[] args) {
        String bima = "";
        char ss ;
        String sena = "";
        
        Scanner v = new Scanner(System.in);
        String [][] bbm = {{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","q","s","t","u","v","w","x","y","z",""}};
        
        System.out.println("Masukan pesan: ");
        bima = v.nextLine();
         for(int a = 0;a < bima.length();a++){
             ss = bima.charAt(a);
             sena = String.valueOf(ss);
             
             for(int b = 0;b < bbm.length;b++){
                 for(int c = 0;c < bbm[b].length;c++){
                     if (sena.equals(bbm[b][c])){
                         System.out.print(b+""+c);
                     }
                 }
             }
         }
        
     }
 }
        
    
