/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Castillo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sLista = "";
        int [][]matrizdada={{3,2,4},{4,3,2}};
        int nNumeroFilas = matrizdada.length;
        int nNumeroColumnas = matrizdada[0].length;

        sLista += "El número de Filas es: " + Filas(nNumeroFilas) + "\n";
        sLista += "El número de Columnas es: " + Columnas(nNumeroColumnas) + "\n";
        JOptionPane.showMessageDialog(null, sLista);
    }

    public static int Filas(int N_Filas) {
        int cont = 0;
        for (int i = 0; i < N_Filas; i++) {
            cont = cont + 1;
        }

        return cont;
    }

    public static int Columnas(int N_Columnas) {
        
        int cont2 = 0;
        for (int j = 0; j < N_Columnas; j++) {
            cont2 = cont2 + 1;
        }
        
        return cont2;
    }
}
