package com.taehyeon.react_boot.chap06;

import io.reactivex.rxjava3.processors.PublishProcessor;

/**
 * --Hot publisher
 * - timeline 이 1개이기 때문에 subscriber 가 구독 시점에 따라 데이터의 수가 달라짐
 * */
public class HotPublisherExample {
    public static void main(String[] args) {

        PublishProcessor<Integer> processor = PublishProcessor.create();
        processor.subscribe(data -> System.out.println("구독 데이터 1: " + data));
        processor.onNext(1);
        processor.onNext(2);

        processor.subscribe(data -> System.out.println("구독 데이터 2: " + data));
        processor.onNext(3);
        processor.onNext(4);

        processor.onComplete();
    }
}
