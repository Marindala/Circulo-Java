public class Circulo {
    // Definimos la constante PI
    public static final double PI = 3.14159;

    public static double calcularArea(double radio) {
        return PI * radio * radio;
    }

    public static double calcularCircunferencia(double radio) {
        return 2 * PI * radio;
    }
}
