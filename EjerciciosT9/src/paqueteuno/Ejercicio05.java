/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        boolean bandera = true;
        char[] first = new char[7];
        for (int i = 0; i < estudiantes.length; i++) {
            first[i] = estudiantes[i].charAt(0);
        }
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            inicial = inicial.toUpperCase();
            char ini = inicial.charAt(0);
            for (int j = 0; j < estudiantes.length; j++) {
                if (ini == first[j]) {
                    bandera = false;
                }
            }
        }
    }
}