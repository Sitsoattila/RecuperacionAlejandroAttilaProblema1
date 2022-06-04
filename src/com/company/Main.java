package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion;
        int mantenerWhile = 0;
        Scanner lector = new Scanner(System.in);





        while(mantenerWhile == 6){

            System.out.println("Seleccione una opción:");
            opcion = lector.nextInt();
            switch (opcion){

                case 1:
                    .encenderImpresora();

                break;

                case 2:
                    .apagarImpresora();

                case 3:
                    .anyadirTrabajo();

                case 4:
                    .verListaTrabajo();

                case 5:
                    listaDocumentos.imprimir();

                case 6:
                    mantenerWhile = 6;




            }


        }





    }
}
