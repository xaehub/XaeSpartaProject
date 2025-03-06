package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator<T extends Number> {

    private List<T> resultList = new ArrayList<>();  // 연산 결과를 저장할 리스트 result_list

    public Calculator() {

    }

    public T calculate(T a, T b, char c) {
        double result = 0;

        if (c == '+') {
            result = a.doubleValue() + b.doubleValue();
        } else if (c == '-') {
            result = a.doubleValue() - b.doubleValue();
        } else if (c == '*') {
            result = a.doubleValue() * b.doubleValue();
        } else if (c == '/') {
            if (b.doubleValue() == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                return null;
            } else {
                result = a.doubleValue() / b.doubleValue();
            }
        } else {
            System.out.println("올바른 기호가 아닙니다");
            return null;
        }

        System.out.println("연산 결과: " + result);
        return (T) (Number) result;
    }

    public List<T> getList() {        // 게터
        return resultList;
    }

    public void addResultList(T result) {       // 세터
        resultList.add(result);
    }

    public void deleteList() {          // 연산 결과 제거
        if(resultList.isEmpty()) {
            System.out.println("리스트에 삭제할 연산 결과가 없습니다.");
        } else {
            resultList.remove(0);
        }
    }
}
