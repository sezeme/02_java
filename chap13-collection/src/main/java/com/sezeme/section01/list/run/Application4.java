package com.sezeme.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* Stack */
        Stack<Integer> integerStack = new Stack<>();

        /* Stack에 값을 추가할 때는 push 메소드를 사용한다.
         * add 메소드도 사용할 수 있지만 Vector의 메소드인 push를 사용하는 것이
         * 올바른 사용법이다. */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack : " + integerStack);

        /* 스택에서 요소를 찾을 때 search 메소드 사용
         * 인덱스가 아닌 위에서부터 순번을 의미하며 가장 상단은 0이 아닌 1이다. */
        System.out.println(integerStack.search(1));

        /* 스택에서 요소를 꺼내는 메소드
         * peek() : 가장 마지막(상단)에 있는 요소 반환
         * pop() : 가장 마지막(상단)에 있는 요소 제거 후 반환
         * */
        System.out.println("peek() : " + integerStack.peek());
        System.out.println("integerStack : " + integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("integerStack : " + integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());

        /* stack 비어 있는 상태에서 pop() 호출 시 java.util.EmptyStackException 발생 */
        System.out.println("pop() : " + integerStack.pop());
    }
}