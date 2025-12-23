package com.example;

import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        InputStream input = Main.class
                .getClassLoader()
                .getResourceAsStream("password-policy.properties");
        props.load(input);

        PasswordPolicy policy = new PasswordPolicy();
        policy.minLength = Integer.parseInt(props.getProperty("min.length"));
        policy.requireUppercase = Boolean.parseBoolean(props.getProperty("require.uppercase"));
        policy.requireLowercase = Boolean.parseBoolean(props.getProperty("require.lowercase"));
        policy.requireDigit = Boolean.parseBoolean(props.getProperty("require.digit"));
        policy.requireSpecial = Boolean.parseBoolean(props.getProperty("require.special"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password to validate: ");
        String password = scanner.nextLine();

        boolean valid = PasswordPolicyValidator.validate(password, policy);

        System.out.println(valid ? "Password is VALID as per policy"
                                 : "Password is INVALID as per policy");

        scanner.close();
    }
}
