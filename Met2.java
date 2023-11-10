/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package met2;

/**
 *
 * @author laraf
 */
public class Met2 {
public static double suma(double a, double b){
    double sum=a +b;
    return sum;
}public static double resta(double a, double b){
    double res=a -b;
    return res;
}
public static double multiplicacion(double a, double b){
    double mul=a *b;
    return mul;
}
public static double divicion(double a, double b){
    double div=a /b;
    return div;
}

    public static void main(String[] args) {
        double a = 8.9;
        double b=7.3;
        System.out.println("suma "+suma(a,b));
        System.out.println("resta "+resta(a,b));
        System.out.println(" multiplicacion "+ multiplicacion(a,b));
         System.out.println("divicion "+divicion(a,b));
    }
 
}
