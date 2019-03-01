package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Edad {
    public void requestEdad(){
        int edad = 0;
        System.out.println("Ingrese su edad");
        Scanner scanner = new Scanner(System.in);
        try {
            edad = scanner.nextInt();
            if (edad <= 18) {
                System.out.println("Menor de edad");
            }
            else  if(edad > 18) {
                System.out.println("Mayor de edad");
            }

        }
        catch(InputMismatchException e){
            System.out.println("Por favor ingrese un numero");

        }
    }
}
