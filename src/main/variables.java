package main;

public class variables {

    public static void main(String[] args) {
        /*
         * 4 tipos de datos
         *
         * enteros
         * decimales
         * caracteres
         * booleanos
         */

        //Enteros
        byte diasMes = 31; //Aproximadamente
        short diasLustro = (12 * 31) * 5;
        int velocidadLuz = 299792458;
        long añoLuz = velocidadLuz * 365;

        //float
        float pi = 3.14f;
        double e = 2.7182;

        //char
        char letraA = 'a';
        char letraAEnAsci = 61;

        //boolean
        boolean verdad = true;
        boolean falasia = false;

        System.out.println("Mensaje con \\ diagonal inversa");
        System.out.println("Mensaje con \" comillas dobles");
        System.out.println("Mensaje con \'comillas simples");


        //Multiples variables: Solo si son del mismo tipo
        int v1 = 2,v2 = 3, v3 = 4;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }

}