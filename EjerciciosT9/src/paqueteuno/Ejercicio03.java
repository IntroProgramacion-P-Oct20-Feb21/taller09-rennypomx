/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double media;
        //Creamos una condicion para la suma de todos los valores
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        //Procedemos a sacar la media del ejercicio
        media = suma / arreglo.length;
        //Aqui sumamos para ver cuantos valores hay arriba y abajo de la media.
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                elementosAbajoMedia = elementosAbajoMedia + 1;
            }
        }
        //Presentamos en pantalla los valores
        System.out.printf("La media aritmetica es de: %.2f\nLos elementos que "
                + "estan arriba de la media son: %d elementos\nLos elementos "
                + "que estan abajo de la media son: %d elementos\n",
                media, elementosArribaMedia, elementosAbajoMedia);
    }

}

