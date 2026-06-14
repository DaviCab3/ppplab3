package Questao2;

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new CalculadoraAdapter();

        System.out.println("=== Operações Decimais ===");
        System.out.println("10 + 5 = " + calc.somar(10, 5));
        System.out.println("10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("10 * 5 = " + calc.multiplicar(10, 5));

        System.out.println();

        System.out.println("=== Operações Binárias Internamente ===");
        System.out.println("3 + 4 = " + calc.somar(3, 4));
        System.out.println("8 - 3 = " + calc.subtrair(8, 3));
    }
}