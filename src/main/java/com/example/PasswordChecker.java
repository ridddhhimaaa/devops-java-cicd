package com.example;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int score = 0;

        // Feature extraction
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()].*");
        int length = password.length();

        // Feature-based scoring (Data Science concept)
        if (length >= 8) score += 30;
        if (hasUpper) score += 15;
        if (hasLower) score += 15;
        if (hasDigit) score += 20;
        if (hasSpecial) score += 20;

        // Classification
        String strength;
        if (score < 50)
            strength = "Weak";
        else if (score < 75)
            strength = "Medium";
        else
            strength = "Strong";

        // Output
        System.out.println("\nPassword Analysis");
        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + hasUpper);
        System.out.println("Lowercase: " + hasLower);
        System.out.println("Digit: " + hasDigit);
        System.out.println("Special Character: " + hasSpecial);
        System.out.println("Score: " + score + "/100");
        System.out.println("Strength: " + strength);

        // CSV Data Logging (Data Science dataset generation)
        try {
            File file = new File("password_data.csv");
            boolean fileExists = file.exists();

            FileWriter writer = new FileWriter(file, true);

            // Write header only once
            if (!fileExists) {
                writer.write("length,hasUpper,hasDigit,hasSpecial,score,strength\n");
            }

            writer.write(
                    length + "," +
                    (hasUpper ? 1 : 0) + "," +
                    (hasDigit ? 1 : 0) + "," +
                    (hasSpecial ? 1 : 0) + "," +
                    score + "," +
                    strength + "\n"
            );

            writer.close();

        } catch (IOException e) {
            System.out.println("Error writing data to CSV file.");
        }

        sc.close();
    }
}
