package org.example;

import java.util.Scanner;

public abstract class Main extends Peleador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int raza = 0;

        do {
            System.out.printf("\n==========MENU==========");
            System.out.println("1. Crear participante");
            System.out.println("2. Mostrar nómina de participantes");
            System.out.println("3. Crear torneo de artes marciales");
            System.out.println("4. Iniciar torneo de artes marciales");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            if (opcion == 1){
                System.out.println("Ingresa el nombre.");
                sc.nextLine();
                System.out.println("¿Qué raza es?");
                System.out.println("\n1. Humano.  \n2. Namekiano.  \n3. Saiyajin.");

                raza = sc.nextInt();

                if (opcion == 1){
                    System.out.println("¿Cual es su KI?");
                    sc.nextInt();
                    System.out.println("¿De cuanto es su nivel de poder?");
                    

                }
            }
        }
        while (opcion != 5);
        sc.close();

    }
}