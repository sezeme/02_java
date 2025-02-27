package com.sezeme.section01.list.comparator;

import com.sezeme.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {


    /* 비교대상 두 인스턴스의 price가 오름차순 정렬 되기 위해서는 앞의 가격이 더 작은 가격이어야 한다.
    * 만약 뒤의 가격이 더 작으면 두 인스턴스의 순서를 변경해야 한다.
    * 두 인스턴스의 교환하라는 신호로 양수를 반환하면 정렬 시 순서를 변경하는 조건으로 사용한다.
    * 오름차순 : 앞에 작은 값, 뒤에 큰 값 -> 음수가 나와야 함. */
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
