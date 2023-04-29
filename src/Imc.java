import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        float height = input.nextFloat() / 100;
        System.out.println("Digite seu peso: ");
        float weight = input.nextFloat();
        input.close();
        float imc = weight / (height * height);
        System.out.println(imc);
    }
}
