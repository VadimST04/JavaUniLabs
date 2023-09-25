// Variant 9
import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        firstWay();
        secondWay();
    }

    public static void firstWay() {
        // This is a bubble sort way which is not so good and quick :)
        System.out.print("Enter any line: ");
        StringBuilder input = new StringBuilder(scanner.nextLine().toLowerCase());
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) > input.charAt(i + 1)) {
                    char tmp = input.charAt(i);
                    input.setCharAt(i, input.charAt(i + 1));
                    input.setCharAt(i + 1, tmp);
                    swap = true;
                }
            }
        }
        System.out.println(input);
    }

    public static void secondWay() {
        // This is a prettier way, to my mind
        String output = "";
        System.out.print("Enter any line: ");
        String[] letters = scanner.nextLine().toLowerCase().split("");
        Arrays.sort(letters);
        for (String letter:letters) {
            output += letter;
        }
        System.out.println(output.trim());
    }
}
