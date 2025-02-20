package com.sezeme.section3.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* 얕은 복사를 활용하여 매개변수와 리턴 값으로 활용할 수 있다. */
        String[] names = { "홍길동", "유관순", "신사임당" };
        print(names);

        System.out.println("names.hashCode() : " + names.hashCode());
        System.out.println("names : " + Arrays.toString(names));

        String[] returnAnimals = getAnimal();
        System.out.println("returnAnimals.hashCode() : " + returnAnimals.hashCode());
        System.out.println("returnAnimals : " + Arrays.toString(returnAnimals));

    }

    public static void print(String[] sarr) {
        System.out.println("sarr.hashCode() : " + sarr.hashCode());
        System.out.println("sarr : " + Arrays.toString(sarr));
        sarr[1] = "강감찬";
    }

    public static String[] getAnimal() {
        String[] animals = { "낙타", "호랑이", "나무늘보" };
        System.out.println("animals.hashCode() : " + animals.hashCode());
        return animals;
    }

}