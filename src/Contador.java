import java.util.Scanner;

public class Contador {

    static void countNumbers(int firstNumber, int secondNumber) throws ParametrosInvalidosException {
        if (firstNumber > secondNumber) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int count = secondNumber - firstNumber;
        for (int i = 1; i <= count; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    
    }
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe 2 números para exibir a qtd de iteracões:");
            System.out.println("Primeiro número");
            int firstNumber = scanner.nextInt();
            
            System.out.println("Segundo número");
            int secondNumber = scanner.nextInt();

            try {
                countNumbers(firstNumber, secondNumber);
            } catch (ParametrosInvalidosException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado");
            e.printStackTrace();
        }
    }
}
