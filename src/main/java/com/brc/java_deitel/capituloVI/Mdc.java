
package com.brc.java_deitel.capituloVI;
//Algoritmo de Euclides
public class Mdc {
    public static void main(String[] args) {
        System.out.println(rGetMDC(20, 40));
        System.out.println(nGetMDC(20, 40));
    }

    // Sem recursão
    public static int nGetMDC(int a, int b) { 
        while (b != 0) {
            if (a < b) {
                a = a ^ b;
                b = a ^ b; //Porta lógica XOR.
                a = a ^ b;
            }
            a -= b;
        }
        return a;
    }

    // Recursivo
    public static int rGetMDC(int a, int b) {
        if (b == 0) {
            return a;
        }
        return rGetMDC(a, a % b);
    }
}
