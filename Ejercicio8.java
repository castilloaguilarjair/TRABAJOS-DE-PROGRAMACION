/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author Castillo
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del filas : "));
        int nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del columnas : "));
        int rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un rango [0-24] : "));
        String[][] matriz = new String[nFilas][nColumnas];
        String sopadeletras = "";
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = Abc(DevuleveNumeroAleatorio(rango, 0));
                sopadeletras += matriz[i][j];
            }
            sopadeletras += "\n";
        }

        JOptionPane.showMessageDialog(null, "La sopa de letras es: \n" + sopadeletras);

    }

    public static String Abc(int n) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String[] abcV = abc.split("");
        return abcV[n];
    }

    public static int DevuleveNumeroAleatorio(int p_al_vmax, int p_al_vmin) {
        int nNumeroAleatorio = 0;

        nNumeroAleatorio = (int) (Math.random() * (p_al_vmax - p_al_vmin));

        return nNumeroAleatorio;
    }
}
