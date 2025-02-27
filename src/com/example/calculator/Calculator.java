package com.example.calculator;

public class Calculator {

    // 속성



    // 생성자
    public Calculator() {

    }

    // 기능

    public void calculator(int a, int b, char c) {
        int result;

        if (c == '+') {
            result = a + b;
            System.out.println("두 수를 더한 값은: " + result);
        } else if (c == '-') {
            result = a - b;
            System.out.println("두 수를 뺀 값은: " + result);
        } else if (c == '*') {
            result = a * b;
            System.out.println("두 수를 곱한 값은: " + result);
        } else if (c == '/') {
            if (b == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
            } else {
                result = a / b;
                System.out.println("두 수를 나눈 값은: " + result);
            }
        } else {
            System.out.println("올바른 기호가 아닙니다");
        }

    }
}
