package com.sezeme.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* ArrayList
        * : 배열은 크기를 변경하는 것이 불가능하고 요소의 추가/삭제/정렬 등이 복잡하다.
        * 이러한 기능을 메소드로 구현해서 제공하고 있으며 단, 속도가 빨라지는 것은 아니다.
        *  */

        /* 다형성을 이용해서 상위 레퍼런스로 ArrayList 객체를 참조할 수 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하므로
        * 보다 유연한(자기들끼리의 타입 변경 List to Set) 코드를 작성할 수 있다. */
        ArrayList alist = new ArrayList();
        List list = new ArrayList<>();
        Collection clist = new ArrayList();

        /* String 타입의 Element만 저장하는 ArrayList 생성 */
        List<String> slist = new ArrayList<>();

        /* 모든 타입을 저장할 수 있어 타입 안정성이 떨어진다. -> 이렇게는 잘 사용 x */
        alist.add("hello");
        alist.add(10);
        alist.add(new Date());

        /* String 타입만 취급하도록 컴파일러가 체크한다. */
        slist.add("apple");
//        slist.add(10);
        slist.add("orange");
        slist.add("banana");

        /* add 메소드로 (1) 저장한 순서대로 데이터가 저장 되며
        * (2) 중복 데이터라도 저장된다. */
        System.out.println("slist: " + slist);
        System.out.println("slist.size(): " + slist.size());

        for(int i = 0; i<slist.size(); i++){
            System.out.println("slist.get("+i+"): "+ slist.get(i));
        }

        for(String s : slist) {
            System.out.println("s : " + s);
        }

        /* add 메소드의 기본 사용법은 맨 끝에 추가하는 것이지만
        * 원하는 위치 인덱스를 전달해서 추가할 수도 있다. */
        slist.add(1, "mango");
        System.out.println("slist: "  + slist);

        slist.set(2, "grape");
        System.out.println("slist: "  + slist);

        slist.remove(1);
        System.out.println("slist: "  + slist);

        /* 요소 정렬 */
        Collections.sort(slist);
        System.out.println("slist : "+ slist);


    }
}
