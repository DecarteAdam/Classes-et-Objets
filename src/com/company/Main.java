package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Entrez la valeur du tableau");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        // Declarer le tableau

        int[] tab = new int[n];
        System.out.println("Entrez les valeurs dans le tableau");
        for (int i = 0; i<n; i++){
            tab[i] = sc.nextInt();

        }
        System.out.println("Entrez la valeur recherche");
        int num = sc.nextInt();

        int low = 0;
        int high = n-1;
        int mid = 0;

        while (low<=high){
            mid = (low+high)/2;
            if(tab[mid] == num){
                System.out.println("La valeur est trouve dans l'indice: "+mid);
                break;

            }else if(tab[mid]>num){
                high = mid -1;
        } else if(tab[mid]>num){
                low = mid +1;
        }
        }if(low>high){
            System.out.println("Valeur non trouve");
        }
    }
}