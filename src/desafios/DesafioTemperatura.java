package desafios;

public class DesafioTemperatura {

    public static void main(String[] args) {
        final int AJUSTE = 32;
        final double FATOR = 5 / 9.0;
        double Fahrenheit = 86;

        System.out.println("Celsius = " + FATOR * (Fahrenheit - AJUSTE));
    }
}
