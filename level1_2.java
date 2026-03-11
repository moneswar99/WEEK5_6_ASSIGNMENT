import java.util.Scanner;

public class level1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Store results from 1 to 10
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the results
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}