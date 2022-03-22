package com.taehyeon.react_boot.chap06;

/**
 * --리액티브 프로그래밍 이란?
 * - 데이터를 받은 시점에 반응해 이를 처리하는 프로그램
 *
 * -- 비동기 방식
 * - 동기 : 클라이언트가 서버에 요청 -> 응답을 받기 전까지 블로킹
 *      L 현재 요청을 수행하는 스레드가 다른 job을 하지 못하고 응답 전까지 대기한다는 의미
 * - 비동기 : 현재 스레드가 블로킹 되지 않기 때문에 다른 job을 계속 할수 있음
 * - 응답을 기다리지 않기 때문에 논블로킹
 *
 *
 * -- 리액티브 스트림
 * - 논블로킹 백 포레셔를 이용한 비동기 데이터 처리의 표준
 * - 비동기 스트림 처리를 위한 라이브러리 표준 인터페이스 사양
 * - 4개의 인터페이스를 제공 :
 *      |- publisher
 *              |- 데이터를 통지하는 생산자(데이터를 생성하고 통지하는 역활)
 *              L Subscriber의 구독을 받기 위한 subscribe API만 존재
 *      |- Subsciber
 *              |- 데이터를 받아 처리하는 소비자(통지된 데이터를 전달 받아서 처리)
 *              |- Subscription을 받는 onSubscribe API
 *              L onNext, onError, onComplete
 *      |- Subscription
 *              |- 전달 받을 데이터의 개수를 요청하고 구독을 해지
 *              |- n개의 데이터를 요청하기 위한 request
 *              L 구독을 취소하기 위한 cancel
 *      L  processor
 * - 용어 정리
 *      |- 생산자 : 데이터를 생성해서 내보내는 쪽
 *      |- 데이터 통지 : 생산자가 데이터를 내보내는 행위
 *      |- 소비자 : 생산자가 보내는 데이터를 받아서 처리하는 쪽
 *      L  데이터 소비 : 소비자가 데이터를 처리하는 것
 * - RxJava는 리액티브 스트림 표준 인터페이스 사양을 구현한 라이브러리(RxSwift, RxKotlin, RxJs)
 * - Flow API
 *
 * -- 리액티브 스트림의 프로세스 흐름 (백 프레셔 완성 방법)
 * - 1. subscriber -> (구독요청) -> Publisher -> (Subscription 전달) -> subscriber
 * - 2. Subscription 전달 매개체
 * - 3. subscriber -> (request(n) 요청) -> Subscription -> Publisher -> (data 전달) -> Subscription
 *      -> *Subscriber가 onNext() 호출 -> (Subscription 데이터 전달) ->*작업끝 -> *Subscription이 onComplete 시그널 전달
 *
 * - 백프레셔란
 *      |- publisher 는 subscriber의 자원 상태를 모르기 때문에 무작정 자료만 넘겨줌 ( 장애 요소 )
 *      |- 그렇기때문에 subscriber가 데이터의 크기를 정해 요청해서 publisher가 해당 크기만큼만 주는 방식
 *      L 다이나믹 풀 방식의 데이터 요청을 통해서 Subscriber가 수용할 수 있는 만큼 데이터를 요청하는 방식
 *
 * -- Cold Publisher
 * - 생산자는 구독을 할 때마다 처음부터 데이터를 다 보냄
 * - Publisher가 발행한 모든 데이터를 구독하는 시점이 달라도 모두다 받게 됨
 * */
public class Reactive {
}
