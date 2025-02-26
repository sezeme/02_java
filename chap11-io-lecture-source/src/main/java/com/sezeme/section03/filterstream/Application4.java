package com.sezeme.section03.filterstream;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {
        /* ObjectInputStream / ObjectOutputStream : 객체 단위 입출력 보조 스트림 */

        Member[] members = {
                new Member("user01", "pass01", 25, '여'),
                new Member("user02", "pass02", 30, '남'),
                new Member("user03", "pass03", 35, '여'),
        };

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("members.txt"))) {
            // 1. Member 타입의 객체를 하나씩 출력
//            for(Member member : members) {
//                oos.writeObject(member);
//            }

            // 2. Member[] 타입의 객체를 출력 : 배열도 Object이기 떄문
            oos.writeObject(members);
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("members.txt"))) {
            /*transient된 값은 입출력 시 jvm 기본값으로 표기됨 */
            Member[] inputMembers = (Member[]) ois.readObject();
            for(Member member : inputMembers) {
                System.out.println(member);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
