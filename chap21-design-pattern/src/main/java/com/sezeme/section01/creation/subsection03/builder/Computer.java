package com.sezeme.section01.creation.subsection03.builder;

import java.util.stream.Stream;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    /* 자기 자신을 반환 */
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void showSpecs() {
        System.out.println("CPU: " + CPU + ", RAM: " + RAM + ", storage: " + storage);
    }

    public static void main(String[] args) {
        /* computer 내부에 소속된 builder()객체를 통해 buile한다. */
        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();
        computer.showSpecs();

        /* Java API 예제 */
        StringBuilder sb = new StringBuilder("hello")
                .append("world")
                .append("!!");

        Stream<String> stream = Stream.<String>builder()
                .add("hello")
                .add("world")
                .build();
    }
}
