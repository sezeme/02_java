package com.sezeme.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /* super, super()에 대해 이해할 수 있다. */

        /* Product 기본 생성자 */
        Product product1 = new Product();
        System.out.println(product1.getInformation());

        /* Product 매개변수 생성자 */
        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드2", 2389000, new Date());
        System.out.println(product2.getInformation());

        /* Computer 기본 생성자 */
        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        /* Computer 매개변수 생성자 */
        Computer computer2 = new Computer("퀼컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInformation());

        /* Product, Computer 모든 필드 초기화 생성자 */
        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2389000, new Date(), "퀼컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInformation());



    }
}