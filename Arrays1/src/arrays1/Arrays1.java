/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jhonn
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int [] copia;        
        copia = numeros.clone();
        
        System.out.println(numeros[8]);
        System.out.println(copia[0]);
        
        //Multidimencional
        
        Scanner scanner = new Scanner(System.in);
        int x[][];
        x = new int [5][3];
        
        for(int i=0; i<x.length;i++){
            for (int j=0;j<x[i].length;j++){
                x[i][j] = j+1;
            }
            System.out.println(Arrays.toString(x[i]));
        }
        
    }
    
}
