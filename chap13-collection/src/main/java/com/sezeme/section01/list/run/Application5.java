package com.sezeme.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* Queue */
        Queue<String> que = new LinkedList<>();

        /* 큐에 데이터를 넣을 때는 offer 메소드를 사용한다. */
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que : " + que);

        /* 큐에서 데이터를 꺼내는 메소드
         * peek() : 큐의 가장 앞에(먼저 들어온) 요소를 반환
         * poll() : 큐의 가장 앞에(먼저 들어온) 요소를 반환하고 제거
         * */
        System.out.println("peek() : " + que.peek());
        System.out.println("que : " + que);

        System.out.println("poll() : " + que.poll());
        System.out.println("que : " + que);

        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        /* 큐에서 반환 할 값이 없을 경우 null 반환 */
        System.out.println("poll() : " + que.poll());
    }
}