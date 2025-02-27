package com.sezeme.section03.map;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /* 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용 */
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");

        } catch (IOException e) {
            e.printStackTrace();
        }

        //파일로부터 읽어와서 Properties에 기록
        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));

            prop2.loadFromXML(new FileInputStream("driver.xml"));

            /* Properties의 모든 키 값 목록을 대상 스트림에 내보내기 한다. */
            System.out.println("prop 확인");
            prop2.list(System.out);

            System.out.println("prop 확인");
            System.out.println(prop.getProperty("driver"));
            System.out.println(prop.getProperty("url"));
            System.out.println(prop.getProperty("user"));
            System.out.println(prop.getProperty("password"));

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
