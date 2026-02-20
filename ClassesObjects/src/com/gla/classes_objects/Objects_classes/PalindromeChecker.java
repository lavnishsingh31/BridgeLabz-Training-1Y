package com.gla.classes_objects.Objects_classes;

class PalindromeChecker {

    private String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is not a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("Madam");
        p.displayResult();
    }
}
