package com.sezeme.section03.ioexception;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            /*FileReader 생성자에 throws FileNotFoundException이 있으므로
            * 호출부에서는 예외처리가 강제화 된다. -> try-catch 블럭 사용 */
            br = new BufferedReader(new FileReader("test.txt"));

            /* readLine() 메소드에 throws IOException이 있으므로 예외 처리 강제화*/
            String s;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            /* IOException은 입출력과 관해 추상화 된 클래스로 FileNotFoundException도 IOException의 후손이다. */
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            /* 오류가 발생하거나 발생하지 않거나 무조건 동작해야 하는 구문
            * 일반적으로 IO에서는 사용한 자원을 반납하는 용도로 사용한다. */
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
