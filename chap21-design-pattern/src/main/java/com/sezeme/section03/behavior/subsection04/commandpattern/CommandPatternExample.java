package com.sezeme.section03.behavior.subsection04.commandpattern;

// 1. 커맨드 인터페이스 (모든 명령 객체가 구현해야 할 메서드)
interface Command {
    void execute();
    void undo();
}

// 2. 리시버(Receiver) - 실제 요청을 수행하는 객체
class Light {
    public void turnOn() {
        System.out.println("조명이 켜졌습니다.");
    }

    public void turnOff() {
        System.out.println("조명이 꺼졌습니다.");
    }
}

// 3. 구체적인 커맨드 클래스 (조명을 켜는 명령)
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

// 4. 구체적인 커맨드 클래스 (조명을 끄는 명령)
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}

// 5. 인보커(Invoker) - 커맨드를 실행하는 주체
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndoButton() {
        command.undo();
    }
}

// 6. 클라이언트 코드 (커맨드 패턴 테스트)
public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        // 조명을 켜기
        remote.setCommand(lightOn);
        remote.pressButton();

        // 조명을 끄기 (Undo 기능 테스트)
        remote.pressUndoButton();

        System.out.println("----------------------");

        // 조명을 끄기
        remote.setCommand(lightOff);
        remote.pressButton();

        // 조명을 다시 켜기 (Undo 기능 테스트)
        remote.pressUndoButton();

        /* Runnable 인터페이스는 실행할 작업을 객체로 캡슐화하여 커맨드 패턴과 유사하게 동작한다. */
        Runnable task = () -> System.out.println("백그라운드 작업 실행");
        Thread thread = new Thread(task);
        thread.start();
    }
}

