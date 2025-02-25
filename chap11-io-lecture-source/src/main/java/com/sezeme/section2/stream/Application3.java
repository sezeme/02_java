package com.sezeme.section2.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /* FileOutputStream */

        /* 경로 문제 없이 파일이 존재하지 않을 경우에는 자동으로 파일이 생성 되지만
         * 존재하지 않는 경로가 포함 되면 FileNotFoundException이 발생한다. */
        try (FileOutputStream fos = new FileOutputStream("testOutputStream.txt", true)) {

            fos.write(97);

            byte[] bytes = new byte[] {98, 99, 100, 101, 102, 10}; // 10 -> \n
            fos.write(bytes);

            fos.write(bytes, 1, 3);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}