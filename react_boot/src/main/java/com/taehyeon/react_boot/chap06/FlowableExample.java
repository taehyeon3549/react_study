package com.taehyeon.react_boot.chap06;

/**
 * --Flowable 과 Observable
 * - 데이터 소스 역활은 한다
 * - 데이터를 통지하는 flowable이나 Observable을 생성하는 메서드를 연산자라고 부름
 * - 연산자
 *      |- just     : 인자의 데이터를 통지하는 Flowable/Observable 생성
 *      |- fromArray/fromIterable       : 배열이나 Iterable 에서 Flowable/Observable 생성
 *      |- fromCallable     : Callable의 처리를 실행하고 그 결과를 통지하는 Flowable/Observable 생성
 *      |- range/rangeLong      : 지정한 숫자부터 지정한 개수만큼 통지하는 Flowable/Observable 생성
 *      |- interval     : 지정한 간격마다 숫자를 통지하는 Flowable/Observable 생성
 *      |- timer        : 지정 시간 경과 후 0을 통지하는 Flowable/Observable 생성
 *      L  defer        : 구독될 때마다 새로운 Flowable/Observable 생성
 *
 * - Flowable/Observable 의 차이는 배압에서 있다
 *
 * -- 배압(Back Pressure : 백 프레셔)
 * - 정해진 임계값에 도달하면 이미 버퍼에 있는 요청의 내부 처리가 들어오는 요청을 따라잡을 때까지 버퍼에 넣는것을 일시적으로 정지하거나 막는것을 이야기함
 * - Flowable에서 데이터를 통지하는 속도가 Subscriber에서 통지된 데이터를 전달받아 처리하느 ㄴ속도 보다 빠르때 밸런스를 맞추기 위해 데이터 통지량을 제어하는 기능을 말함
 * */
public class FlowableExample {
    public static void main(String[] args) {

    }
}
