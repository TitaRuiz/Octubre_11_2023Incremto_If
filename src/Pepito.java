public class Pepito {

    public static void main(String[] args) {
        //Declarar variable e incrementarla
        int numero = 0;
        numero = numero + 1;
        System.out.println(numero);
        numero += 1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        //Declarar variable y decrementar
        int numero2 = 100;
        numero2 = numero2 -5;
        System.out.println("numero2 -> "+numero2);
        numero2 -= 5;
        System.out.println("numero2 -> "+numero2);
        numero2--;
        System.out.println("numero2 -> "+numero2);

        //Multiplicar
        int numero3 = 7;
        numero3 = numero3 * 3;
        System.out.println("numero3 -> " + numero3);
        numero3 *= 2;
        System.out.println("numero3 -> " + numero3);

        //Division - dividir entre 10 y luego entre 5
        int numero4 = 100;
        numero4 = numero4 / 10;
        System.out.println("numero 4 -> "+ numero4);
        numero4 /= 5;
        System.out.println("numero 4 -> "+ numero4);

        /*Declarar una variable con el nombre numero5 asignar un valor de 8
        Obtener el resto de dividirlo entre 3
         */
        int numero5 = 8;
        //numero5 %=  3; // numero5 = numero5 % 3
        System.out.println("numero 5 ->"+ numero5);

        //Caso de asignar valores
        int num1 = 10 , num2=2 , num3 = 0;
        num3 = num1 + ++num2;
        System.out.println(num3);
        System.out.println("num2->"+ num2);

        num1 = 10;
        num2=2;
        num3 = num1 + num2++;
        System.out.println(num3);
        System.out.println("num2->"+ num2);

        //Operadores de comparacion
        //Declarar una variable con el valor de 10 y decir si es par
        //Tip -> operador comparación y algun operador aritmético
        int valor = 11;
        System.out.println("Es par? " + (valor%2==0));
        System.out.println("Es impar? " + (valor%2!=0));

        //Decir si un número es múltiplo de tres
        System.out.println("¿Es múltiplo de 3  ?" + (valor%3==0));

        //Declarar una variable y asignarle el número -5
        int valor2 = -5;
        //Decir si es positivo
        System.out.println("¿Es positivo ?"+(valor2>=0));
        //Decir si es negativo
        System.out.println("¿Es negativo? " + (valor2<0));

        //Declarar una variable importe con el 50
        //Si importe es mayor o igual a 100 calcular el 10% de descuento
        //Pero si el importe es menor calcular el 3%
        float importe = 120f;

        if (importe >=100) {
            System.out.println("Entra al if");
            System.out.println(importe * 0.10);
        } else
        {
            System.out.println("Entra al else");
            System.out.println(importe *0.03);
        }
        //Declarar una variable de numero de hijos
        //Decir si es familia numerosa o NO es familia numerosa

        byte numerohijos = 1;
        if (numerohijos >= 3) {
            System.out.println("Familia numerosa");
        }else {
            System.out.println("Familia NO numerosa");
        }

        //una variable que guarde la edad
        //Decir si es mayor o menor de edad
        byte edad = 18;
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }

        //Declarar una variable para el número del mes
        //Decir los dias de ese mes
        byte mes = 4;
        if(mes==1 || mes==3 || mes==5 || mes == 7 || mes==8 || mes==10 || mes==12){
            System.out.println("El mes tiene 31 días");
        }else{
            System.out.println("El mes tiene 30 días");
        }

        //si el número está entre 5 y 15 mostrar que te has ganado un ordenador









    }
}