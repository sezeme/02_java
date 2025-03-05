package com.sezeme.section03.behavior.subsection06.templatemethod;

// 1. 템플릿 메서드 패턴의 기본 구조
abstract class Game {
    // 하위 클래스에서 구현해야 할 메서드 (추상 메서드)
    abstract void start();
    abstract void play();
    abstract void end();

    // 템플릿 메서드 (알고리즘의 흐름을 정의)
    public final void playGame() {
        System.out.println("게임을 준비합니다.");
        start();
        play();
        end();
        System.out.println("게임이 종료되었습니다.");
    }
}

// 2. 구체적인 게임 클래스 (축구 게임)
class Football extends Game {
    @Override
    void start() { System.out.println("축구 게임이 시작됩니다."); }
    @Override
    void play() { System.out.println("축구를 하는 중..."); }
    @Override
    void end() { System.out.println("축구 게임이 종료되었습니다."); }
}

// 3. 구체적인 게임 클래스 (농구 게임)
class Basketball extends Game {
    @Override
    void start() { System.out.println("농구 게임이 시작됩니다."); }
    @Override
    void play() { System.out.println("농구를 하는 중..."); }
    @Override
    void end() { System.out.println("농구 게임이 종료되었습니다."); }
}

// 4. 클라이언트 코드 (템플릿 메서드 패턴 테스트)
public class TemplateMethodPatternExample {
    public static void main(String[] args) {
        Game football = new Football();
        football.playGame();

        System.out.println("----------------------");

        Game basketball = new Basketball();
        basketball.playGame();
    }
}