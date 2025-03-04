package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 속성
    private List<Integer> resultList = new ArrayList<>();  // 연산 결과를 저장할 리스트 result_list


    // 생성자
    public Calculator() {

    }

    // 기능

    public int calculate(int a, int b, char c) {
        int result = 0;

        if (c == '+') {
            result = a + b;
        } else if (c == '-') {
            result = a - b;
        } else if (c == '*') {
            result = a * b;
        } else if (c == '/') {
            if (b == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                return 0;
            } else {
                result = a / b;
            }
        } else {
            System.out.println("올바른 기호가 아닙니다");
        }

        System.out.println("연산 결과: " + result);
//        addResultList(result);         // 내부 호출
        return result;

    }


//    String Name;
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name = Name;
//    }


    public List<Integer> getList() {        // 게터
        return resultList;
    }

    public void addResultList(Integer result) {       // 세터
        resultList.add(result);
    }

    public void deleteList() {          // 연산 결과 제거

    }



}
