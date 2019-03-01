package com.company;

import java.util.Scanner;

public class Origen {

public String origen9(/*String departamento*/)
{

    System.out.println("Por favor ingrese su departamento de origen");

    Scanner input2 = new Scanner(System.in);
    String nombredep = input2.nextLine();
    //nombredepartamento.origen9(nombredep);

    System.out.println("Su departamento de origen es: "+nombredep+".");

    return nombredep;
}

}
