package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator<Number> cal = new Calculator<>();

        System.out.println("스파르타 개인 프로젝트");
        System.out.println("------ 계산기 ------");
        String goStop;

        while (true) {
            System.out.print("첫번째 수를 입력해 주세요: ");
            double a = sc.nextDouble();                     // 실수형(double)타입 입력받기
            System.out.print("두번째 수를 입력해 주세요: ");
            double b = sc.nextDouble();

            System.out.print(" +  -  *  / 중 하나를 입력해 주세요: ");
            char c = sc.next().charAt(0);                   // 문자형(char)타입 입력받기

            Number result = cal.calculate(a, b, c);         // 세터 외부 호출

            if (result != null) {                           // result가 null이 아니면 리스트에 추가
                cal.addResultList(result);
            }

            System.out.println("연산 결과 리스트: " + cal.getList());  // 게터 외부 호출

            System.out.println("연산 결과를 삭제하시려면 del을 삭제할 연산 결과가 없다면 skip을 입력해 주세요. ");    // 연산 결과 삭제 여부 입력받기
            String delSkip = sc.next();

            if(delSkip.equals("del")) {             // 만약 "del"을 입력받으면
                cal.deleteList();                   // deleteList()를 호출해 index(0)번 result값 삭제
                System.out.println("삭제한 후 연산 결과 리스트: " + cal.getList());    // 삭제한 후 리스트 한번 더 출력
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
