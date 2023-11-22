import java.util.Scanner;

public class GenerateSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character (to print the series from the entered character to 'Z26'): ");
        char inputChar = scanner.next().charAt(0);

        if (inputChar >= 'A' && inputChar <= 'Z') {
            printSeriesFromChar(inputChar);
        } else {
            System.out.println("Invalid input. Please enter a character from A to Z.");
        }

        scanner.close();
    }

    public static void printSeriesFromChar(char startChar) {
        String[] series = new String[27];
        int startNumber = startChar - 'A' + 1;

        for (int i = 0; i < 27; i++) {
            series[i] = (i % 2 == 0) ? String.valueOf((char) (startChar + i / 2)) : String.valueOf(startNumber + i / 2);
        }

        for (String item : series) {
            System.out.print(item);
            System.out.print(",");
        }
        System.out.println();
    }
}
