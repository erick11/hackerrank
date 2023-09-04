package com.hackerrank.basic;

import java.util.Scanner;

public class B03_Java_If_Else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if(N%2==0){
            if(N>=6 && N<=20){

            } else if(N<=2 && N<=5){

            }else{
                System.out.println("");
            }
        } else{
            System.out.println("Weird");
        }
    }
}

/*
Dado un número entero, realice las siguientes acciones condicionales:
 • Si n es extraña, imprima Weird
 • Si n es par y está en el rango inclusivo de 2 a 5,  imprima Not Weird
 • Si n es par y está en el rango inclusivo de 6 a 20, imprima Weird
 • Si n es par y mayor que 20, imprima Not Weird

 Complete el código auxiliar proporcionado en su editor para imprimirlo, ya sea que sea extraño o no.
.
.
.
*/