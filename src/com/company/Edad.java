package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Edad {
    public boolean requestEdad(int edad){
        /*int edad = 0;
        System.out.println("Ingrese su edad");
        Scanner scanner = new Scanner(System.in);*/
        boolean esmayor = false;
        //try {
            //edad = scanner.nextInt();
            if (edad < 18) {
                //System.out.println("Menor de edad");
                esmayor=false;
            }
            else  if(edad >= 18) {
                //System.out.println("Mayor de edad");
                esmayor=true;
            }

        //}catch(InputMismatchException e){
            //System.out.println("Por favor ingrese un numero");
        //}
        return esmayor;
    }
}
