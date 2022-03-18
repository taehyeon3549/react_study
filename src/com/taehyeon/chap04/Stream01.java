package com.taehyeon.chap04;

import java.util.Arrays;

public class Stream01 {
    public static void main(String[] args) {
        String [] words = new String[]{"aed", "bsed", "c"};

        int count = 0;
        for(String w : words){
            if(w.length() > 2){
                count ++;
            }
        }

        System.out.println(count);

        long counts = Arrays.asList(words).stream().filter(s -> s.length() > 2).count();

        System.out.println(counts);


    }
}
