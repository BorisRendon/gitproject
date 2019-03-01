package com.company;
import java.util.Scanner;

public class Nombre {

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();


    void requestName() {
        System.out.println("Ingrese Nombre y apellido");
        String input = scanner.nextLine();
        System.out.println("input = " + input);
    }

    }

