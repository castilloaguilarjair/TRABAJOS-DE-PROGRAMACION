/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author Castillo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sLista = "";
        int[][] matriz1 = {{3, 2, 4}, {4, 3, 2}};
        int[][] matriz2 = {{2, 3, 1}, {3, 4, 1}};
        int nNumeroFilas = matriz1.length;
        int nNumeroColumnas = matriz1[0].length;
        int nNumeroFilas2 = matriz2.length;
        int nNumeroColumnas2 = matriz2[0].length;
        sLista += "La suma de la matriz es: " + Filas(nNumeroFilas, nNumeroFilas2, nNumeroColumnas, nNumeroColumnas2) + "\n";

        JOptionPane.showMessageDialog(null, sLista);
    }

    public static String Filas(int N_Filas, int N_Filas_2, int N_Columna, int N_Columna_2) {
        int[][] matriz1 = {{3, 2, 4}, {4, 3, 2}};
        int[][] matriz2 = {{2, 3, 1}, {3, 4, 1}};
        int[][]smatriz=new int[N_Filas][N_Columna];
        String sLista = "Matriz Devuelta\n";
        if (N_Filas == N_Filas_2 && N_Columna == N_Columna_2) {
            for (int i = 0; i < N_Filas; i++) {
                for (int j = 0; j < N_Columna; j++) {
                    // Sumar matrices
                    smatriz[i][j]=matriz1[i][j]+matriz2[i][j];
                    sLista += smatriz[i][j] + " ";
                }
                sLista += "\n";
            }}else{
            for (int i = 0; i < N_Filas; i++) {
                for (int j = 0; j < N_Columna; j++) {
                    // Sumar matrices
                    smatriz[i][j]=0;
                    sLista += smatriz[i][j] + " ";
                }
                sLista += "\n";
            }
        }

        return sLista;
    }

}
