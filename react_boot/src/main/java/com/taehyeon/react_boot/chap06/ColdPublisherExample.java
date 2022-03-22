package com.taehyeon.react_boot.chap06;

import io.reactivex.rxjava3.core.Flowable;

/**
 * -- Cold Publisher
 * - 생산자는 구독을 할 때마다 처음부터 데이터를 다 보냄
 * - Publisher가 발행한 모든 데이터를 구독하는 시점이 달라도 모두다 받게 됨
 * */
public class ColdPublisherExample {
    public static void main(String[] args) {
        Flowable<Integer> flowable = Flowable.just(1,2,3,4);

        flowable.subscribe(data -> System.out.println("구독 데이터 1: " + data));

        flowable.subscribe(data -> System.out.println("구독 데이터 2: " + data));
    }
}
