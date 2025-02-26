package com.sezeme.section03.filterstream;

import java.io.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* InputStreamReader, OutputStreamWriter : 형 변환 보조 스트림
         * 기반 스트림이 byte 스트림이고, 보조 스트림이 char 스트림인 경우 변환을 위해 사용한다.
         *  */
        System.err.println("err 테스트");
        /* 표준 스트림
        * 자바에서는 콘솔, 키보드 같은 표준 입출력 장치로부터 데이터를 입출력하기 위한 스트림을
        * System.in, System.out, System.err 와 같은 형태로 제공하고 있다.
        * => 자주 사용되는 자원에 대해 미리 생성해 둔 스트림으로 별도로 생성하지 않아도 된다. */

        /* Scanner vs BufferedReader
        * scanner : 자동형변환, 리소스 많이 사용, 느림
        * BufferedReader : 무조건 String으로 받아서 자율적으로 파싱, 자원사용량 적어서 빠름. */
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("문자열 입력 : ");
            String value = br.readLine();
            System.out.println("입력 받은 문자 : " + value);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /* 출력을 위해 동일한 방식을 사용해 볼 수 있다. */
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("출력테스트");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
