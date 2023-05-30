package com;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String username = getUserInput();
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
        // query 실행 로직
    }

    private static String getUserInput() {
        // 사용자로부터 입력 받는 로직
        return "admin' --";
    }

    private static String firstMethod() {
        return "1";
    }

    private static String secondMethod() {
        // 사용자로부터 입력 받는 로직
        return "2";
    }

    private static String thirdMethod() {
        return "3 ";
    }
}
