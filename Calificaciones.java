package TallerJava7Metodos;

import javax.sound.midi.Soundbank;

public class Calificaciones {
    public static double promedio (double a, double b, double c){
        double resultado = (a+b+c)/3;
        return resultado;
    }
    public static String verificarAprobados (double promedio){
         if (promedio >= 60){
             return "Aprobado";
         }else {
             return "No pasaste";
         }

    }

    public  static  void sistemaCalificaciones(){
        double a = 50;
        double b = 80.5;
        double c = 90.5;

        double promedio = promedio(a,b,c);
        String aprobacion = verificarAprobados(promedio);

        System.out.println("Notas actuales: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c + "\n") ;

        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("Estado del estudiante: " + aprobacion);
    }
}
