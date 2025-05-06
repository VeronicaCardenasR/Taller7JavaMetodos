package TallerJava7Metodos;

import java.sql.SQLOutput;
import java.util.Scanner;

import static Java7Funciones.Calculadora.*;

public class Calculadora {
    public static int suma (int a, int b){
        return a + b;
    }
    public static int resta (int a, int b){
        return a - b;
    }
    public static int multi (int a, int b){
        return a * b;
    }
    public static double dividir (int a, int b){
        if(b==0){
            System.out.println("Error: no puedes divir entre cero");
            return 0;
        }
        return (double) a / b; //casteo
    }
    public static double potencia (int a, int b){
        return  Math.pow(a,b);
    }

    public static void sistemaCalculadora(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("BIENVENID@ A TU CALCULADORA\n");

        do {
            System.out.println("Elije la opción que quieres realizar: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potenciar");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();

            if (opcion == 6) {
                System.out.println("Gracias por usar la calculadora, adiooos");
                return;
            }

            System.out.println("Ahora digita el primer numero: ");
            int a = scanner.nextInt();
            System.out.println("Digita el segundo numero: ");
            int b = scanner.nextInt();

            switch (opcion){
                case 1:
                    int suma = suma(a,b);
                    System.out.println("El resultado de la suma es: " + suma + "\n");
                    break;
                case 2:
                    int resta = resta(a,b);
                    System.out.println("El resultado de la resta es: " + resta+ "\n");
                    break;
                case 3:
                    int multi = multi(a,b);
                    System.out.println("El resultado de la multiplicacion es: " + multi+ "\n");
                    break;
                case 4:
                    int division = (int) dividir(a,b);
                    System.out.println("El resultado de la division es: " + division+ "\n");
                    break;
                case 5:
                    int potencia = (int) potencia(a,b);
                    System.out.println("El resultado de la potencia es: " + potencia+ "\n");
                    break;
                default:
                    System.out.println("Error:  ingrese un numero válido");

            }
        }while (opcion != 6);


    }
}
