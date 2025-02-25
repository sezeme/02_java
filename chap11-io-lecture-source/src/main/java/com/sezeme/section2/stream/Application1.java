package com.sezeme.section2.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* FileInputStream */
        FileInputStream fis = null;
        try {
            /* 읽어올 파일 대상이 존재하지 않는 경우 FileNotFoundException 발생하므로 처리 */
            fis = new FileInputStream("testInputStream.txt");

            /* read() : 파일에 기록 된 값을 순차적으로 읽어오고 더 이상 읽어올 값이 없으면 -1 반환 */
//            int value;
//            while((value = fis.read()) != -1) {
//                System.out.println((char) value);
//            }

            /* byte 배열을 이용해서 한 번에 데이터를 읽어올 수 있다. */
            byte[] bar = new byte[100];
            fis.read(bar);
            System.out.println(Arrays.toString(bar));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(fis != null) {
                try {
                    /* 자원(스트림) 반납이 필수적인 이유?
                     * 1. 장기간 실행 중인 프로그램에서 스트림을 닫지 않으면 누수(leak)가 발생한다.
                     * 2. 버퍼의 잔류 데이터가 남은 상태에서 추가로 스트림을 사용하면 데드락(deadlock)이 발생한다.
                     * */
                    fis.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}