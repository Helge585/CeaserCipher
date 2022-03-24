package com.company;

public class Decrypter {
    static final private String alphavitRu = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    static public char getCharWithStep(char ch, int step) {
        if (!Character.isLetter(ch)) {
            return ch;
        }
        boolean isUpper = Character.isUpperCase(ch);
        if (isUpper) {
            ch = Character.toLowerCase(ch);
        }
        int currentIndex = alphavitRu.indexOf(ch);
        if (currentIndex == -1) {
            return ch;
        }
        int newIndex = (currentIndex + step) % 33;
        return isUpper ? Character.toUpperCase(alphavitRu.charAt(newIndex)) : alphavitRu.charAt(newIndex);
    }
}