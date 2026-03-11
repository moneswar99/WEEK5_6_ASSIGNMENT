import java.util.Scanner;

public class level3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;

        // b. Count digits
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

        // d. Frequency array (0–9)
        int[] freq = new int[10];
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // e. Display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
    }
}