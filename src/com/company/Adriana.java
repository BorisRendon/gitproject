package com.company;

import java.util.Scanner;

public class Adriana
{

//DPI
    public void dpi(){
        //datos en class DPI
    }

    //TELEFONO
    static void telefonos(){
        //datos en class Telefono
    }

    //ORIGEN
    public void origen()
    {
        Origen nombredepartamento = new Origen();

        System.out.println("Por favor ingrese su departamento de origen");

        Scanner input2 = new Scanner(System.in);
        String nombredep = input2.nextLine();
        nombredepartamento.origen9(nombredep);

        System.out.println("Su departamento de origen es: "+nombredep+".");
    }

}
