import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos números quer comparar? ");
        int count = input.nextInt();
        int[] numeros = new int[count];
        for (int i = 0; i < count; i++) {
            int contador = i + 1;
            System.out.println("Digite o " + contador + "º número");
            numeros[i] = input.nextInt();
        }
        EncontrarMaior.retornarMaior(numeros);
    }
}
