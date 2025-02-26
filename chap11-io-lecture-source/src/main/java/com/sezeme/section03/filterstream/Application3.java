package com.sezeme.section03.filterstream;

import com.sun.source.tree.WhileLoopTree;

import javax.xml.crypto.Data;
import java.io.*;
import java.sql.SQLOutput;

public class Application3 {
     public static void main(String[] args){

         try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt"))) {

             dos.writeUTF("홍길동");
             dos.writeInt(95);
             dos.writeChar('B');

             dos.writeUTF("홍길동");
             dos.writeInt(95);
             dos.writeChar('B');

             dos.writeUTF("홍길동");
             dos.writeInt(95);
             dos.writeChar('B');
         } catch (IOException e){
             e.printStackTrace();
         }

         try (DataInputStream dis = new DataInputStream(new FileInputStream("score.txt"))) {
             while(true) {
                 System.out.println(dis.readUTF());
                 System.out.println(dis.readChar());
                 System.out.println(dis.readInt());
             }

         } catch (EOFException e) {
             /* read자료형() 메소드는 파일에서 더 이상 읽어올 값이 없는 경우
             * EOFException (End Of File)을 발생시킨다. */
             System.out.println("파일 읽기가 완료 되었습니다.");
         } catch (IOException e) {
            e.printStackTrace();
         }
     }
}
