package com.company;

import java.util.Scanner;

public class Adriana
{

//DPI
    public void dpi(){
        DPI dpi = new DPI();

        Scanner input = new Scanner(System.in);
        char [] mychar = new char[0];


        do {
            try {
                System.out.println("Por favor ingrese su número de DPI");
                int codigo = input.nextInt();
                mychar = String.valueOf(codigo).toCharArray();
                dpi.numeroDPI(codigo);
            } catch (NumberFormatException ex) {
                System.out.println("No puede ingresar letras");
            }
        }while(mychar.length<9);
    }

    //TELEFONO
    static void telefonos(){
        Telefono telefo = new Telefono();
        Scanner input3 = new Scanner(System.in);
        char [] mychar3 = new char[0];

        do {
            try {
                System.out.println("Por favor ingrese su número de teléfono");
                int telefonos = input3.nextInt();
                mychar3 = String.valueOf(telefonos).toCharArray();
                telefo.numerotelefono(telefonos);

            }catch(NumberFormatException ex)
            {
                System.out.println("No se puede ingresar letras. Por favor inténtelo de nuevo.");
            }

        }while(mychar3.length<9);
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
