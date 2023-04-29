public class EncontrarMaior {
    public static void retornarMaior(int[] array) {
        int maior = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maior) {
                maior = array[i];
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}