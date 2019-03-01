package com.company;

import java.util.Scanner;

public class Telefono
{
    public int numerotelefono()
    {
        Scanner input3 = new Scanner(System.in);
        char [] mychar3 = new char[0];
        int numero=0;

        do {
            try {
                System.out.println("Por favor ingrese su número de teléfono");
                numero = input3.nextInt();
                mychar3 = String.valueOf(numero).toCharArray();
                //telefo.numerotelefono(telefonos);

            }catch(NumberFormatException ex)
            {
                System.out.println("No se puede ingresar letras. Por favor inténtelo de nuevo.");
            }

        }while(mychar3.length<9);

        return numero;
    }
}
