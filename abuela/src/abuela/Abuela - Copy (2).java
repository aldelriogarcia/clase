/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abuela;

import java.util.Scanner;

/**
 *
 * @author dawmi
 */
public class Abuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        int[] ab = new int[6];
        int[] sumas = new int[6];
        int verif;
        int casos;
        casos = input.nextInt();
        for (int p = 0; p < casos; p++) {

            verif = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < ab.length; i++) {
                ab[i] = input.nextInt();
            }

            int suma = arr[0] + ab[0];

            for (int j = 0; j < arr.length; j++) {
                sumas[j] = arr[j] + ab[j];
            }

            for (int l = 0; l < arr.length; l++) {

                if (sumas[l] != suma) {
                    verif = 1;
                }
            }

            if (verif == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

}
