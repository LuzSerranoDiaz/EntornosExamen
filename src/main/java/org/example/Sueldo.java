package org.example;

public class Sueldo {
    public static double ej9(char tipo, double sueldo, int antiguedad) {
        double incremento;
        if (sueldo<1000){
            return sueldo;
        }else {
            switch (tipo) {
                case 'E':
                    incremento = sueldo * 1.0;
                    break;
                case 'N':
                    incremento = sueldo * 0.5;
                    break;
                default:
                    incremento = 0.0;
                    break;
            }
            if (antiguedad > 24)
                incremento = incremento * antiguedad / 10;
            else if (antiguedad > 12)
                incremento = incremento * antiguedad / 20;
            else
                incremento = incremento * antiguedad / 30;
            return sueldo + incremento; // línea donde establecer un punto de ruptura, breakpoint
        }
    }

    public static void main (String[]args){
        System.out.println(ej9('N',1000,14));
    }

}
