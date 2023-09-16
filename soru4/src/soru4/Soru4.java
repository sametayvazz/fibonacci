/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Soru4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  a şıkkı
      int sayi,indis;
       Scanner deger=new Scanner(System.in);
        
        //  b şıkkı
        System.out.print("Kaç Adet Fibonacci Sayısı Görmek İstersiniz: ");
        sayi=deger.nextInt();
        int [] fib=degerSiralama(sayi);
        for (int i = 0; i < fib.length; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i]+" ");
        }
                
    }
    public static int fibonacci (int indis) //a şıkkı
    {        
        if (indis<1) {
            return 0;
        }
        int birinci=1;
        int ikinci=1;
        
        for (int i = 2; i < indis; i++) {
            int gecici=birinci;
            birinci=birinci+ikinci;
            ikinci=gecici;
        }
     
        return birinci;
    }
    public static int[] degerSiralama(int deger) //b şıkkı
    {    
       int[] dizi=new int [deger];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=fibonacci(i);
        }
    return dizi;
    }
    
}
