// Creio que seja um "alivio comico" em meio a tantos exercicios simples, mas extensos kkkkkkkkkkkk
package com.brc.java_deitel.capituloVI;
public class CoordDistance {
    public static void main(String[] args) {
        System.out.println(calculateDistance(1, 2, 5, 5));
    }
    
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}