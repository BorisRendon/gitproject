package com.company;
import java.util.Scanner;

public class Nombre {

    Scanner scanner = new Scanner(System.in);


    public String requestName() {
        System.out.println("Ingrese Nombre y apellido");
        String input = scanner.nextLine();
        System.out.println("nombre: " + input);
        return input;
    }

    }

