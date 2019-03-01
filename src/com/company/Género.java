package com.company;
import java.util.Scanner;

public class Género {
    Scanner scanner = new Scanner(System.in);

    void RequestGenero() {
        String inputgenero = scanner.nextLine();
        System.out.println("genero = " + inputgenero);
    }
}
