/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Castillo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException {
        double[][] datosmatriz = new double[3][3];
        double suma = 0.0;
        int fila = 0;
        double promedio;
        String sListaMensaje = "";
        for (int i = 0; i < datosmatriz.length; i++) {
            for (int j = 0; j < datosmatriz.length; j++) {
                datosmatriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de la fila : " + (i +1)+ " y columna " + (j+1)));
                
            }
        }
        for (int i = 0; i < datosmatriz.length; i++) {
            for (int j = 0; j < datosmatriz.length; j++) {
                suma = datosmatriz[i][j] + suma;
                fila = i + 1;
            }
            promedio = suma / 3.0;
            sListaMensaje += "En la fila " + fila + " la suma es: "+ suma + "\n";
            sListaMensaje += "En la fila " + fila + " el promedio es: "+ promedio +"\n";
            
            suma = 0;

        }
        JOptionPane.showMessageDialog(null, sListaMensaje);
        
        
    }
}