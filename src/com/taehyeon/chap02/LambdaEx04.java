package com.taehyeon.chap02;

@FunctionalInterface
interface MyFunction4{
    int clac(int x, int y);
}

public class LambdaEx04 {
    public static void main(String[] args) {
        // 함수 호출시에 함수 생성해서 parm으로 던짐
        printSum(10, 5, (x, y) -> x + y);
    }

    static void printSum(int x, int y, MyFunction4 f){
        System.out.println(f.clac(x, y));
    }
}
