package com.company;

import java.util.Scanner;

public class DPI {

    public int numeroDPI()
    {
        Scanner input = new Scanner(System.in);
        char [] mychar = new char[0];
        int codigo=0;

        do {
            try {
                System.out.println("Por favor ingrese su número de DPI");
                codigo = input.nextInt();
                mychar = String.valueOf(codigo).toCharArray();
            } catch (NumberFormatException ex) {
                System.out.println("No puede ingresar letras");
            }
        }while(mychar.length<9);

        return codigo;
    }

}
