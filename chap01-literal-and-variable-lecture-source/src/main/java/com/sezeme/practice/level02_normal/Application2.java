package com.sezeme.practice.level02_normal;

public class Application2 {
    public static void main(String[] args) {
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        double sum = korean + math + english;
        double avg = sum / 3;

        System.out.println("총점 : " + (int)sum);

        System.out.println("평균 : " + (int)avg);
    }
}
