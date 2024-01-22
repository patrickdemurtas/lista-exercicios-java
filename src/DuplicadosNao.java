import java.util.Arrays;
import java.util.Scanner;

public class DuplicadosNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os elementos da primeira lista separados por vírgula: ");
        String inputArray1 = scanner.nextLine();
        String[] array1 = inputArray1.split(", ");

        System.out.print("Digite os elementos da segunda lista separadas por vírgula: ");
        String inputArray2 = scanner.nextLine();
        String[] array2 = inputArray2.split(", ");

        System.out.println("Elementos em comum:");

        for (String elemento1 : array1) {
            for (String elemento2 : array2) {
                if (elemento1.equals(elemento2)) {
                    System.out.println(elemento1);
                    break;
                }
            }
        }

        scanner.close();
    }
}