package com.taehyeon.chap04;

import java.util.Arrays;

/**
 * filter, sorted, map, collect 와 같은 여러 빌딩 블록 연산을 연결해서 복잡한 데이터 처리 파이파라인을 만들수 있음
 *
 * filter 메서드의 결과 -> sorted 메서드 결과 -> map 메서드 결과 -> collection로 연결되어 수행
 *
 * --------------------------------------------------------------------------------------------
 * |         원문               |                      중간 처리                  |   최종 처리    |
 * --------------------------------------------------------------------------------------------
 * | 스트링 소스 | 오리지날 스트림 | 필터링 처리 중간 스트림 1 | 필터링 처리 중간 스트림 1 | 집계처리 결과물 |
 * --------------------------------------------------------------------------------------------
 * | String [] |Arrays.Stream()|            filter, sorted , map               |  collection  |
 * --------------------------------------------------------------------------------------------
 *
 *
 * ex)
 * 1. List에서 특정 조건으로 filter링
 * 2. sorted를 통해 정렬
 * 3. 결과를 map으로 묶음
 * 4. collection으로 return List 화
 * ====================================================================================================================
 *
 * -- 스트림 특징
 * - 스트림은 lterator와 비슷한 역활의 반복자
 * - 데이터 처리 과정을 병렬화하면 스레드와 락에 대해 걱정할 필요가 없다
 *      L 특정 스레딩 모델에 제한되지 않기 때문
 * - 중간 처리와 최종처리로 구분
 *      L 중간 처리 : 매핑, 필터링, 소팅 (filter, map, limit, sorted, distinct)
 *      L 최종 처리 : 반복, 카운팅, 평균, 총합 등의 집계 처리를 수행 (forEach ,count, collect)
 * */
public class Stream {
    public static void main(String[] args) {
        String [] words = {"test", "test1", "test2입니다안녕하세요"};


        // 기존의 for문
        int count = 0;

        for(String s : words){
            if(s.length() > 12){
                count ++;
            }
        }

        System.out.println(count);

        // Stream을 이용한 방식
        long countTypeLong = Arrays.stream(words).filter(w -> w.length() > 12).count();

        System.out.println(countTypeLong);

        // 병렬처리를 수행하는 stream을 이용한 방식
        countTypeLong = Arrays.stream(words).parallel().filter(w -> w.length() > 12).count();

        System.out.println(countTypeLong);
    }
}
