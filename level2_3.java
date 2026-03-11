import java.util.Scanner;

public class level2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;

        // b. Find count of digits
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // c. Store digits in array
        int[] digits = new int[count];
        temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // d. Display digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}