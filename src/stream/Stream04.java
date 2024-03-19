package stream;

public class Stream04 {
    public static void main(String[] args) {

/*
        ★ 중간 연산
        - Stream → Stream : 연쇄적인 파이프라인 연결
        - 지연 평가 : 최종 연산 전에는 실행되지 않음
        filter : 조건에 맞는 요소만 남김
        map : 매개변수의 함수에 맞게 요소를 반환
        sorted : 요소를 정렬(Comparator)
        distinct : 중복되지 않는 고유값만 남김
        limit : 스트림 처음부터 n개까지만 남김
        skip : 스트림 처음부터 n개까지 버림
        peek : 각 요소를 순회하면서 Comsumer 작업을 실행(Stream에 영향을 끼치지 않음 → 지연 평가)
        ...

        ★ 최종 연산
        - 실제로 계산을 실행하고, 리턴 값을 갖거나 Side Effect를 발생시킴
        - 최종 연산 시 스트림을 모두 소모해서 더 이상 스트림 사용 불가
        forEach : 각 요소를 순회하면서 Comsumer 작업을 실행
        collect : 스트림 요소를 리스트, 셋, 맵 등으로 반환
        reduce : 스트림 요소를 축소해서 하나의 결과로 반환
        count : 스트림 요소 개수를 반환
        anyMatch : 주어진 조건을 만족하는 요소가 하나라도 있는지 여부 <-> allMatch
        findAny : 스트림에서 조건이 맞는 (임의의) 요소를 반환
        findFirst : 스트림에서 조건이 맞는 (첫 번째) 요소를 반환
        min : Comparator에 맞는 최솟값 반환
        max : Comparator에 맞는 최댓값 반환
        ...
 */
    }
}
