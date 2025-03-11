import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a') {
                countA++;
            } else if (ch == 'e') {
                countE++;
            } else if (ch == 'i') {
                countI++;
            } else if (ch == 'o') {
                countO++;
            } else if (ch == 'u') {
                countU++;
            }
        }

        System.out.println("A: " + countA);
        System.out.println("E: " + countE);
        System.out.println("I: " + countI);
        System.out.println("O: " + countO);
        System.out.println("U: " + countU);

        sc.close();
    }
}
