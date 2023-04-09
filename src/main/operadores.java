package main;

public class operadores {

    public static void main(String[] args) {
        int variableX = 50, variableY = 10;
        int res;

        res = variableX + variableY;
        System.out.println(res);

        res = variableX - variableY;
        System.out.println(res);

        res = variableX * variableY;
        System.out.println(res);

        res = variableX / variableY;
        System.out.println(res);

        variableX ++;
        variableY--;
        System.out.println(variableX);
        System.out.println(variableY);

        variableX += 100;
        System.out.println(variableX);

        //Casting = Convertir el valor de unq variable a uno en concreto
        int x = 50, y = 10;
        float resultado;
        float z = 5.5f;

        resultado = (float)x + z;
        System.out.println(resultado);

        //Operadores relacionales
        int v1 = 200, v2 = 100;
        boolean result;

        result = v1 > v2;
        System.out.println(result);

        result = v1 < v2;
        System.out.println(result);

        result = v1 >= v2;
        System.out.println(result);

        result = v1 <= v2;
        System.out.println(result);

        result = v1 == v2;
        System.out.println(result);

        result = v1 != v2;
        System.out.println(result);


        //Operadores logicos

        //AND
        boolean resultado2;
        resultado2 = 5 >= 5 && true;
        System.out.println(resultado2);
        //OR
        resultado2 = false || false || false || true;
        System.out.println(resultado2);
        //NOT
        System.out.println(!resultado2);

    }

}