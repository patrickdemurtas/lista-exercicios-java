import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para a exibição da sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabela de multiplicação por " + numero);

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }

        scanner.close();
    }
}
