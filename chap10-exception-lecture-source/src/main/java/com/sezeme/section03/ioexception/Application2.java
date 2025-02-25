package com.sezeme.section03.ioexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /* try with resource 구문의 문접을 이해하고 사용할 수 있다.
        * jdk 1.7에서 추가된 문법으로 close 해야 하는 인스턴스를 try 옆 소괄호에서 생성하면
        * 해당 블럭 종료 시 자동 close 작업이 일어난다. */

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
