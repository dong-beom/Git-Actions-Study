package com;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        int length = str.length(); // NullPointerException 발생
        System.out.println("문자열 길이: " + length);
    }
}
