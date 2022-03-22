package com.taehyeon.react_boot.chap06;

/***
 * --배압 전략
 * - RxJava 내부에서 통지 대기 데이터를 버퍼링 하도록 동작하며, 이 버퍼 사이즈를 컨트롤하여 몇 건까지 데이터를 수신할지를 결정
 * - 어떤 데이터가 통지되고 어떤 데이터가 삭제될지가 이 버퍼 크기에 영향을 받는다
 *
 * - BUFFER : 통지할 수 있을 때까지 모든 데이터를 버퍼링 한다
 * - DROP : 통지할 수 있을때 까지 새로 생성한 데이터를 삭제한다
 * - LATEST : 생성한 최신 데이터만 버퍼링하고 생성할 때마다 버퍼링하는 데이터를 교환한다.
 * - ERROR : 통지 대기 데이터가 버퍼 크기를 초과하면 MissingBackpressureException 에러를 통지한다.
 * - NONE : 특정 처리를 수행하지 않는다. 주로 onBackPressure로 시작하는 메서드로 배압 모드를 설정할 때 사용한다.
 */
public class BackpressureExample01 {
}
