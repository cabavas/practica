public class BreakAndContinue {
    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 10; i++) {
            loop2:
            for (int j = 0; j < 5; j++) {
                if (i == 5 && j == 3) {
                    continue loop1; // sai do loop1 quando i = 5 e j = 3
                }
                System.out.println(i + " " + j);
            }
        }

    }
}
