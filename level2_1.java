import java.util.Scanner;

public class level2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] employee = new double[10][2]; // [salary, years]
        double[][] result = new double[10][2];   // [bonus, newSalary]

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input salary and years
        for (int i = 0; i < 10; i++) {

            System.out.println("Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Enter again.");
                i--; 
                continue;
            }

            employee[i][0] = salary;
            employee[i][1] = years;
        }

        // Calculate bonus
        for (int i = 0; i < 10; i++) {

            double salary = employee[i][0];
            double years = employee[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        // Display results
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " Old Salary: " + employee[i][0] +
                    " Bonus: " + result[i][0] +
                    " New Salary: " + result[i][1]);
        }

        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}