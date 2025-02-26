package com.sezeme.section02.extend;

public class RabbitFarm <T extends Rabbit> {
    private T rabbit;

    public RabbitFarm() { }
    public RabbitFarm(T rabbit) { this.rabbit = rabbit; }

    public T getRabbit() {
        return rabbit;
    }

    public void setRabbit(T rabbit) {
        this.rabbit = rabbit;
    }
}
