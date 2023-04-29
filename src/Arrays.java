import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos itens quer acrescentar: ");
        int count = input.nextInt();
        String[] array = new String[count];
        for (int i = 0; i < count; i++) {
            int ordinal = i + 1;
            System.out.println("Digite o " + ordinal + "º item ");
            array[i] = input.next();
        }
        System.out.println("Os itens digitados são: ");
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
        input.close();
    }
}
