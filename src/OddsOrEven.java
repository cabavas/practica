import java.util.Scanner;

public class OddsOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = input.nextInt();

        if(number % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
    }
}
