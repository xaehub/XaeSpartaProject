package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("스파르타 개인 프로젝트");
        System.out.println("------ 계산기 ------");
        String goStop;


        while (true) {
            System.out.print("첫번째 수를 입력해 주세요: ");
            int a = sc.nextInt();
            System.out.print("두번째 수를 입력해 주세요: ");
            int b = sc.nextInt();

            System.out.print(" +  -  *  / 중 하나를 입력해 주세요: ");
            char c = sc.next().charAt(0);


            int result = 0;

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

            while (true) {
                System.out.println("더 계산하시겠습니까?");
                System.out.println("go 또는 exit를 선택해 주세요: ");
                goStop = sc.next();

                if (goStop.equals("exit")) {
                    System.out.println("계산기가 종료됩니다.");
                    return;
                } else if (goStop.equals("go")) {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력해 주세요");
                }
            }
        }
    }
}
