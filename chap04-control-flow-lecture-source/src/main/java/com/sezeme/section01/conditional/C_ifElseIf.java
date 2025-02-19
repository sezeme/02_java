package com.sezeme.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void testIfElseIfStatement() {
        /* if-else-if 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();

        String grade = "";  //학생 성적 저장을 위한 변수 선언 및 초기화

        if(score >= 90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는 " + score + "점이며 학점은 " + grade + "입니다.");
    }

    public void testNestedIfElseIfStatement() {
        /* 중간 점수 이상이면 학점에 + 를 부여할 수 있도록 수정 */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();

        String grade = "";  //학생 성적 저장을 위한 변수 선언 및 초기화

        if(score >= 90) {
            grade = "A";
            if(score >= 95) grade += "+";
        } else if(score >= 80) {
            grade = "B";
            if(score >= 85) grade += "+";
        } else if(score >= 70) {
            grade = "C";
            if(score >= 75) grade += "+";
        } else if(score >= 60) {
            grade = "D";
            if(score >= 65) grade += "+";
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는 " + score + "점이며 학점은 " + grade + "입니다.");
    }

    public void improveIfElseIfStatement() {
        /* 위의 메소드의 내용을 코드적으로 개선해본다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();

        String grade = "";  //학생 성적 저장을 위한 변수 선언 및 초기화

        if(score >= 90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if(score >= 60 && score % 10 >= 5 || score == 100) {
            grade += "+";
        }

        System.out.println(name + " 학생의 점수는 " + score + "점이며 학점은 " + grade + "입니다.");
    }
}