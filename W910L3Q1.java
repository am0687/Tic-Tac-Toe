import java.util.Scanner;

public class BmiTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] measurements = new double[10][2];

        System.out.println("--- Team BMI Data Entry ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("  Weight (kg): ");
            measurements[i][0] = scanner.nextDouble();
            System.out.print("  Height (cm): ");
            measurements[i][1] = scanner.nextDouble();
        }

        // Process data and get report
        String[][] report = generateFullReport(measurements);

        // Display results
        displayBmiTable(report);

        scanner.close();
    }

    /**
     * Method to compute BMI and status for a single person
     */
    public static String[] getBmiAndStatus(double weight, double heightCm) {
        // Convert cm to meters
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    /**
     * Method to create the full 2D String array (Height, Weight, BMI, Status)
     */
    public static String[][] generateFullReport(double[][] measurements) {
        String[][] report = new String[10][4];

        for (int i = 0; i < measurements.length; i++) {
            double weight = measurements[i][0];
            double height = measurements[i][1];
            
            // Call user-defined method for BMI and Status
            String[] result = getBmiAndStatus(weight, height);

            report[i][0] = String.valueOf(height); // Height
            report[i][1] = String.valueOf(weight); // Weight
            report[i][2] = result[0];              // BMI
            report[i][3] = result[1];              // Status
        }
        return report;
    }

    /**
     * Method to display the report in tabular format
     */
    public static void displayBmiTable(String[][] report) {
        System.out.println("\n" + "=".repeat(60));
        System.out.printf("%-12s %-12s %-12s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-".repeat(60));

        for (String[] row : report) {
            System.out.printf("%-12s %-12s %-12s %-15s\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("=".repeat(60));
    }
}