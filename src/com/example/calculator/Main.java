package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

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



//             cal.calculate(a, b, c);

            int result = cal.calculate(a, b, c);  // 세터 외부 호출

            cal.addResultList(result);           // 세터 외부 호출

            System.out.println("연산 결과 리스트: " + cal.getList());       // 게터 외부 호출

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
