package com.taehyeon.chap03;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Function과 동일하게 매개 변수와 리턴
 * Argument 와 Return 값이 모두 있는 추상 메서드를 가짐
 * */
public class OperatorExample {
    public static <T> T addString(T s, UnaryOperator<T> f){
        StringBuffer buffer = new StringBuffer();

        if(s instanceof String){
            for(int i = 0; i < ((String) s).length(); i++){
                buffer.append(f.apply(s));
                buffer.append("\n");
            }
        }


        return (T) buffer.toString();
    }

    public static void main(String[] args) {

        String result = addString("tt", str -> str + "operator");

        System.out.println(result);


        UnaryOperator<String> v = str -> {
            StringBuffer buffer = new StringBuffer();

            if(str instanceof String){
                for(int i = 0; i < ((String) str).length(); i++){
                    buffer.append(str + "operator");
                    buffer.append("\n");
                }
            }
            return buffer.toString();
        };

        System.out.println(v.apply("tt"));
    }
}
