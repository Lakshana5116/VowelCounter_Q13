package com.lab;

public class VowelCounter {

    public int countVowels(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        VowelCounter obj = new VowelCounter();
        System.out.println("Number of vowels = "
                + obj.countVowels("Hello World"));
    }
}