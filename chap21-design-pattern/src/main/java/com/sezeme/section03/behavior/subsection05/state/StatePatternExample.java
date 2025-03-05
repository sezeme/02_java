package com.sezeme.section03.behavior.subsection05.state;

// 1. 상태 인터페이스
interface State {
    void handle(Context context);
}

// 2. 구체적인 상태 클래스 (게임 시작 상태)
class StartState implements State {
    @Override
    public void handle(Context context) {
        System.out.println("게임이 시작되었습니다.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}

// 3. 구체적인 상태 클래스 (게임 중지 상태)
class StopState implements State {
    @Override
    public void handle(Context context) {
        System.out.println("게임이 종료되었습니다.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}

// 4. Context 클래스 (상태를 관리하는 역할)
class Context {
    private State state;

    public Context() {
        this.state = null; // 초기 상태 없음
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

// 5. 클라이언트 코드 (상태 패턴 테스트)
public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        // 상태 변경: StartState
        StartState startState = new StartState();
        startState.handle(context);
        System.out.println("현재 상태: " + context.getState());

        System.out.println("----------------------");

        // 상태 변경: StopState
        StopState stopState = new StopState();
        stopState.handle(context);
        System.out.println("현재 상태: " + context.getState());
    }
}

