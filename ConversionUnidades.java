package TallerJava7Metodos;

public class ConversionUnidades {
    public static int metrosAcentimetros(int a ){
        int resultado = a * 100;
        return resultado;
    }

    public static int kgAlibras(int a){
        int resultado = a * 2205;
        return resultado;
    }

    public static int celsiusAFahrenheit(int a){
        int resultado = (a * 9/5) + 32;
        return resultado;
    }

    public static void conversionUnidades(){
        int a = 24;

        System.out.println("Medida base: "+ a + "\n");

        System.out.println("PROGRAMA PARA CONVERTIR METROS A CENTÍMETROS");
        System.out.println(ConversionUnidades.metrosAcentimetros(a) + " centimetros\n");
        System.out.println("PROGRAMA PARA CONVERTIR KILOGRAMOS A LIBRAS");
        System.out.println(ConversionUnidades.kgAlibras(a) + " libras\n");
        System.out.println("PROGRAMA PARA CONVERTIR CELSIUS A FAHRENHEIT");
        System.out.println(ConversionUnidades.celsiusAFahrenheit(a) + " Fahrenheit\n");
    }


}
