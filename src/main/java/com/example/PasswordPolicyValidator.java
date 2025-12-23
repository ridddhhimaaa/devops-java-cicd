package com.example;

public class PasswordPolicyValidator {

    public static boolean validate(String password, PasswordPolicy policy) {

        if (password.length() < policy.minLength) return false;
        if (policy.requireUppercase && !password.matches(".*[A-Z].*")) return false;
        if (policy.requireLowercase && !password.matches(".*[a-z].*")) return false;
        if (policy.requireDigit && !password.matches(".*[0-9].*")) return false;
        if (policy.requireSpecial && !password.matches(".*[!@#$%^&*()].*")) return false;

        return true;
    }
}
